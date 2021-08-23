package kh.com.opp.homwork02_v4;

public class StudentDTO {
	private int no;
	private String name;
	private int age;
	private char gender;

	public StudentDTO() {
	}

	public StudentDTO(int no, String name, int age, char gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String toString() {               // 출력용 오버라이딩
		return no + " : " + name + " : " + age + " : " + gender;
	}
}
