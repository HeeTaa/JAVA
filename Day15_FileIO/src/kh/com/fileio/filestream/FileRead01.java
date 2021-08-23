package kh.com.fileio.filestream;

import java.io.FileInputStream;

public class FileRead01 {
	public static void main(String[] args) {

//		FileInputStream fis = null;
//		try {
//			// 파일을 읽어들여오기 위해서 열어주는 데이터 통로(스트림)
//			fis = new FileInputStream("test.txt");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { // finally는 예외가 발생했든 안했든 마지막에 반드시 실행된다.
//			try {
//				fis.close(); // 파일객체를 사용할땐 항상 닫아줘야한다. 나중에 오류생긴다.
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		//위의 방법은 너무 복잡하다 편하게 try with resource을 사용 
		try(FileInputStream fis = new FileInputStream("test.txt")) { // 파일을 읽어들여오기 위해서 열어주는 데이터 통로(스트림)
			
			//FileInputStream의 read()는 1바이트씩 읽어온다.(한글은 2~3바이트라서 짤린다)
			System.out.println((char)fis.read());
			
			//바이트형 배열을 만들어서 txt파일을 한번에 읽어준다
			byte[] arr = new byte[100];
			fis.read(arr);
			
			for(byte b : arr) {
				System.out.println((char)b);    //바이트를 char단위로 형변환해서 출력
			}
			
			System.out.println(new String(arr)); //바이트를 문자열로 출력
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
