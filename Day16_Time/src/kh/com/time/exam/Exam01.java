package kh.com.time.exam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam01 {
	public static void main(String[] args) {

		long timeNow = System.currentTimeMillis(); // 현재 날짜 + 현재 시간 
		System.out.println(timeNow);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 시간형식 설정 월 :M대문자 분 : m소문자
		String now = sdf.format(timeNow); // 지정해준 형식으로 날짜 String값 반환
		System.out.println(now);

//		Date date = sdf.parse(now); // String형 시간을 자바에서 호환되는 Date형으로 반환
//		System.out.println(date);
//		long parsedTime = date.getTime(); // 시간을 다시 long형으로 변경
//		System.out.println(parsedTime);
		try {
			String time = "2021년 08월 24일 09:30:20";
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			getLongTime(now);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long getLongTime(String time) throws Exception { // 예외전가
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse(time);
		long parsedTime = date.getTime();
		return parsedTime;
	}

}
