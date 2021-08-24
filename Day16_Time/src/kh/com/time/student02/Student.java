package kh.com.time.student02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	private int no;
	private String name;
	private long register_date;

	public Student() {
	}

	public Student(int no, String name, String register_date) {
		super();
		this.no = no;
		this.name = name;
		this.register_date = setDate(register_date); // �л��� ����Ҷ� time���� ���� �ʰ� �ٷ� �־���
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

	public Long setDate(String register_date) { // String�� "yyyy/MM/dd" ������ �޾Ƽ� Long�� (Date)�ð����·� ��ȯ

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date = sdf.parse(register_date);
			return date.getTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getDate(long register_date) { // Long�� (Date)�ð����·� �޾Ƽ� String�� "yyyy��MM��dd��" ���ĺ�ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");		
		return sdf.format(register_date);
	}
}
