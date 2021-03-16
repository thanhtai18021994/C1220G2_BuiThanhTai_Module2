package _00_practice_java.iofile;

import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream=null;
//        DataOutputStream dataInputStream=null;
        try{
            fileOutputStream=new FileOutputStream("src\\_00_practice_java\\iofile\\file2");
//            dataInputStream=new DataOutputStream(fileOutputStream);
          fileOutputStream.write(65);
          fileOutputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileOutputStream.close();
//                dataInputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
