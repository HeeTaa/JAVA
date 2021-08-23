package kh.com.fileio.filestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Quiz03 {

	public static void copyFile(String r, String w) {
		try (FileReader fr = new FileReader(r);
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(w, false);
				BufferedWriter bw = new BufferedWriter(fw);) {
			String line = "";
			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// A.txt 파일에 있는 내용을 B.txt파일로 복사해 보기
		// copyFile(복사할 파일명,복사될 파일명) 메서드로 만들어보기
		copyFile("A.txt", "B.txt");
	}
}
