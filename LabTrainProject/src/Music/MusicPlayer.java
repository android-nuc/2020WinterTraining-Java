package Music;

import code9_1.GET;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class MusicPlayer {

    public static void main(String[] args) throws IOException, JavaLayerException {
        GET get = new GET();
        String path = "C:\\Users\\Administrator\\Desktop\\JavaTrain\\mymp3.mp3";
        get.send("http://10.0.117.43/mangzhong.mp3", "", path);

        File mp3File = new File(path);
        System.out.println(mp3File.exists());

        if (mp3File.exists()) {
            InputStream inputStream = new FileInputStream(path);
            Player player = new Player(inputStream);
            player.play();
        }

    }
}
