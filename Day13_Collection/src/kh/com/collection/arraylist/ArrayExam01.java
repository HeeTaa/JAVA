package kh.com.collection.arraylist;

public class ArrayExam01 {
	public static void main(String[] args) {
		// Array vs ArrayList

		// �迭����
		String[] arr = new String[3];
		
		// �� �߰�
		arr[0] = "apple";
		arr[1] = "banana";
		
		// �� ���
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		
		// ���� �� �߰�
		arr[2] = "kiwi";
//		arr[3] = "mango";  �ε��� overflow
		
		// ���̰�
		System.out.println(arr.length);
		
		// �� ����
		arr[0] = null;
		
		// �ٸ��ڷ��� �� �߰�
//		arr[0] = 100;  �迭�� ���� �ڷ����� �������ִ�.
		
		// String���� char������ ����ȯ
		arr[1].charAt(0);
		
		//������
		for(int i = 0 ; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
	}
}
