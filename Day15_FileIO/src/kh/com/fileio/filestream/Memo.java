package kh.com.fileio.filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Memo {

	public static int exInt() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print(">> ");
				int menu = Integer.parseInt(sc.nextLine());
				return menu;
			} catch (Exception e) {
				System.out.println("숫자만 입력가능 합니다.");
				continue;
			}
		}
	}

	public static void bfWriter() {
		Scanner sc = new Scanner(System.in);
		try (FileWriter fw = new FileWriter("memo.txt", true); BufferedWriter bw = new BufferedWriter(fw);) {
			String inMemo = sc.nextLine();
			bw.write(inMemo + "\n");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void bfReader() {
		try (FileReader fr = new FileReader("memo.txt"); BufferedReader br = new BufferedReader(fr);) {
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.print(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		while (true) {
			System.out.println("*** 콘솔 메모장 ***");
			System.out.println("1. 메모하기");
			System.out.println("2. 메모장 출력");
			System.out.println("3. 프로그램 종료");
			int menu = exInt();

			if (menu == 1) {
				System.out.println("메모 입력");
				System.out.print(">> ");
				bfWriter();
				
			} else if (menu == 2) {
				System.out.println("메모 출력");
				System.out.print("===================================\n");
				bfReader();
				System.out.print("===================================\n");
				
			} else if (menu == 3) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}
}