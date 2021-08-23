package kh.com.fileio.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileWrite {
	public static void main(String[] args) {

		// FileWriter / BufferedWriter

		// FileWriter ���ڰ�(���ϸ�,false)�� �ָ� ���� �����͸� ���.
		// FileWriter ���ڰ�(���ϸ�,true)�� �ָ� ���� �����Ϳ� �߰���.
		try (FileWriter fw = new FileWriter("test02.txt", true); BufferedWriter bw = new BufferedWriter(fw);) {

			String str = "Discover interesting projects and people to populate your personal news feed. ";
			bw.write(str); // �����
			bw.flush(); // push�Ѵ�
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
