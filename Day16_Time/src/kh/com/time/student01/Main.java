package kh.com.time.student01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Student 등록 프로그램
		// Student 등록 시에 register_date 필드는 입력X
		// Student 등록하면 자동으로 등록한 날짜와 시간이 저장되도록 만드시오.
		// 학생의 정보를 출력할때 번호,이름,등록일(yyyy년 MM월 dd일 hh시 mm분)
		
		ArrayList<Student> std = new ArrayList<>();
		
		while (true) {
			
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("번호입력");
			int no = Integer.parseInt(sc.nextLine());
			System.out.println("이름입력");
			String name = sc.nextLine();
			std.add(new Student(no, name));
			
			
			for (Student s : std) {
				
				System.out.println(std);
			}
		}

	}
}
