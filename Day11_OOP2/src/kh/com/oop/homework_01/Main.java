package kh.com.oop.homework_01;

public class Main {
	public static void main(String[] args) {
		Weather[] weather = new Weather[7];
		WeatherStation weatherStation = new WeatherStation("����",weather);
		System.out.println();
		
		//������ġ ���������Է� + addWeather(new Weather("Date",Temperature,"Condition"))
		weatherStation.addWeather(new Weather("8��6��",20,"����"));
		weatherStation.addWeather(new Weather("8��7��",19,"��"));
		weatherStation.addWeather(new Weather("8��8��",22,"����"));
		weatherStation.addWeather(new Weather("8��9��",15,"�帲"));
		weatherStation.addWeather(new Weather("8��10��",26,"����"));
		weatherStation.addWeather(new Weather("8��11��",19,"��"));
		weatherStation.addWeather(new Weather("8��12��",17,"����"));
		
		//Weather�� �ν��Ͻ� ���������� ���� ���
		System.out.println(weatherStation.getRegion());
		System.out.println(weatherStation.getWeather()[0].getDate());
		
		//Weather�� �ν��Ͻ� ���������� ���� ����
		weatherStation.setRegion("�д�");
		weatherStation.getWeather()[0].setTemperature(21);
		
		//Weather�� �ν��Ͻ� ���������� ���� ����	
		weatherStation.getWeather()[6] = null;
		
		//printWeather()
		weatherStation.printWeather();
		
	}
}
