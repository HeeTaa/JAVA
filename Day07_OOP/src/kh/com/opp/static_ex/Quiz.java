package kh.com.opp.static_ex;

public class Quiz {
	public static void main(String[] args) {
		
	
	Calc calc = new Calc();
	
	System.out.println(calc.plus(10,5));
	System.out.println(Calc.minus(10,5)); //minus �޼��忡 static�� �߰��ϸ� calcŬ������ �ν��Ͻ����� �ʾƵ� minus�޼��带 ȣ���Ҽ��ִ�.
	System.out.println(calc.mply(10,5));
	System.out.println(Calc.divide(10,5)); //divide �޼��忡 static�� �߰��ϸ� �ذ��Ҽ��ִ�.
	}
}
