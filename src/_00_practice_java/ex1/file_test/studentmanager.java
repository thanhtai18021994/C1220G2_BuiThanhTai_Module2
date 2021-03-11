package _00_practice_java.ex1.file_test;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class studentmanager {


    public void addStudent() {
        List<student> studentList = new ArrayList<>();
        for (int i = 0 ; i <3 ; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("ten");
            String name = scanner.nextLine();
            System.out.println("tuoi");
            int age = Integer.parseInt(scanner.nextLine());

            studentList.add(new student(age, name));
        }
        write(studentList);

    }

    public void display(){
        System.out.println(readStudent());
    }

    public void write(List<student> studentList) {
        File file = new File("src\\test\\student.csv");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (student student1 : studentList){
                bufferedWriter.write(student1.getInfor());
                bufferedWriter.newLine();
            }
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

    public List<student> readStudent(){
        List<student> studentList = new ArrayList<>();
        File file = new File("src\\test\\student.csv");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String str ;
            String[] temp;
            while ((str = bufferedReader.readLine()) != null){
                temp = str.split(",");
                System.out.println(str);
                student student = new student(Integer.parseInt(temp[1]),temp[0]);
                studentList.add(student);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }
}
