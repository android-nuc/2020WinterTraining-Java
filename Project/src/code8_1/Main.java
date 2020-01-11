package code8_1;

import java.io.File;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\mangzhong.mp3");
        if(!file.isDirectory())
            file = new File(file.getParent());
        File[] listFiles = file.listFiles();
        System.out.println(listFiles.length);
        for (File f:listFiles) {
            System.out.println(f.getName());
        }
    }
}
