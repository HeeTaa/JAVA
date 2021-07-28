
public class Exam01_Intro {

	              // 리턴(반환)데이터 타입
	public static int plus(int num1, int num2) { // 매개변수 & parameter

		return num1 + num2; // return으로 되돌려준다.
	} // 메서드 정의부

	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	
		public static void main(String[] args) {
//			메서드(Method)
//			메서드란, 특정 작업을 수행하기 위한 명령문의 집합
//			팀/여러 사람이 협업을 하게 될떄 기능의 분리가 쉬워진다.
//			가독성이 좋아진다.
//			에러 검출이나 유지보수에 유리하다.
			
//			10 + 5 메서드 만들어보기
//			System.out.println(10 + 5);   
			
			plus(10, 5); // 인자값 & argument  //메서드 호출부
			System.out.println("plus(10,5) : "  + plus(10,5));
			int rs = plus(10, 5); // 메서드를 변수에 넣을수 있다.
			System.out.println("rs : " + rs);
			
			minus(10,5);
			System.out.println("minus(10,5) : " + minus(10,5));
			
			multiply(10,5);
			System.out.println("multiply(10,5) : " + multiply(10,5));
			
			divide(10,5);
			System.out.println("divide(10,5) : " + divide(10,5));
		
			
			
		}
}
