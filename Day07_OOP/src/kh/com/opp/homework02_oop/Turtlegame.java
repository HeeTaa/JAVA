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
					System.out.println("1.세상 빠른 것 같이 생기기만 한 거북이에" + bet + "원 을 베팅하였습니다.");
					money -= bet;
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
					System.out.println("2.알록달록 화려한 정신 쏙 빼놓는 거북이에" + bet + "원 을 베팅하였습니다.");
					money -= bet;
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
					System.out.println("3.몸은 무거운데 덩치가 커서 한 발짝 앞서는 거북이에 " + bet + "원 을 베팅하였습니다.");
					money -= bet;
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

///////////////선생님 코드
//package kh.com.practice.turtlebet;
//
//import java.util.Scanner;
//
//public class TurtleBet {
//   public static void main(String[] args) {
//
//      Scanner sc = new Scanner(System.in);
//      int total = 0; // 잔액 변수 초기화 작업
//      String[] turtles = new String[] { "세상 빠른 거북이", "알록달록 거북이", "덩치 큰 거북이" }; // 거북이 배열 생성
//
//      while (true) { // 사용자 종료 전까지 계속 메뉴 실행
//         System.out.println("\n*** 거북이 배팅 게임 ****");
//         System.out.println("1. 게임시작");
//         System.out.println("2. 잔액조회");
//         System.out.println("3. 잔액충전");
//         System.out.println("0. 종료");
//
//         System.out.print("\n메뉴입력 >> ");
//         int menu = Integer.parseInt(sc.nextLine());
//
//         switch (menu) {
//         case 1: // 게임시작
//            int ranTurtle = (int) (Math.random() * 3); // 0~2 랜덤(인덱스)값을 통해 1등 거북이 뽑기
//
//            System.out.println("\n거북이들이 준비되었습니다. 배팅하고자 하는 거북이를 선택해주세요.");
//            System.out.println("1. " + turtles[0]);
//            System.out.println("2. " + turtles[1]);
//            System.out.println("3. " + turtles[2]);
//            System.out.println("0. 메뉴로 돌아가기");
//            System.out.print("입력 >> ");
//            int betting = Integer.parseInt(sc.nextLine());
//
//            if (betting == 0) { // 메뉴로 다시돌아가기
//               continue;
//            }
//
//            System.out.println("\n얼마를 배팅하시겠습니까?");
//            System.out.print("입력 >> ");
//            int bet = Integer.parseInt(sc.nextLine()); // 배팅금액 변수에 넣기
//
//            if (bet == 0 || bet > total) { // 배팅금액이 0원이거나 잔액보다 많다면 메뉴로 돌아가기.
//               System.out.println("\n배팅 금액이 잔액보다 많습니다. ");
//               continue;
//            } else { // 배팅금액이 정상적이라면 어떤 거북이에 얼마를 배팅했는지 보여주기
//               System.out.println("\n" + turtles[betting - 1] + " 에 " + bet + "원을 베팅하였습니다.");
//            }
//
//            if (betting == 1 && ranTurtle == 0) { // 성공 경우의 수 걸러주기.
//            } else if (betting == 2 && ranTurtle == 1) {
//            } else if (betting == 3 && ranTurtle == 2) {
//            } else { // 배팅에 실패했을 때
//               System.out.println("\n저런저런, " + bet + "원을 잃었습니다...");
//               System.out.println(turtles[ranTurtle] + "가 승리했습니다...");
//               total -= bet; // 원래 잔액에서 배팅금액 차감
//               System.out.println("남은 돈은 " + total + "입니다.");
//               break;
//            }
//            System.out.println("\n축하합니다. " + turtles[ranTurtle] + "가 승리했습니다. ");
//            System.out.println(bet * 2 + "원을 땄습니다.");
//            total += bet * 2; // 원래 잔액에 배팅금액 * 2 증가
//            System.out.println("남은 돈은 " + total + "원 입니다.");
//            break;
//         case 2:
//            System.out.println("\n현재 잔액은 " + total + "원 입니다."); // 현재 잔액 조회
//            continue;
//         case 3:
//            System.out.println("\n충전할 금액을 입력하세요. ");
//            System.out.print(">> ");
//            total += Integer.parseInt(sc.nextLine()); // 원래 잔액에 충전할 금액 추가
//            continue;
//         case 0:
//            System.out.println("\n**** GoodBye ****");
//            System.exit(0); // 명시적으로 프로그램을 종료하는 코드
//         default:
//            System.out.println("\n잘못 입력했습니다. ");
//         }
//      }
//   }
//}
