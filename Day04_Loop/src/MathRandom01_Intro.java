
public class MathRandom01_Intro {
	public static void main(String[] args) {
		// ������ �� ����
		// Math.random() 0.0 ~ 1.0������ �Ǽ���(double) ������ ������ �ݴϴ�.
//		System.out.println(Math.random());

		// 1~45������ ������ ���� 6�� ����Ͻÿ�. (Math.random() * (�ִ밪 - �ּҰ� + 1)) + �ּҰ�
		
            
		for (int i = 0; i < 6 ; i++) {
			int ran = (int)(Math.random() * (45 - 1 + 1)) + 1;
			System.out.println(ran);
		}

	}
}
