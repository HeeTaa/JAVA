package kh.com.fileio.filestream;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead02 {
	public static void main(String[] args) {
		// FileInputStream과 달리 FileReader는 character단위로 읽어준다.

		try (FileReader fr = new FileReader("test.txt"); 
				BufferedReader br = new BufferedReader(fr);) { 

			System.out.println(br.readLine()); // 한줄을 읽어온다

			String line = "";
			while ((line = br.readLine()) != null) { //한줄씩 읽어와서 null값을 만나면 멈춘다.
				System.out.println(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
