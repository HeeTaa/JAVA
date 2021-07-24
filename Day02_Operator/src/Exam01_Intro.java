
public class Exam01_Intro {
	public static void main(String[] args) {
		//연산자
	    // 1. 산술 연산자 (+ - * / %)
/*
		int a = 10;
		int b = 4;
		int c = 4;
		
		int rs;
		
		rs = a + b;
		System.out.println("+ :" + rs);
		rs = a - b;
		System.out.println("- :" + rs);
		rs = a * b;
		System.out.println("* :" + rs);
		rs = a / b;
		System.out.println("/ :" + rs);
		rs = a % b;
		System.out.println("% :" + rs);
*/
		
		//2.비교 연산자
/*
		int a = 10;
		int b = 4;
		int c = 4;
		
		int rs;
		System.out.println("a > b =" + (a > b));
		System.out.println("a < b =" + (a < b));
		System.out.println("a == b =" + (a == b));
		System.out.println("a != b =" + (a != b));
		System.out.println("b >= c =" + (a != b));
		System.out.println("a <= c =" + (a <= b));
*/
		//3.복합대입 연산자(+= -= *= /=) 계산하고 대입
/*
		int a = 10;
		a += 5;
		System.out.println(a);
		a -= 3;
		System.out.println(a);
		a *= 2;
		System.out.println(a);
		a /= 2;
		System.out.println(a);
*/
		//4. 증감 연산자 (++ --)
		//전위 연산자 ++a , 후위 연산자 a++
/*	
		int a = 20;
		int b = 20;
	
		System.out.println("a :" + a);
		System.out.println("a++ :" + a++);
		System.out.println("a :" + a);
		
		System.out.println("b :" + b);
		System.out.println("--b :" + --b);
		System.out.println("b :" + b);
*/
		//5. 논리 연산자 (&&그리고 ||또는)
/*
		int a = 10;
		int b = 20;
		boolean b1 = (a > b) && (a == 10);     //양쪽 모두 true가 나와야 결과값이 true
		System.out.println("b1 : " + b1);
		
		boolean b2 = (a > b) || (a == 10);     //양쪽 중 하나라도 true가 나오면 true
		System.out.println("b2 : " + b2);
*/
		//6. 삼항 연산자    비교식 ? 비교식이 참일떄 : 비교식이 거짓일때
/*		
		int a = 10;
		int b = 20;
		
		int i1 = a > b ? 10 : 20;              //거짓이므로 오른쪽
		System.out.println("i1 :" + i1);
		
		boolean b1 = a < b ? true:false;       //트루이므로 왼쪽
		System.out.println("b1 :" + b1);
		
		String st1 = a < b ? "참입니다":"거짓입니다";       //트루이므로 왼쪽
		System.out.println("st1 :" + st1);
*/
		//string값비교   == 기준값.equals(비교값)      != !기준값.equals(비교값)
/*		
		String a = "abc";
		String b = "def";
		String c = "abc";
		
		boolean b1 = a.equals(c);
		System.out.println(b1);
		boolean b2 = !a.equals(c);
		System.out.println(b2);
*/		
		
		
		
	
		
		
		
		
		

		
	 
 }
}
