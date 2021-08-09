package kh.com.opp.has_a02;

public class Shop {
	private String name;
	private String openTime;
	private String closeTime;
	private IceCream[] iceCream;
	private int[] incomePerDay;
	private int index = 0;

	public Shop() {
	}

	public Shop(String name, String openTime, String closeTime, IceCream[] iceCream, int[] incomePerDay) {
		super();
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.iceCream = iceCream;
		this.incomePerDay = incomePerDay;
	}

	public int[] getIncomePerDay() {
		return incomePerDay;
	}

	public void setIncomePerDay(int[] incomePerDay) {
		this.incomePerDay = incomePerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public IceCream[] getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream[] iceCream) {
		this.iceCream = iceCream;
	}

	public void addIceCream(IceCream iceCream) {
		this.iceCream[index] = iceCream;
		index++;
	}

}
