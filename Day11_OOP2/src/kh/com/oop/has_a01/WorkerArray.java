package kh.com.oop.has_a01;

public class WorkerArray {
	public static void main(String[] args) {

		// ��ü �迭�� ����
		Worker[] wk = new Worker[5];

		Worker w0 = new Worker("001", "Tom", "01011111111");
		wk[0] = w0; // w0�� �ּҰ��� wk[0]�迭�� �־����� �� ������ ���� �ּҰ��� �������ִ�.
		System.out.println(w0.getId()); // w0��
		System.out.println(wk[0].getId()); // wk[0]�� ���� �ּҰ��� ������������ ���� Id�� ����Ѵ�.
		wk[0] = null; // wk[0]�� �ּҰ��� �����ȴ�. w0�� �ּҰ��� ��ü�� �����ִ� ���� w0 = null���� �Ѵٸ� 0�� �迭��ü�� �����ȴ�.

		wk[1] = new Worker("002", "Alley", "01022222222");
		for (int i = 0; i < wk.length; i++) {
			if (wk[i] != null) {
				System.out.println(wk[i].getId());
				System.out.println(wk[i].getName());
				System.out.println(wk[i].getPhone());
			}
		}
		wk[1] = null; // wk[1]�� �ּҰ��� �����ȴ�. wk[1]�迭��ü�� �����ȴ�.

		wk[2] = new Worker("003", "Kim", "01033333333");
	}
}
