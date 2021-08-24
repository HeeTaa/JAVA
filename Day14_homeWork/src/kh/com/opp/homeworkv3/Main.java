package kh.com.opp.homeworkv3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static int exInt(String type) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				if (type.equals("inMenu")) {
					System.out.print(">> ");
					int inMenu = Integer.parseInt(sc.nextLine());
					return inMenu;
				} else if (type.equals("npoint")) {
					System.out.print("신규 회원 포인트 : ");
					int point = Integer.parseInt(sc.nextLine());
					return point;
				} else if (type.equals("mpoint"))
					System.out.print("수정 할 포인트 : ");
				int point = Integer.parseInt(sc.nextLine());
				return point;

			} catch (Exception e) {
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MemberDAO mDAO = new MemberDAO();
		String id = "";
		String nickname = "";
		while (true) {
			System.out.println("*** Netflix 회원 관리 시스템 ***");
			System.out.println("1.신규 회원 등록");
			System.out.println("2.회원 목록 출력");
			System.out.println("3.회원 정보 검색");
			System.out.println("4.회원 정보 수정");
			System.out.println("5.회원 정보 삭제");
			System.out.println("6.시스템 종료");
			int inMenu = exInt("inMenu");
			switch (inMenu) {
			case 1:
				System.out.println("회원 등급 선택");
				System.out.println("1.Basic");
				System.out.println("2.Standard");
				System.out.println("3.Premium");
				int inMenu1 = exInt("inMenu");
				if (inMenu1 > 3 || inMenu1 <= 0) {
					System.out.println("다시 입력해주세요");
					continue;
				}
				while (true) {
					System.out.print("신규 회원 ID(7자 이내) : ");
					id = sc.nextLine();
					if (mDAO.olId(id) == true) {
						System.out.println("존재하는 ID입니다.");
						continue;
					} else
						break;
				}
				while (true) {
					System.out.print("신규 회원 닉네임(4자 이내) : ");
					nickname = sc.nextLine();
					if (mDAO.olNick(nickname) == true) {
						System.out.println("존재하는 닉네임입니다.");
						continue;
					} else
						break;
				}
				String signup_date = mDAO.getDate(System.currentTimeMillis());
				int point = exInt("npoint");

				if (inMenu1 == 1) {
					mDAO.mAdd(new Basic(id, nickname, signup_date, point));

				} else if (inMenu1 == 2) {
					mDAO.mAdd(new Standard(id, nickname, signup_date, point));

				} else if (inMenu1 == 3) {
					mDAO.mAdd(new Premium(id, nickname, signup_date, point));

				} else {
					System.out.println("다시 입력하세요.");
				}
				break;

			case 2:
				System.out.println("ID\t등급\t닉네임\t포인트\t가입일");
				ArrayList<MemberDTO> mDTO = mDAO.mPrint();
				for (MemberDTO m : mDTO) {
					System.out.println(m);
				}
				break;

			case 3:
				while (true) {
					System.out.println("1. ID로 검색");
					System.out.println("2. 닉네임으로 검색");
					inMenu1 = exInt("inMenu");

					if (inMenu1 > 2 || inMenu1 <= 0) {
						System.out.println("다시 입력해주세요");
						continue;
					}
					if (inMenu1 == 1) {
						System.out.println("검색 할 ID 입력");
						id = sc.nextLine();
						mDAO.selectById(id);
						System.out.println(mDAO.selectById(id));
						break;
					} else if (inMenu1 == 2) {
						System.out.println("검색 할 닉네임 입력");
						nickname = sc.nextLine();
						mDAO.mNickSearch(nickname);
						System.out.println(mDAO.mNickSearch(nickname));
						break;
					}

				}
				break;
			case 4:
				System.out.println("ID\t등급\t닉네임\t가입일\t포인트");

				for (MemberDTO m : mDAO.mPrint()) {
					System.out.println(m);
				}
				System.out.print("수정 할 회원의 ID 입력 : ");
				id = sc.nextLine();
				System.out.print("수정 할 닉네임 : ");
				nickname = sc.nextLine();
				point = exInt("mpoint");
				mDAO.mModify(id, nickname, point);
				System.out.println("변경이 완료되었습니다.");
				break;

			case 5:
				System.out.println("ID\t등급\t닉네임\t가입일\t포인트");

				for (MemberDTO m : mDAO.mPrint()) {
					System.out.println(m);
				}
				System.out.print("삭제 할 회원의 ID 입력 : ");
				id = sc.nextLine();
				mDAO.mDelete(id);
				System.out.println("삭제가 완료되었습니다.");
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);

			default:
				System.out.println("없는 메뉴 입니다. 다시 입력해주세요.");
				continue;

			}

		}
	}
}
