
public class For02_Overlap {
	public static void main(String[] args) {
//		A
//		AA
//		AAA
//		AAAA
//		AAAAA   를 출력하시오
//		for(int i = 0; i < 5; i++) {
//				
//			for(int j = 0; j <= i; j++) {
//				System.out.print("A");
//			}
//			System.out.println();
//		}
//		AAAAA
//		AAAA
//		AAA
//		AA
//		A       를 출력하시오
		for(int i = 0; i <5 ; i++) {
			for(int j = 5; j > i; j-- ) {
				System.out.print("A");
			}
			System.out.println();
		}
		
	}
}
