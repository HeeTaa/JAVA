
public class Exam04_Overloading {

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static int plus(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

//	public static double plus(double num1 , double num2) { // 매개변수의 데이터타입과 
//		                                                   // 리턴값의 데이터타입이 둘다 다르면 오버로딩이 아니다.
//		return num1 + num2
//	}
	public static int plus(double num1, double num2) {
		return (int) (num1 + num2); // 리턴값의 데이터타입을 강제 형변환하는 방법이 있다.
	}

	public static void main(String[] args) {

		// 메서드의 오버로딩(Overloading)
		// 같은 메서드의 이름에 매개변수의 데이터타입이나 개수가 다르면 오버로딩 가능하다.

		plus(5, 10);

		plus(5, 15, 20);

		plus(3.14, 3.2);

	}
}
