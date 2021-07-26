import java.util.Scanner;

public class While01_Intro {
	public static void main(String[] args) {
//			while반복문 ,true/false 결과값이 나오는 조건문
//			초기값
//			while(조건문) {
//				반복할 코드
//				}
//			int i = 1;
//			while(i <= 5) {
//				System.out.println(i);
//				i++;
//			}
		
//		1~10까지 출력하되, 사용자가 입력한 값은 빼고 출력하세요.
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
