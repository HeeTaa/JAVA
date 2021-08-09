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
				System.out.print("날짜: " + weather[i].getDate() + " 온도: " + weather[i].getTemperature() + " 상태: "
						+ weather[i].getCondition());
				System.out.println();
			}
		}

	}

}
