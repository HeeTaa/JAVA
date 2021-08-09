package kh.com.opp.homwork02_v2;

import java.util.Arrays;

import kh.com.opp.homework_02_v1.Student;

public class StudentDAO {
	private StudentDTO[] student = new StudentDTO[5];
	private int index = 0;

	public void add(StudentDTO std) {
		student[index++] = std;
	}

	public void increaseCapacity() {
		if (index == student.length) {
			student = Arrays.copyOf(student, student.length * 2);
		}
	}

	public void printAll() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null)
				System.out.println(student[i].getNo() + " : " + student[i].getName() + " : " + student[i].getAge()
						+ " : " + student[i].getGender());
		}
	}

	public void modify(int no, String name, int age, char gender) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && no == student[i].getNo()) {
				student[i].setName(name);
				student[i].setAge(age);
				student[i].setGender(gender);
			}
		}
	}

	public void delete(int no) {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null && no == student[i].getNo()) {
				student[i] = null;
			}
		}
	}
}
