package _15_io_file.excercise.excercise1;

import java.io.*;

public class IOFile {
    public static final String FILE_PATH = "D:\\Web\\CodeGym2\\src\\_15_io_file\\excercise\\excercise1\\text1";
    public static final String FILE_PATH2 = "D:\\Web\\CodeGym2\\src\\_15_io_file\\excercise\\excercise1\\TargetFile";

    public static void main(String[] args) throws IOException {
       try {
           FileWriter fileWriter = new FileWriter(FILE_PATH,false);
           BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
           bufferedWriter.write("a");
           bufferedWriter.newLine();
           bufferedWriter.write("b");
           bufferedWriter.newLine();
           bufferedWriter.write("c");
           bufferedWriter.close();
           BufferedWriter bufferedWriter2 =new BufferedWriter(new FileWriter(FILE_PATH2));
           BufferedReader bufferedReader=new BufferedReader(new FileReader(FILE_PATH));
           String line;
           while ((line=bufferedReader.readLine())!=null){
               bufferedWriter2.write(line);
               bufferedWriter2.newLine();
           }
           bufferedReader.close();
           bufferedWriter2.close();
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}
