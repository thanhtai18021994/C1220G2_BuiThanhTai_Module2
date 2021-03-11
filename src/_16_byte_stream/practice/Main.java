package _16_byte_stream.practice;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffers=new byte[1024];
            int lenght;
        } finally {

        }
    }
}
