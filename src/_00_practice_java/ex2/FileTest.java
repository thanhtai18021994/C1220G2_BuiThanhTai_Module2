package _00_practice_java.ex2;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {
        File file=new File("hello.txt");
        if(file.isFile()){
            System.out.println("this s file"+file.getAbsolutePath());
        }else {
            System.out.println("not found");
            file.createNewFile();
        }
    }
}
