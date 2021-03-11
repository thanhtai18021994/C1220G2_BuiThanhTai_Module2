package _16_byte_stream.excercise;

import java.io.*;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ByteStream extends Exception {
    public ByteStream(String message) {
        super(message);
    }

    public static void add(String path) {
        List<Product> list=displayProduct(path);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter code product");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of product");
        String name = scanner.nextLine();
        System.out.println("Enter product maker");
        String maker = scanner.nextLine();
        System.out.println("Enter price product");
        double price = scanner.nextDouble();
        Product product = new Product(code, name, maker, price);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        list.add(product);
        try {
            fileOutputStream = new FileOutputStream(path);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> displayProduct(String path) {
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(path);
            objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static   void searchProduct(String path)  {
        List<Product> myList = displayProduct(path);
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter index product:");
            int index=scanner.nextInt();
            checkIndex(path,index);
            System.out.println(myList.get(index).toString());
        } catch (ByteStream byteStream) {
            byteStream.printStackTrace();
        }
    }
    public static void checkIndex(String path,int index) throws ByteStream{
        List<Product> myList = displayProduct(path);
        if(index>myList.size()||index<0){
            throw new ByteStream("Index invalid");
        }
    }


    public static void main(String[] args) {
        String path = "src\\_16_byte_stream\\excercise\\Source";
        add(path);
        for (Product product:displayProduct(path)){
            System.out.println(product.toString());
        }
        searchProduct(path);
    }
}
