
public class Exam02_Modify {
	public static void main(String[] args) {
			
		// 배열 값의 수정
//		int[] arr = {1, 2, 3, 4, 5}
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		
		//char형 배열에 hello를 담고 안녕하세요 라고 수정해 출력
		char[] arrC = {'h', 'e', 'l', 'l', 'o'};
		char[] temp = {'안', '녕', '하', '세', '요'};
		for(int i = 0 ; i < arrC.length; i++) {
			arrC[i] = temp[i];
			System.out.print(arrC[i]);
		}
		
		
		
		
		}
}

