
public class MathRandom01_Intro {
	public static void main(String[] args) {
		// 랜덤한 수 생성
		// Math.random() 0.0 ~ 1.0사이의 실수형(double) 난수를 생성해 줍니다.
//		System.out.println(Math.random());

		// 1~45사이의 랜덤한 수를 6번 출력하시오. (Math.random() * (최대값 - 최소값 + 1)) + 최소값
		
            
		for (int i = 0; i < 6 ; i++) {
			int ran = (int)(Math.random() * (45 - 1 + 1)) + 1;
			System.out.println(ran);
		}

	}
}
