package kh.com.opp.static_ex;

public class Calc {
	private int plus;
	private int minus;
	private int mply;
	private int divide;

	public Calc() {};
	
	public int getPlus() {
		return plus;
	}
	public void setPlus(int plus) {
		this.plus = plus;
	}
	public int getMinus() {
		return minus;
	}
	public void setMinus(int minus) {
		this.minus = minus;
	}
	public int getMply() {
		return mply;
	}
	public void setMply(int mply) {
		this.mply = mply;
	}
	public int getDivide() {
		return divide;
	}
	public void setDivide(int divide) {
		this.divide = divide;
	}

	public int plus(int plus, int plus2) {
		return plus + plus2;
	}

	public static int minus(int minus, int minus2) {
		return minus - minus2;
	}

	public int mply(int mply, int mply2) {
		return mply * mply2;
	}

	public static int divide(int divide, int divide2) {
		return divide / divide2;
	}

}
