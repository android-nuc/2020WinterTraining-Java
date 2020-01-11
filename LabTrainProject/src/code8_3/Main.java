package code8_3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\123.txt");
        File out = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\1\\123.txt");

        InputStream inputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "GBK");

        OutputStream outputStream = new FileOutputStream(out);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");


        while (inputStreamReader.ready()) {
            int temp = inputStreamReader.read();
            System.out.println((char) temp);

            outputStreamWriter.write(temp);

        }
        outputStreamWriter.append("123");
//        outputStreamWriter.flush();
        inputStreamReader.close();
        inputStream.close();
        outputStreamWriter.close();
        outputStream.close();


    }
}
