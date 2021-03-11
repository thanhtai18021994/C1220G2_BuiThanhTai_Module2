package _15_io_file.practice.practice1;


import java.io.*;

public class Ex1 {
    public static final String FILE_PATH="D:\\Web\\CodeGym2\\src\\_15_io_file\\practice\\practice1\\test";
    public static void main(String[] args) throws IOException {
       try{
           File file=new File(FILE_PATH);
           System.out.println(file.exists());
           FileReader fileReader=new FileReader(file);
           BufferedReader bufferedReader=new BufferedReader(fileReader);
           String line;
           while ((line=bufferedReader.readLine())!=null){
               System.out.println(line);
           }
       }catch (IOException e){
           System.out.println("Error ::::::::::"+e.getMessage());
       }
    }
}
