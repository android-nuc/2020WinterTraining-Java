package code8_3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\cont.txt");
        File out = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\img\\cont.txt");
        FileInputStream inputStream = new FileInputStream(file);
        FileOutputStream outputStream = new FileOutputStream(out);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        OutputStreamWriter outputStreamWriter =  new OutputStreamWriter(outputStream, "UTF-8");
        while (inputStreamReader.ready()){
            char temp = (char)inputStreamReader.read();
            outputStreamWriter.write(temp);
            System.out.println(temp);
        }
        outputStreamWriter.append("123456");
        inputStreamReader.close();  // 注意顺序

        inputStream.close();
        outputStreamWriter.close();
        outputStream.close();
    }
}
