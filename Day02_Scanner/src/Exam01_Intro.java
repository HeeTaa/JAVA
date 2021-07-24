import java.util.Scanner;

public class Exam01_Intro {
	public static void main(String[] args) {

		 
				//문자열 입력,출력
/*			
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 >>");
		String str = sc.nextLine();
		System.out.println("출력값 >> " + str);
*/
			     //숫자 입력,출력
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("입력값 >> ");
		int input = sc.nextInt();
		System.out.println("출력값 >> " + input);
*/
		        //학생정보입력프로그램//
/*
		Scanner sc = new Scanner(System.in);
		System.out.println("=== 사용자 정보 출력 프로그램 ===");
		
		System.out.print("이름을 입력해 주세요 >>");
		String name = sc.nextLine();
		System.out.print("성별을 입력해 주세요 >>");
		String sex = sc.nextLine();
		System.out.print("나이를 입력해 주세요 >>");
		//int age = sc.nextInt();                   //nextint는 숫자입력후 엔터를 눌럿을떄 엔터가 버퍼라는공간에 남아있다가 다음입력값에 입력된다.
				//sc.nextLine();  		            //nextline에다가 버퍼에있던 엔터값을 보내줌으로써 해결가능하지만 비효율적이므로 
		int age = Integer.parseInt(sc.nextLine());  //integer.parseint를 이용한다.
		System.out.print("현재 체온을 입력해 주세요 >>");
		double temp = Double.parseDouble(sc.nextLine());
		System.out.println();
		System.out.println("입력된 사용자 이름은 " + name + ", 성별은 " + sex +", 나이는 " + age +", 체온은 " + temp +"도 입니다.");
		
*/
		        //정수 사칙연산 프로그램
		  Scanner sc = new Scanner(System.in);
		   System.out.println("==== 정수 사칙연산 프로그램====");
		   System.out.println("첫 번쨰 정수를 입력해 주세요 >> ");
		   int i1 = Integer.parseInt(sc.nextLine());
		   
		   System.out.println("두 번쨰 정수를 입력해 주세요 >> ");
		   int i2 = Integer.parseInt(sc.nextLine());
		   
		  System.out.println(i1 + " + " + i2 + " = " + (i1+i2));
		  System.out.println(i1 + " - " + i2 + " = " + (i1-i2));
		  System.out.println(i1 + " * " + i2 + " = " + (i1*i2));
		  System.out.println(i1 + " / " + i2 + " = " + (i1/i2));
		
		
	
		
		
	}
	
	
}

