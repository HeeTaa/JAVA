package kh.com.fileio.filestream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz01 {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("temp.txt"); BufferedReader br = new BufferedReader(fr);) {
			String line = "";
			while ((line = br.readLine()) != null) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
