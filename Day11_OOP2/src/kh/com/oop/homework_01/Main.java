package kh.com.oop.homework_01;

public class Main {
	public static void main(String[] args) {
		Weather[] weather = new Weather[7];
		WeatherStation weatherStation = new WeatherStation("성남",weather);
		System.out.println();
		
		//일주일치 날씨정보입력 + addWeather(new Weather("Date",Temperature,"Condition"))
		weatherStation.addWeather(new Weather("8월6일",20,"맑음"));
		weatherStation.addWeather(new Weather("8월7일",19,"비"));
		weatherStation.addWeather(new Weather("8월8일",22,"맑음"));
		weatherStation.addWeather(new Weather("8월9일",15,"흐림"));
		weatherStation.addWeather(new Weather("8월10일",26,"맑음"));
		weatherStation.addWeather(new Weather("8월11일",19,"비"));
		weatherStation.addWeather(new Weather("8월12일",17,"맑음"));
		
		//Weather형 인스턴스 참조변수를 통해 출력
		System.out.println(weatherStation.getRegion());
		System.out.println(weatherStation.getWeather()[0].getDate());
		
		//Weather형 인스턴스 참조변수를 통해 수정
		weatherStation.setRegion("분당");
		weatherStation.getWeather()[0].setTemperature(21);
		
		//Weather형 인스턴스 참조변수를 통해 삭제	
		weatherStation.getWeather()[6] = null;
		
		//printWeather()
		weatherStation.printWeather();
		
	}
}
