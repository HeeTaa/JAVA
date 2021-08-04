package kh.com.opp.homework02_oop;

import java.util.Scanner;

public class Turtlegame {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = 0;

		while (true) {
			int ranNum = (int)(Math.random() * (3 - 1 + 1)) + 1;
			String rs = null;

			if (ranNum == 1) {
				rs = "'세상 빠른 것 같이 생기기만 한 거북이'가 승리하였습니다..";
			} else if (ranNum == 2) {
				rs = "'알록달록 화려한 정신 쏙 빼놓는 거북이'가 승리하였습니다..";
			} else if (ranNum == 3) {
				rs = "'몸은 무거운데 덩치가 커서 한 발짝 앞서는 거북이'가 승리하였습니다..";
			}
			
			System.out.println();
			System.out.println("**** 거북이 배팅 게임 ****");
			System.out.println("1. 게임시작");
			System.out.println("2. 잔액조회");
			System.out.println("3. 잔액충전");
			System.out.println("0. 종료");
			System.out.print("메뉴입력 >> ");
			int inMenu = Integer.parseInt(sc.nextLine());
			if (inMenu == 1) {
				System.out.println("거북이들이 준비되었습니다. 배팅하고자 하는 거북이를 선택해주세요.");
				System.out.println("1.세상 빠른 것 같이 생기기만 한 거북이");
				System.out.println("2.알록달록 화려한 정신 쏙 빼놓는 거북이");
				System.out.println("3.몸은 무거운데 덩치가 커서 한 발짝 앞서는 거북이");
				System.out.println("0.메뉴로 돌아가기");
				System.out.print("입력  >> ");
				int inMenu2 = Integer.parseInt(sc.nextLine());
				System.out.println("얼마를 배팅하시겠습니까?");
				System.out.print("입력  >> ");
				int bet = Integer.parseInt(sc.nextLine());

				if (bet > money) {
					System.out.println("배팅 금액이 잔액보다 많습니다. 금액을 충전해주세요.");
				} else if (inMenu2 == 1) {
					money -= bet;
					System.out.println("1.세상 빠른 것 같이 생기기만 한 거북이에" + bet + "원 을 베팅하였습니다.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("베팅한" + bet + "원의 3배를 땄습니다");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("저런저런, " + bet + "원을 잃었습니다..");
						System.out.println(rs);
						System.out.println("남은 돈은 " + money + "원 입니다..");
					}
				} else if (inMenu2 == 2) {
					money -= bet;
					System.out.println("2.알록달록 화려한 정신 쏙 빼놓는 거북이에" + bet + "원 을 베팅하였습니다.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("베팅한" + bet + "원의 3배를 땄습니다");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("저런저런, " + bet + "원을 잃었습니다..");
						System.out.println(rs);
						System.out.println("남은 돈은 " + money + "원 입니다..");
					}
				} else if (inMenu2 == 3) {
					money -= bet;
					System.out.println("3.몸은 무거운데 덩치가 커서 한 발짝 앞서는 거북이에 " + bet + "원 을 베팅하였습니다.");
					if (inMenu2 == ranNum) {
						System.out.println(rs);
						System.out.println("베팅한" + bet + "원의 3배를 땄습니다");
						money += bet * 3;
					} else if (inMenu2 != ranNum) {
						System.out.println("저런저런, " + bet + "원을 잃었습니다..");
						System.out.println(rs);
						System.out.println("남은 돈은 " + money + "원 입니다..");
					}
				} else if (inMenu2 == 0) {
					break;
				} else {
					System.out.println("다시 입력해주세요.");
				}
			} else if (inMenu == 2) {
				System.out.println("현재 잔액은 " + money + "원 입니다.");
				
			} else if (inMenu == 3) {
				System.out.println("충전할 금액을 입력하세요.");
				System.out.println(">> ");
				money += Integer.parseInt(sc.nextLine());
				System.out.println("현재 잔액은 " + money + "원 입니다.");
				

			} else if (inMenu == 0) {
				System.out.println("**** GoodBye ****");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
				
			}

		}
	}
}
