import java.util.Scanner;

public class While01_Intro {
	public static void main(String[] args) {
//			while�ݺ��� ,true/false ������� ������ ���ǹ�
//			�ʱⰪ
//			while(���ǹ�) {
//				�ݺ��� �ڵ�
//				}
//			int i = 1;
//			while(i <= 5) {
//				System.out.println(i);
//				i++;
//			}
		
//		1~10���� ����ϵ�, ����ڰ� �Է��� ���� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		int i = 1;
		while (i <= 10) {

			if (i == num) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	} 

}
