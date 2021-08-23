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
		// A.txt ���Ͽ� �ִ� ������ B.txt���Ϸ� ������ ����
		// copyFile(������ ���ϸ�,����� ���ϸ�) �޼���� ������
		copyFile("A.txt", "B.txt");
	}
}
