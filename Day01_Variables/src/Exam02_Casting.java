
public class Exam02_Casting {
	public static void main(String[] args) {
		/*
		 * 형변환(Casting) 1.자동형변환(promotion)작은데이터타입을 큰데이터타입에 넣을수있다
		 */
		byte b1 = 123;
		short s1 = b1;
		int i1 = b1;
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		/*
		 * 2.강제형변환(down casting) 큰데이터타입을 작은데이터타입에 넣을수없지만 (타입)을 넣어서 강제로 바꿀수있다. 실수형은 어떠한
		 * 정수형보다 크다 실수형을 강제로 정수형으로 바꾸면 소수점이 사라진다
		 */
		int i2 = 200;
		byte b3;
		b3 = (byte) i2;
		System.out.println(b3);

	}
}
