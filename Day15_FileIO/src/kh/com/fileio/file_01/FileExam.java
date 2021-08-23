package kh.com.fileio.file_01;

import java.io.File;

public class FileExam {
	public static void main(String[] args) {

		// File 생성자의 인자값으로 파일의 경로를 적어주거나
		// 파일을 프로젝트에 끌어다 놓고 파일이름만 적어준다
		File file = new File("test.txt");

		System.out.println("파일인지 여부? " + file.isFile());
		System.out.println("폴더인지 여부? " + file.isDirectory());
		System.out.println("파일 크기 ? " + file.length());
		System.out.println("파일의 절대 경로? " + file.getAbsolutePath());
		System.out.println("파일의 이름? " + file.getName());

		System.out.println("==================================================================");

		File folder = new File("C:\\workspace1\\Day15_FileIO\\temp"); // 경로 작성할때 경계를 슬래시1개 또는 역슬래시2개로 작성

		System.out.println("파일인지 여부? " + folder.isFile());
		System.out.println("폴더인지 여부? " + folder.isDirectory());
		System.out.println("폴더 크기 ? " + folder.length());
		System.out.println("폴더의 절대 경로? " + folder.getAbsolutePath());
		System.out.println("폴더의 이름? " + folder.getName());

		System.out.println("==================================================================");

		// 해당폴더의 파일명 목록
		for (File f : folder.listFiles()) {
			System.out.println(f.getName());
		}

		System.out.println("==================================================================");

		File File2 = new File("temp.txt");

		System.out.println(File2.exists()); // 파일 존재여부
		if (!File2.exists()) {
			try {
				File2.createNewFile(); // 파일 생성
			} catch (Exception e) {
				e.printStackTrace(); // 에러를 화면에 출력해줌
			}
		}

		System.out.println("==================================================================");

		File folder2 = new File("C:\\workspace1\\Day15_FileIO\\temp2");
		if (!folder2.exists()) { // 폴더 존재여부
			folder2.mkdir(); // 폴더 생성
		}

	}
}
