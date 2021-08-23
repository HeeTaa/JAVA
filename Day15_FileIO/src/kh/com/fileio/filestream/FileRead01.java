package kh.com.fileio.filestream;

import java.io.FileInputStream;

public class FileRead01 {
	public static void main(String[] args) {

//		FileInputStream fis = null;
//		try {
//			// ������ �о�鿩���� ���ؼ� �����ִ� ������ ���(��Ʈ��)
//			fis = new FileInputStream("test.txt");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally { // finally�� ���ܰ� �߻��ߵ� ���ߵ� �������� �ݵ�� ����ȴ�.
//			try {
//				fis.close(); // ���ϰ�ü�� ����Ҷ� �׻� �ݾ�����Ѵ�. ���߿� ���������.
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		//���� ����� �ʹ� �����ϴ� ���ϰ� try with resource�� ��� 
		try(FileInputStream fis = new FileInputStream("test.txt")) { // ������ �о�鿩���� ���ؼ� �����ִ� ������ ���(��Ʈ��)
			
			//FileInputStream�� read()�� 1����Ʈ�� �о�´�.(�ѱ��� 2~3����Ʈ�� ©����)
			System.out.println((char)fis.read());
			
			//����Ʈ�� �迭�� ���� txt������ �ѹ��� �о��ش�
			byte[] arr = new byte[100];
			fis.read(arr);
			
			for(byte b : arr) {
				System.out.println((char)b);    //����Ʈ�� char������ ����ȯ�ؼ� ���
			}
			
			System.out.println(new String(arr)); //����Ʈ�� ���ڿ��� ���
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
