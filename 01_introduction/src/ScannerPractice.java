import java.util.Scanner;

public class ScannerPractice {
   public static void main(String[] args) {
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
