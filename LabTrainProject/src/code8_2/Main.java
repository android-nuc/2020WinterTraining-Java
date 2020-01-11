package code8_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\123.txt");
        File out = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\1\\123.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(out);
        int size = fileInputStream.available();
        for (int i = 0; i < size; i++) {
            int temp = fileInputStream.read();
            fileOutputStream.write(temp);
            System.out.println((char) temp);
        }
        fileInputStream.close();
        fileOutputStream.close();

    }
}
