package kh.com.fileio.filestream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Quiz02 {
	public static void main(String[] args) {
		//FileWriter / BufferedWriter를 사용하여 파일 수정해보기 
		//1. 내용 전체를 덮어쓰기  2.있는 내용에 추가하기
		try (FileWriter fw = new FileWriter("test02.txt", true); BufferedWriter bw = new BufferedWriter(fw);) {
			String str = "\nsasdfasdfsadfdfsvsdvvsdfasdfdfdrwerwerwerwer";
			bw.write(str);
			bw.flush();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
