import java.util.Scanner;

public class For01_Intro {
		public static void main(String[] args) {
			//for(�ʱⰪ; ���ǽ�; ������){
//			       ������ �ڵ�
//			{
//			for(int i = 1; i < 4; i++)
//				System.out.println(i);
			
			//1���� ����ڿ��� �Է¹��� ������ �ݺ�
			
//			Scanner sc = new Scanner(System.in);
//			
//			int num = Integer.parseInt(sc.nextLine());
//			for(int i = 1 ; i <= num ; i++) {
//				System.out.println(i);
//			}
			
			//1~10���� ���,¦���� ��µ��� �ʰ�.
			
			for(int i = 1 ; i <= 10 ; i++) {
				if(i % 2 == 0) {
					continue;    // break�� ���.  
				}
				System.out.println(i);
			}
		}
}
