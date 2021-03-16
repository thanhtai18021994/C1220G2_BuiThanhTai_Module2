package _00_practice_java.iofile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class characterfile {
    public static void main(String[] args) {
        File file=new File("src\\_00_practice_java\\iofile\\file1");
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWriter=new FileWriter(file,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("b"+","+"dalda");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
