
public class Exam06_RemoveOverlap {
	public static void main(String[] args) {
		// math.random()으로 랜덤한 값을 뽑는데 1~100까지 int형 배열에 담고
		// 그 안에서 랜덤하게 값을 뽑아내시오.

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			// math.random() 원하는 범위의 값을 뽑아낼 떄
			// (int)(Math.random() * (max - min + 1)) + min ;
			int temp;
			int x = (int) (Math.random() * 100);
			int y = (int) (Math.random() * 100);

			// 임시 값을 보관할 tmp변수 생성 / x라는 랜덤 인덱스 값 / y라는 랜덤 인덱스 값
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
