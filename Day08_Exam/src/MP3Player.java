import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class MP3Player {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("mysong.mp3");
			Player PlayMP3 = new Player(fis);
			PlayMP3.play();
		} catch (Exception e) {              //������ ����ִ� �ҽ�
			e.printStackTrace();
		}
	}
}
