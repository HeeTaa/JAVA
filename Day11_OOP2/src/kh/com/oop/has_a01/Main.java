package kh.com.oop.has_a01;

public class Main {
	public static void main(String[] args) {

//		Worker worker1 = new Worker("001", "Tom", "0101231234");
//		Worker worker2 = new Worker("002", "Alley", "0105556666");
		int[] visitPerDay = new int[] { 100, 200, 300, 400, 500, 600, 700 };
		Worker[] worker = new Worker[5];
		Cafe starbucks = new Cafe("��Ÿ����", "������", worker, visitPerDay);
		
		System.out.println(starbucks.getName());
		System.out.println(starbucks.getBranch());

//		System.out.println(starbucks.getWorker().getId()); // starbucks��ü.Worker1��ü.
//		System.out.println(starbucks.getWorker().getName());
//		System.out.println(starbucks.getWorker().getPhone());

		System.out.println(starbucks.getVisitPerDay()[0]); // starbucks��ü.visitPerDay��ü�迭
		System.out.println(starbucks.getVisitPerDay()[1]);
		System.out.println(starbucks.getVisitPerDay()[2]);

		visitPerDay[2] = 350; // �Ʒ��ڵ�� �������
		starbucks.getVisitPerDay()[2] = 350; // �ڰ�ü�迭�� getter�� �� ����. (getVisitPerDay�� visitPerDay �迭�� �ּҰ��� ��ȯ���ֱ⶧��)

		int[] visitPerDay2 = new int[] { 800, 900, 1000 };
		starbucks.setVisitPerDay(visitPerDay2); // ���� ��ü�迭 ���� ��ü�� �����ҋ��� setter�� ����Ѵ�
		
		worker[0] = new Worker("001","Tom","0101111"); //������� 0���迭�� �ִ¹��
		
		Worker wk = new Worker("002","Alley","0102222"); //���� �Ŀ�
		worker[1] = wk; 							     //1���迭�� �ִ¹��
		
		worker[0].setName("Jessi");                //worker�迭�ּ��� 0���ε���.setName
		starbucks.getWorker()[0].setName("Jessi"); //starbucks�ּ���.worker�迭�ּ��� 0���ε���.setName
		System.out.println(worker[0].getName());   //worker�迭�ּ��� 0���ε���.getName
		System.out.println(starbucks.getWorker()[0].getName());	//starbucks�ּ���.worker�迭�ּ��� 0���ε���.getName	 
		
		//////////////////���� ����� �������� �ּ������� �ؾ��ϹǷ� ���ŷӴ�. �Ʒ������ addWorker��� �޼��带 �̿�
		starbucks.addWorker(new Worker("003","Tom","0103333"));   //�迭��ü worker�� ���������� �ֱ�  ���ڰ��� new Worker("003","Tom","0103333") �� �ּҰ��̴�.
		System.out.println(starbucks.getWorker()[0].getId());
	}
}
