public class Quiz_Bigger {

	public static int bigger(int x, int y) {
		if (x > y) {
			return x;
		} else if (y > x) {
			return y;
		} else{        //만약 void가 아닌 리턴값이 있어야하는 메서드에서 else if 를 써서 
			           //리턴값을 못찾는 경우의 수가 있다면 오류가 발생한다.
			return 0;
		} 
	}

	public static void main(String[] args) {
		// 두 정수를 인자로 받아서 비교 -> 더 큰 수를 반환하는 메서드를 만드시오.
		// 만약, 두 수가 같다면 0을 반환
		
		System.out.println(bigger(5, 5));

	}
}
