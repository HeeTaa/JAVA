package kh.com.oop.homework_01;

public class WeatherStation {
	private String region;
	private Weather[] weather;
	private int index;

	WeatherStation() {
	}

	public WeatherStation(String region, Weather[] weather) {
		super();
		this.region = region;
		this.weather = weather;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	public void addWeather(Weather weather) {
		this.weather[index] = weather;
		index++;
	}

	public void printWeather() {
		System.out.println(region);
		for (int i = 0; i < weather.length; i++) {
			if (weather[i] != null) {
				System.out.print("��¥: " + weather[i].getDate() + " �µ�: " + weather[i].getTemperature() + " ����: "
						+ weather[i].getCondition());
				System.out.println();
			}
		}

	}

}
