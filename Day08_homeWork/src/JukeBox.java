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
		sc.close(); // ����ϰ� �ݾ��ֱ�
		FileInputStream fis = null;

		try {
			switch (num) {
			case 1:
				fis = new FileInputStream("�ٶ� ����.mp3");
				break;
			case 2:
				fis = new FileInputStream("��ȣ��.mp3");
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
