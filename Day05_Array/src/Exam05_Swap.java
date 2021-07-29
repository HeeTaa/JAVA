
public class Exam05_Swap {
	public static void main(String[] args) {
		// swap : arr이라는 배열에 'A' 'B' 라는 값이 있다라고 했을 때 이 두개의 순서를 바꿔주는 것

//		char[] arr = new char[]	{'A', 'B'};
//		char tmp;
//		tmp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
//		System.out.println(arr[0] + " " + arr[1]);

		// hello라는 캐릭터형이 담긴 배열을 뒤집어보기

		char[] arr = new char[] { 'h', 'e', 'l', 'l', 'o' };
		int length = arr.length;
		char temp = 0;

		for (int i = 0; i < length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - 1 - i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
