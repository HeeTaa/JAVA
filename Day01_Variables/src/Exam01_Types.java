
public class Exam01_Types {
	public static void main(String[] args) {
		 //1.논리형
		 boolean b1 = true;  //1byte: 논리형변수로 true false 만 들어간다.        
		 boolean b2 = false;
		 System.out.println("b1:" + b1); //  +는 연결해주는 역할
		 System.out.println("b2:" + b2);
		 
		//2. 문자형
		char c1 = 'a';   //2byte :
		System.out.println("c1:" + c1);
		char c2 = 97;  //아스키코드 97은 a와 같다
		System.out.println("c2:" + c2);
		
		//3.정수형
		byte bt1 = 1; //1byte 
		short s1 = 1; //2byte
		int i1 = 1; //4byte , 정수형의 대표
		long l1 = 1L; //8byte , 끝에 L붙여야 인식
		//4.실수형
		float f1 = 1.1f; //4byte ,끝에 f붙여야 인식
		double d1 = 1.1; //8byte ,실수형의 대표
		
		final int i2;// final을 붙인 변수 -> 상수 (final을 붙이면 변수가 고정된다)
		
		
	
	}

}
