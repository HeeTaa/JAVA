
public class Exam02_Modify {
	public static void main(String[] args) {
			
		// �迭 ���� ����
//		int[] arr = {1, 2, 3, 4, 5}
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		
		//char�� �迭�� hello�� ��� �ȳ��ϼ��� ��� ������ ���
		char[] arrC = {'h', 'e', 'l', 'l', 'o'};
		char[] temp = {'��', '��', '��', '��', '��'};
		for(int i = 0 ; i < arrC.length; i++) {
			arrC[i] = temp[i];
			System.out.print(arrC[i]);
		}
		
		
		
		
		}
}

