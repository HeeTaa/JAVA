package kh.com.time.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam01 {
	public static void main(String[] args) {

		long timeNow = System.currentTimeMillis(); // ���� ��¥ + ���� �ð� 
		System.out.println(timeNow);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // �ð����� ���� �� :M�빮�� �� : m�ҹ���
		String now = sdf.format(timeNow); // �������� �������� ��¥ String�� ��ȯ
		System.out.println(now);

//		Date date = sdf.parse(now); // String�� �ð��� �ڹٿ��� ȣȯ�Ǵ� Date������ ��ȯ
//		System.out.println(date);
//		long parsedTime = date.getTime(); // �ð��� �ٽ� long������ ����
//		System.out.println(parsedTime);
		try {
			String time = "2021�� 08�� 24�� 09:30:20";
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			getLongTime(now);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long getLongTime(String time) throws Exception { // ��������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse(time);
		long parsedTime = date.getTime();
		return parsedTime;
	}

}
