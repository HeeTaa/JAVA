import java.util.Scanner;

public class For01_Intro {
		public static void main(String[] args) {
			//for(초기값; 조건식; 증감문){
//			       실행할 코드
//			{
//			for(int i = 1; i < 4; i++)
//				System.out.println(i);
			
			//1부터 사용자에게 입력받은 수까지 반복
			
//			Scanner sc = new Scanner(System.in);
//			
//			int num = Integer.parseInt(sc.nextLine());
//			for(int i = 1 ; i <= num ; i++) {
//				System.out.println(i);
//			}
			
			//1~10까지 출력,짝수는 출력되지 않게.
			
			for(int i = 1 ; i <= 10 ; i++) {
				if(i % 2 == 0) {
					continue;    // break와 비슷.  
				}
				System.out.println(i);
			}
		}
}
