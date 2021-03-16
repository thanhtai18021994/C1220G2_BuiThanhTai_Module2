package _00_practice_java.test_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListFile {
    private static final String FILE_PATH = "src\\_00_practice_java\\test_stream\\FileTest";

    public static void addFile(List<Person> personList) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < personList.size(); i++) {
               bufferedWriter.write(personList.get(i).toString());
               bufferedWriter.newLine();
               bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        List<Person>people=new ArrayList<>();
        people.add(new Student("hai",123,8));
        people.add(new Student("tuan",34,10));
        people.add(new Student("duong",123,8));
        people.add(new Teacher("tien",123,5000));
        people.add(new Teacher("lan",123,400));
        addFile(people);
    }
}
