package kh.com.time.student01;

import java.text.SimpleDateFormat;

public class Student {
	private int no;
	private String name;
	private long register_date;

	public Student() {
	}

	public Student(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		this.register_date = System.currentTimeMillis(); // �л��� ����Ҷ� time���� ���� �ʰ� �ٷ� �־���
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

	public long getRegister_date() {
		return register_date;
	}

	public void setRegister_date(long register_date) {
		this.register_date = register_date;
	}

	public String toString() {
		return no + "\t " + name + "\t" + getDate(register_date);
	}
	
	public String getDate(long register_date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");		
		return sdf.format(register_date);
	}
}
