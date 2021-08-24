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
					System.out.print("�ű� ȸ�� ����Ʈ : ");
					int point = Integer.parseInt(sc.nextLine());
					return point;
				} else if (type.equals("mpoint"))
					System.out.print("���� �� ����Ʈ : ");
				int point = Integer.parseInt(sc.nextLine());
				return point;

			} catch (Exception e) {
				System.out.println("���ڸ� �Է� �����մϴ�.");
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
			System.out.println("*** Netflix ȸ�� ���� �ý��� ***");
			System.out.println("1.�ű� ȸ�� ���");
			System.out.println("2.ȸ�� ��� ���");
			System.out.println("3.ȸ�� ���� �˻�");
			System.out.println("4.ȸ�� ���� ����");
			System.out.println("5.ȸ�� ���� ����");
			System.out.println("6.�ý��� ����");
			int inMenu = exInt("inMenu");
			switch (inMenu) {
			case 1:
				System.out.println("ȸ�� ��� ����");
				System.out.println("1.Basic");
				System.out.println("2.Standard");
				System.out.println("3.Premium");
				int inMenu1 = exInt("inMenu");
				if (inMenu1 > 3 || inMenu1 <= 0) {
					System.out.println("�ٽ� �Է����ּ���");
					continue;
				}
				while (true) {
					System.out.print("�ű� ȸ�� ID(7�� �̳�) : ");
					id = sc.nextLine();
					if (mDAO.olId(id) == true) {
						System.out.println("�����ϴ� ID�Դϴ�.");
						continue;
					} else
						break;
				}
				while (true) {
					System.out.print("�ű� ȸ�� �г���(4�� �̳�) : ");
					nickname = sc.nextLine();
					if (mDAO.olNick(nickname) == true) {
						System.out.println("�����ϴ� �г����Դϴ�.");
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
					System.out.println("�ٽ� �Է��ϼ���.");
				}
				break;

			case 2:
				System.out.println("ID\t���\t�г���\t����Ʈ\t������");
				ArrayList<MemberDTO> mDTO = mDAO.mPrint();
				for (MemberDTO m : mDTO) {
					System.out.println(m);
				}
				break;

			case 3:
				while (true) {
					System.out.println("1. ID�� �˻�");
					System.out.println("2. �г������� �˻�");
					inMenu1 = exInt("inMenu");

					if (inMenu1 > 2 || inMenu1 <= 0) {
						System.out.println("�ٽ� �Է����ּ���");
						continue;
					}
					if (inMenu1 == 1) {
						System.out.println("�˻� �� ID �Է�");
						id = sc.nextLine();
						mDAO.selectById(id);
						System.out.println(mDAO.selectById(id));
						break;
					} else if (inMenu1 == 2) {
						System.out.println("�˻� �� �г��� �Է�");
						nickname = sc.nextLine();
						mDAO.mNickSearch(nickname);
						System.out.println(mDAO.mNickSearch(nickname));
						break;
					}

				}
				break;
			case 4:
				System.out.println("ID\t���\t�г���\t������\t����Ʈ");

				for (MemberDTO m : mDAO.mPrint()) {
					System.out.println(m);
				}
				System.out.print("���� �� ȸ���� ID �Է� : ");
				id = sc.nextLine();
				System.out.print("���� �� �г��� : ");
				nickname = sc.nextLine();
				point = exInt("mpoint");
				mDAO.mModify(id, nickname, point);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;

			case 5:
				System.out.println("ID\t���\t�г���\t������\t����Ʈ");

				for (MemberDTO m : mDAO.mPrint()) {
					System.out.println(m);
				}
				System.out.print("���� �� ȸ���� ID �Է� : ");
				id = sc.nextLine();
				mDAO.mDelete(id);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;

			case 6:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);

			default:
				System.out.println("���� �޴� �Դϴ�. �ٽ� �Է����ּ���.");
				continue;

			}

		}
	}
}
