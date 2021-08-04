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
		sc.close(); // 사용하고 닫아주기
		FileInputStream fis = null;

		try {
			switch (num) {
			case 1:
				fis = new FileInputStream("바라만 본다.mp3");
				break;
			case 2:
				fis = new FileInputStream("신호등.mp3");
				break;
			case 3:
				fis = new FileInputStream("Next Level.mp3");
				break;
			}
			Player PlayMP3 = new Player(fis);
			PlayMP3.play();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
