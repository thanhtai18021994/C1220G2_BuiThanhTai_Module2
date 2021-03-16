package _review_oop.lap_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FruitManage {
    public void createProduct(List<Fruit> fruitList) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name of fruit:");
            String name = scanner.nextLine();
            System.out.println("Enter price of fruit");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter quality of fruit");
            int quality = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter origin of fruit:");
            String origin = scanner.nextLine();
            Fruit fruit = new Fruit(name, price, quality, origin);
            fruitList.add(fruit);
            System.out.println("Do you want to continue ? Y/N");
            String choose = scanner.nextLine();
            choose = choose.toUpperCase();
            switch (choose) {
                case "Y":
                    createProduct(fruitList);
                    break;
                case "N":
                    return;
                default:
                    System.out.println("Enter again ! Y/N");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewOder() {
        List<Fruit> fruitList = new ArrayList<>();
        createProduct(fruitList);
        File file =new File("src\\_review_oop\\lap_3\\Bill");
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Name"+","+","+"Price"+","+"Quality"+","+"Amount");
            bufferedWriter.newLine();
            for (Fruit fruit:fruitList){
                bufferedWriter.write(fruit.getName()+","+fruit.getPrice()+","+fruit.getQuality()+","+fruit.getAmount());
                bufferedWriter.newLine();
            }
            double total = 0;
            for (int i=0;i<fruitList.size();i++){
                total+=fruitList.get(i).getAmount();
            }
            bufferedWriter.write("Total:"+total);
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
