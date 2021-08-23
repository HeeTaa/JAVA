package kh.com.fileio.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWrite {
	public static void main(String[] args) {

		// FileWriter / BufferedWriter

		// FileWriter 인자값(파일명,false)을 주면 기존 데이터를 덮어씀.
		// FileWriter 인자값(파일명,true)을 주면 기존 데이터에 추가됨.
		try (FileWriter fw = new FileWriter("test02.txt", true); BufferedWriter bw = new BufferedWriter(fw);) {

			String str = "Discover interesting projects and people to populate your personal news feed. ";
			bw.write(str); // 써놓고
			bw.flush(); // push한다
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
