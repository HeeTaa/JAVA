public class Quiz_Bigger {

	public static int bigger(int x, int y) {
		if (x > y) {
			return x;
		} else if (y > x) {
			return y;
		} else{        //���� void�� �ƴ� ���ϰ��� �־���ϴ� �޼��忡�� else if �� �Ἥ 
			           //���ϰ��� ��ã�� ����� ���� �ִٸ� ������ �߻��Ѵ�.
			return 0;
		} 
	}

	public static void main(String[] args) {
		// �� ������ ���ڷ� �޾Ƽ� �� -> �� ū ���� ��ȯ�ϴ� �޼��带 ����ÿ�.
		// ����, �� ���� ���ٸ� 0�� ��ȯ
		
		System.out.println(bigger(5, 5));

	}
}
