import java.io.FileInputStream;
import java.util.Scanner;
import javazoom.jl.player.Player;

public class JukeBox {
	public static void main(String[] args) {

		System.out.println("☆☆ 쥬크박스 ☆☆");
		System.out.println("플레이 하고 싶은 음악을 선택해주세요.");
		System.out.println("1.바라만 본다");
		System.out.println("2.신호등 ");
		System.out.println("3.Next Level");

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			try {
				FileInputStream fis = new FileInputStream("바라만 본다.mp3");
				Player PlayMP3 = new Player(fis);
				PlayMP3.play();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				FileInputStream fis = new FileInputStream("신호등.mp3");
				Player PlayMP3 = new Player(fis);
				PlayMP3.play();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 3:
			try {
				FileInputStream fis = new FileInputStream("Next Level.mp3");
				Player PlayMP3 = new Player(fis);
				PlayMP3.play();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}

	}

}
