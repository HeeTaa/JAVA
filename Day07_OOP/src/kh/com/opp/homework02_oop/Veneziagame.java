package kh.com.opp.homework02_oop;

import java.util.Scanner;

public class Veneziagame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;

		System.out.println("===== 베네치아 게임에 오신 걸 환영합니다 =====");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 종료");
		System.out.print("메뉴를 선택하세요 >>");
		int inMenu = Integer.parseInt(sc.nextLine());
		if (inMenu == 1) {

			long start = System.currentTimeMillis();

			System.out.println("게임 Start!");
			String[] str = new String[] { "마부위침", "흘깃흘깃", "부서지다", "싱글벙글", "귀모토각", "사흘돌이", "반근착절", "바람언덕", "백전백승" };
			while (true) {
				for (int i = 0; i < str.length; i++) {
					System.out.print(str[i] + " ");
				}
				System.out.println();
				System.out.print("입력 >> ");
				String in = sc.nextLine();
				for (int i = 0; i < str.length; i++) {
					if (str[i].equals(in)) {
						str[i] = " ";
						count++;
					}
				}
				if (count == 9) {
					break;
				}
			}
			System.out.println("Clear !");
			long end = System.currentTimeMillis();
			System.out.println("플레이 시간 : " + (end - start) / 1000.0 + "초");
			System.out.println("===== Goodbye Venezia:) =====");
		}
	}
}
