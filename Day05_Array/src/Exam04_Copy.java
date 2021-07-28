import java.util.Arrays;

public class Exam04_Copy {
	public static void main(String[] args) {
		
			// 배열 복사
//		int[] arr = new int[] {1, 2, 3, 4, 5};
				
			// 얕은 복사 : 실제 배열의 값을 다른 배열에 옮겨 담는는게 아니라, 주소값만 복사해온다.
//		int[] arr1 = arr;
		
			// 깊은 복사 : 새로운 배열을 만들어 주소값이 달라지게 된다.
//		int[] arr = new int[] {1, 2, 3, 4, 5};
//		int[] arr1 = new int[5];
//		System.arraycopy(arr, 0, arr1, 0, arr.length);    //1. System.arraycopy(복사원본배열,복사위치시작,복사받을배열,복사위치시작,복사위치끝);
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");					
//		}		   
//		int[] arr = new int[] {1, 2, 3, 4, 5};
//		int[] arr1 = new int[5];
//		arr1 = Arrays.copyOf(arr, arr.length);            //2. Arrays.copyOf  
		
//		int[] arr = new int[] {1, 2, 3, 4, 5};
//		int[] arr1 = new int[5];
//		arr1 = arr.clone();                               //3.arr.clone()
		
	}
}
