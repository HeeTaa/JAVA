package kh.com.time.student02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Student 등록 프로그램
		// 등록일을 사용자에게 직접 입력받아서(String) -> register_date필드에 long형으로 저장
		// 등록일 입력 형태(0000/00/00)
		// 학생의 정보를 출력할때 번호,이름,등록일(yyyy년 MM월 dd일)
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<>();
		
		while (true) {
					
			//입력
			System.out.println("번호입력");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("이름입력");
			String name = sc.nextLine();
			System.out.println("날짜입력");
			String register_date = sc.nextLine();
			list.add(new Student(no, name,register_date));
			
			//출력
			System.out.println("번호\t이름\t등록일");
			for (Student s : list) {		
				System.out.println(list+"\t");
			}
		}

	}
}
