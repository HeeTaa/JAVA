
public class Exam02_String {

	public static String greeting(String str) {
		if ("Hello".equals(str)) {
			return "Hi";
		} else if ("Bye".equals(str)) {
			return "See you";
		} else {
			return "none";
		}
	}
	
	public static void sayHi(String str){
		if(str.equals("Hi")) {
			System.out.println("Hi");  //void�� ������ ���� ���ϱ� ������ �޼��� �ȿ��� ���
		}
			
	}
	
	public static void sayBye(){       //���ڰ��� ���� ȣ��Ǿ����Ƿ� �Ű����� ���� ����.
			System.out.println("Bye");  //void�̹Ƿ� �޼��忡�� ���� ����ϰų� 	
	}								    //void�� String���� �ٲ㼭 ��Ʈ�������� ����	

	public static void main(String[] args) {
		// Hello ��� ���ڰ��� �ѱ�� Hi��� ����
		// Bye ��� ���ڰ��� �ѱ�� See you�� ����
		// Hello�� Bye�� �ƴѰ��� �ѱ�� none�� ����

		System.out.println(greeting("Hello"));
		System.out.println(greeting("Bye"));
		System.out.println(greeting("sasdf"));
       
		
		//Hi��� ���ڰ��� �ѱ�� Hi��� ���� 
		//�� ���� ���� �ƹ��͵� ������� �ʴ´�. // void
		
		sayHi("Hi");
		sayHi("sdfsdf");
		
		//sayBye �޼��带 ȣ���ϸ� "Bye"�� ���
		sayBye();       // ���ڰ� ���� �޼��常 ȣ���Ѵ�
		
		
		
		
		
	}
}
