package kh.com.opp.has_a02;

public class Main {
	public static void main(String[] args) {

//		IceCream iceCream1 = new IceCream("001", "�����¿ܰ���", 3000);
//		IceCream iceCream2 = new IceCream("002", "�������������", 3000);
		int[] incomePerDay = new int[] { 10000, 20000, 30000, 40000, 50000 };
		IceCream[] iceCream = new IceCream[5]; // IceCream�� 5ĭ¥�� �迭
		Shop bR = new Shop("BaskinRobins31", "09:00", "22:00", iceCream, incomePerDay);

//		// int�� �迭 incomePerDay ���
//		for (int i = 0; i < incomePerDay.length; i++) {
//			System.out.println(bR.getIncomePerDay()[i]);
//		}

//		// iceCream1 ���� �� ���
//		System.out.println(bR.getIceCream1().getId());
//		System.out.println(bR.getIceCream1().getName());
//		System.out.println(bR.getIceCream1().getPrice());
//		// iceCream1 ����
//		bR.getIceCream1().setId("003");       //get���� iceCream1�� �ּҸ� �ҷ��� �� set���� Id�� �ٲ��ش�
//		bR.getIceCream1().setName("���κ������Ʈ");
//		bR.getIceCream1().setPrice(4000);
//		// iceCream1 ���� �� ���
//		System.out.println(bR.getIceCream1().getId());
//		System.out.println(bR.getIceCream1().getName());
//		System.out.println(bR.getIceCream1().getPrice());
//
//		// iceCream2 ���� �� ���
//		System.out.println(bR.getIceCream2().getId());
//		System.out.println(bR.getIceCream2().getName());
//		System.out.println(bR.getIceCream2().getPrice());
//		// iceCream2 ����
//		bR.getIceCream2().setId("004");
//		bR.getIceCream2().setName("���Ʈ");
//		bR.getIceCream2().setPrice(4000);
//		// iceCream2 ���� �� ���
//		System.out.println(bR.getIceCream2().getId());
//		System.out.println(bR.getIceCream2().getName());
//		System.out.println(bR.getIceCream2().getPrice());

//		// int�� �迭 incomePerDay ����
//		bR.getIncomePerDay()[0] = 60000;
//		bR.getIncomePerDay()[1] = 70000;
//		bR.getIncomePerDay()[2] = 80000;
//		incomePerDay[3] = 90000;
//		incomePerDay[4] = 100000;
//
//		// int�� �迭 incomePerDay ���� �� ���
//		for (int i = 0; i < incomePerDay.length; i++) {
//			System.out.println(bR.getIncomePerDay()[i]);
//		}

		// shop�� �ν��Ͻ� ���� ���� ��� ���
		System.out.println(bR.getName());
		System.out.println(bR.getOpenTime());
		System.out.println(bR.getCloseTime());
		for (int i = 0; i < iceCream.length; i++) {
			System.out.println(bR.getIceCream()[i]);
		}
		for (int i = 0; i < incomePerDay.length; i++) {
			System.out.println(bR.getIncomePerDay()[i]);
		}

		// iceCream�� �迭�� ���߰�
		iceCream[0] = new IceCream("001", "�����¿ܰ���", 1000);
		// shop�� �ν��Ͻ��� �̿��ؼ� �� ���
		System.out.println(bR.getIceCream()[0].getId());
		System.out.println(bR.getIceCream()[0].getName());
		System.out.println(bR.getIceCream()[0].getPrice());
		// shop�� �ν��Ͻ��� �̿��ؼ� ������
		bR.getIceCream()[0].setId("002");
		bR.getIceCream()[0].setName("�Ƹ�����");
		bR.getIceCream()[0].setPrice(2000);
		// shop�� �ν��Ͻ��� �̿��ؼ� �� ����
		bR.getIceCream()[0] = null;

		// addIceCream �޼��� ���� �� ���
		bR.addIceCream(new IceCream("001", "ü�������", 1000));
		System.out.println(bR.getIceCream()[0].getId());
		System.out.println(bR.getIceCream()[0].getName());
		System.out.println(bR.getIceCream()[0].getPrice());
		bR.addIceCream(new IceCream("002", "�ƺ��µ��ٺ�", 2000));
		System.out.println(bR.getIceCream()[1].getId());
		System.out.println(bR.getIceCream()[1].getName());
		System.out.println(bR.getIceCream()[1].getPrice());

	}
}
