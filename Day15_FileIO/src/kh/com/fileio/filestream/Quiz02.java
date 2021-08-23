package kh.com.fileio.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Quiz02 {
	public static void main(String[] args) {
		//FileWriter / BufferedWriter�� ����Ͽ� ���� �����غ��� 
		//1. ���� ��ü�� �����  2.�ִ� ���뿡 �߰��ϱ�
		try (FileWriter fw = new FileWriter("test02.txt", true); BufferedWriter bw = new BufferedWriter(fw);) {
			String str = "\nsasdfasdfsadfdfsvsdvvsdfasdfdfdrwerwerwerwer";
			bw.write(str);
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
