
public class Exam05_Swap {
		public static void main(String[] args) {
		//swap : arr�̶�� �迭�� 'A' 'B' ��� ���� �ִٶ�� ���� �� �� �ΰ��� ������ �ٲ��ִ� ��
			
//		char[] arr = new char[]	{'A', 'B'};
//		char tmp;
//		tmp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = tmp;
//		System.out.println(arr[0] + " " + arr[1]);
		
		//hello��� ĳ�������� ��� �迭�� �������
		
		char[] arr = new char[] {'h', 'e', 'l', 'l','o'};
		char length =
		for(int i = 0 ; i < length/2 ; i++) {
			tmp = arr[i];
			arr[i] = arr[length-1-i];
			arr[length-1-i] = tmp;
		}
		
		
			
		}
}
