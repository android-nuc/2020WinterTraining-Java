package code8_2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\cont.txt");
        File out = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\img\\cont.txt");
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(out);

        int size = inputStream.available();
        for (int i = 0; i < size; i++) {
            byte temp = (byte) inputStream.read();
            outputStream.write(temp);
            System.out.println((char) temp);
        }
        inputStream.close();
        outputStream.close();
    }
}
