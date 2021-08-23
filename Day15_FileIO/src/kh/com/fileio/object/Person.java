package kh.com.fileio.object;

public class Person {
	private int birth_date;
	private String name;
	private char gender;

	public Person() {
	}

	public Person(int birth_date, String name, char gender) {
		super();
		this.birth_date = birth_date;
		this.name = name;
		this.gender = gender;
	}

	public int getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(int birth_date) {
		this.birth_date = birth_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String toString() {
		return birth_date + ":" + name + ":" + gender;
	}
}
