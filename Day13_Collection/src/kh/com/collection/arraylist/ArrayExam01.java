package kh.com.collection.arraylist;

public class ArrayExam01 {
	public static void main(String[] args) {
		// Array vs ArrayList

		// 배열생성
		String[] arr = new String[3];
		
		// 값 추가
		arr[0] = "apple";
		arr[1] = "banana";
		
		// 값 출력
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		
		// 값을 더 추가
		arr[2] = "kiwi";
//		arr[3] = "mango";  인덱스 overflow
		
		// 길이값
		System.out.println(arr.length);
		
		// 값 삭제
		arr[0] = null;
		
		// 다른자료형 값 추가
//		arr[0] = 100;  배열은 같은 자료형만 넣을수있다.
		
		// String형을 char형으로 형변환
		arr[1].charAt(0);
		
		//모두출력
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}
}
