import java.util.Scanner;

public class Exam01_Intro {
	public static void main(String[] args) {

		 
				//���ڿ� �Է�,���
/*			
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է°� >>");
		String str = sc.nextLine();
		System.out.println("��°� >> " + str);
*/
			     //���� �Է�,���
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է°� >> ");
		int input = sc.nextInt();
		System.out.println("��°� >> " + input);
*/
		        //�л������Է����α׷�//
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("=== ����� ���� ��� ���α׷� ===");
		
		System.out.print("�̸��� �Է��� �ּ��� >>");
		String name = sc.nextLine();
		System.out.print("������ �Է��� �ּ��� >>");
		String sex = sc.nextLine();
		System.out.print("���̸� �Է��� �ּ��� >>");
		//int age = sc.nextInt();                   //nextint�� �����Է��� ���͸� �������� ���Ͱ� ���۶�°����� �����ִٰ� �����Է°��� �Էµȴ�.
				//sc.nextLine();  		            //nextline���ٰ� ���ۿ��ִ� ���Ͱ��� ���������ν� �ذᰡ�������� ��ȿ�����̹Ƿ� 
		int age = Integer.parseInt(sc.nextLine());  //integer.parseint�� �̿��Ѵ�.
		System.out.print("���� ü���� �Է��� �ּ��� >>");
		double temp = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.println("�Էµ� ����� �̸��� " + name + ", ������ " + sex +", ���̴� " + age +", ü���� " + temp +"�� �Դϴ�.");
		
*/
		        //���� ��Ģ���� ���α׷�
		  Scanner sc = new Scanner(System.in);
		   System.out.println("==== ���� ��Ģ���� ���α׷�====");
		   System.out.println("ù ���� ������ �Է��� �ּ��� >> ");
		   int i1 = Integer.parseInt(sc.nextLine());
		   
		   System.out.println("�� ���� ������ �Է��� �ּ��� >> ");
		   int i2 = Integer.parseInt(sc.nextLine());
		   
		  System.out.println(i1 + " + " + i2 + " = " + (i1+i2));
		  System.out.println(i1 + " - " + i2 + " = " + (i1-i2));
		  System.out.println(i1 + " * " + i2 + " = " + (i1*i2));
		  System.out.println(i1 + " / " + i2 + " = " + (i1/i2));
		
		
	
		
		
	}
	
	
}

