package kh.com.oop.homework_01;

public class Weather {
	private String date;
	private int temperature;
	private String condition;
	
	Weather(){}

	public Weather(String date, int temperature, String condition) {
		super();
		this.date = date;
		this.temperature = temperature;
		this.condition = condition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	
}
