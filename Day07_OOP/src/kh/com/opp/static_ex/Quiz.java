package kh.com.opp.static_ex;

public class Quiz {
	public static void main(String[] args) {
		
	
	Calc calc = new Calc();
	
	System.out.println(calc.plus(10,5));
	System.out.println(Calc.minus(10,5)); //minus 메서드에 static을 추가하면 calc클래스를 인스턴스하지 않아도 minus메서드를 호출할수있다.
	System.out.println(calc.mply(10,5));
	System.out.println(Calc.divide(10,5)); //divide 메서드에 static을 추가하면 해결할수있다.
	}
}
