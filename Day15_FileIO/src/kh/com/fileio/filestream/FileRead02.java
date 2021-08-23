package kh.com.fileio.filestream;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead02 {
	public static void main(String[] args) {
		// FileInputStream�� �޸� FileReader�� character������ �о��ش�.

		try (FileReader fr = new FileReader("test.txt"); 
				BufferedReader br = new BufferedReader(fr);) { 

			System.out.println(br.readLine()); // ������ �о�´�

			String line = "";
			while ((line = br.readLine()) != null) { //���پ� �о�ͼ� null���� ������ �����.
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
