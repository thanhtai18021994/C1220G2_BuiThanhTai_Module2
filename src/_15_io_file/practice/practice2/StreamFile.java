package _15_io_file.practice.practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamFile {
    public void addFile(File file) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();
        Staff staff = new Staff(name, age, salary);
        write(file,staff);
    }


    public List read(File file) {
        List<Staff> myList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str;
            String[] temp;
            while ((str = bufferedReader.readLine()) != null) {
                temp = str.split(",");
                myList.add(new Staff(temp[1], (Integer.parseInt(temp[2])), (Double.parseDouble(temp[3]))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return myList;
    }

    public void display(File file) {
        for (Object staff : read(file)) {
            System.out.println(staff.toString());
        }
    }

    public void write(File file, Staff staff) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(staff.showInfor());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteElementFile(File file) {
        List<Staff> mylist = read(file);
        file.delete();
        System.out.println("Enter index that you'd like delete:");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        mylist.remove(index);
        for (int i = 0; i < mylist.size(); i++) {
            write(file, mylist.get(i));
        }
    }
    public void updateFile(File file){
        List<Staff> myList=read(file);
        file.delete();
        System.out.println("Enter index that you'd like update:");
        Scanner scanner=new Scanner(System.in);
        int index=scanner.nextInt();
        System.out.println("Enter new name:");
        String name=scanner.nextLine();
        System.out.println("Enter new age");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter salary");
        double salary=Double.parseDouble(scanner.nextLine());
        myList.set(index,new Staff(name,age,salary));
        for (int i = 0; i < myList.size(); i++) {
            write(file, myList.get(i));
        }
    }

    public void deleteFile() {
        File file = new File("src\\_15_io_file\\practice\\practice2\\FileData");
        file.delete();
    }

    public static void main(String[] args) {
        File file = new File("src\\_15_io_file\\practice\\practice2\\fileMy");
        StreamFile streamFile = new StreamFile();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of staff that you'd like add:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter staff " + (i + 1));
            streamFile.addFile(file);
        }
        streamFile.read(file);
        streamFile.deleteElementFile(file);
    }
}
