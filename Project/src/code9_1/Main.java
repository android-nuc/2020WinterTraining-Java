package code9_1;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GET get = new GET();
        String str = get.send("http://10.0.117.43/mangzhong.mp3", "");
        System.out.println(str);
    }
}
