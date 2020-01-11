package code9_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GET get = new GET();
        get.send("http://fanyi.youdao.com/", "", "C:\\Users\\Administrator\\Desktop\\JavaTrain\\mymp3.mp3");


    }
}
