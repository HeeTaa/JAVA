import java.io.FileInputStream;
import java.util.Scanner;
import javazoom.jl.player.Player;

public class JukeBox {
	public static void main(String[] args) {

		System.out.println("�١� ��ũ�ڽ� �١�");
		System.out.println("�÷��� �ϰ� ���� ������ �������ּ���.");
		System.out.println("1.�ٶ� ����");
		System.out.println("2.��ȣ�� ");
		System.out.println("3.Next Level");

		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());

		switch (num) {
		case 1:
			try {
				FileInputStream fis = new FileInputStream("�ٶ� ����.mp3");
				Player PlayMP3 = new Player(fis);
				PlayMP3.play();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case 2:
			try {
				FileInputStream fis = new FileInputStream("��ȣ��.mp3");
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
