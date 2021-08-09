package kh.com.opp.has_a02;

public class Main {
	public static void main(String[] args) {

//		IceCream iceCream1 = new IceCream("001", "엄마는외계인", 3000);
//		IceCream iceCream2 = new IceCream("002", "사랑에빠진딸기", 3000);
		int[] incomePerDay = new int[] { 10000, 20000, 30000, 40000, 50000 };
		IceCream[] iceCream = new IceCream[5]; // IceCream형 5칸짜리 배열
		Shop bR = new Shop("BaskinRobins31", "09:00", "22:00", iceCream, incomePerDay);

//		// int형 배열 incomePerDay 출력
//		for (int i = 0; i < incomePerDay.length; i++) {
//			System.out.println(bR.getIncomePerDay()[i]);
//		}

//		// iceCream1 변경 전 출력
//		System.out.println(bR.getIceCream1().getId());
//		System.out.println(bR.getIceCream1().getName());
//		System.out.println(bR.getIceCream1().getPrice());
//		// iceCream1 변경
//		bR.getIceCream1().setId("003");       //get으로 iceCream1의 주소를 불러온 후 set으로 Id를 바꿔준다
//		bR.getIceCream1().setName("레인보우샤베트");
//		bR.getIceCream1().setPrice(4000);
//		// iceCream1 변경 후 출력
//		System.out.println(bR.getIceCream1().getId());
//		System.out.println(bR.getIceCream1().getName());
//		System.out.println(bR.getIceCream1().getPrice());
//
//		// iceCream2 변경 전 출력
//		System.out.println(bR.getIceCream2().getId());
//		System.out.println(bR.getIceCream2().getName());
//		System.out.println(bR.getIceCream2().getPrice());
//		// iceCream2 변경
//		bR.getIceCream2().setId("004");
//		bR.getIceCream2().setName("요거트");
//		bR.getIceCream2().setPrice(4000);
//		// iceCream2 변경 후 출력
//		System.out.println(bR.getIceCream2().getId());
//		System.out.println(bR.getIceCream2().getName());
//		System.out.println(bR.getIceCream2().getPrice());

//		// int형 배열 incomePerDay 변경
//		bR.getIncomePerDay()[0] = 60000;
//		bR.getIncomePerDay()[1] = 70000;
//		bR.getIncomePerDay()[2] = 80000;
//		incomePerDay[3] = 90000;
//		incomePerDay[4] = 100000;
//
//		// int형 배열 incomePerDay 변경 후 출력
//		for (int i = 0; i < incomePerDay.length; i++) {
//			System.out.println(bR.getIncomePerDay()[i]);
//		}

		// shop형 인스턴스 안의 값들 모두 출력
		System.out.println(bR.getName());
		System.out.println(bR.getOpenTime());
		System.out.println(bR.getCloseTime());
		for (int i = 0; i < iceCream.length; i++) {
			System.out.println(bR.getIceCream()[i]);
		}
		for (int i = 0; i < incomePerDay.length; i++) {
			System.out.println(bR.getIncomePerDay()[i]);
		}

		// iceCream형 배열에 값추가
		iceCream[0] = new IceCream("001", "엄마는외계인", 1000);
		// shop형 인스턴스를 이용해서 값 출력
		System.out.println(bR.getIceCream()[0].getId());
		System.out.println(bR.getIceCream()[0].getName());
		System.out.println(bR.getIceCream()[0].getPrice());
		// shop형 인스턴스를 이용해서 값수정
		bR.getIceCream()[0].setId("002");
		bR.getIceCream()[0].setName("아몬드봉봉");
		bR.getIceCream()[0].setPrice(2000);
		// shop형 인스턴스를 이용해서 값 삭제
		bR.getIceCream()[0] = null;

		// addIceCream 메서드 정의 및 사용
		bR.addIceCream(new IceCream("001", "체리쥬빌레", 1000));
		System.out.println(bR.getIceCream()[0].getId());
		System.out.println(bR.getIceCream()[0].getName());
		System.out.println(bR.getIceCream()[0].getPrice());
		bR.addIceCream(new IceCream("002", "아빠는딸바봉", 2000));
		System.out.println(bR.getIceCream()[1].getId());
		System.out.println(bR.getIceCream()[1].getName());
		System.out.println(bR.getIceCream()[1].getPrice());

	}
}
