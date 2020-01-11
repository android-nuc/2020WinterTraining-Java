package OnlineMusicPlayer;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayLocalMP3 {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JavaTrain\\img\\cont.mp3");
        FileInputStream fileInputStream= new FileInputStream(file);
        Player player = new Player(fileInputStream);
        player.play();
    }
}
