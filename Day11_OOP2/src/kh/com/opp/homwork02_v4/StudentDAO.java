package kh.com.opp.homwork02_v4;

import java.util.ArrayList;

public class StudentDAO {
	private ArrayList<StudentDTO> student = new ArrayList<>();

	public void add(StudentDTO student) {
		this.student.add(student);
	}

	public ArrayList<StudentDTO> printAll() {
//		for (int i = 0; i < this.student.size(); i++) {
//			System.out.println(this.student.get(i).getNo() + " : " + this.student.get(i).getName() + " : "
//					+ this.student.get(i).getAge() + " : " + this.student.get(i).getGender());
//		}

//		for(StudentDTO std : student) {
//			System.out.println(std);    //toString()�� �ڿ� ������ �����Ƿ� �ּҰ��� �ƴ� ���ϴ� ���� ��� �ȴ�.

		return student; // ��±���� UI�� �ִ°� �����Ƿ� student���� �������ְ� Main���� ���
	}

	public StudentDTO selectByNo(int no) {
		for (StudentDTO std : student) {
			if (std.getNo() == no) {
				return std;                  //��ġ�ϴ°� ������ std�ּҰ� ����
			}
		}
		return null;                         //��ġ�ϴ°� ������ null�� ����
	}

	public boolean doesNoExist(int no) {
		for (StudentDTO std : student) {
			if (std.getNo() == no) {
				return true;
			}
		}
		return false;
	}

	public void modify(StudentDTO student) {
		for (int i = 0; i < this.student.size(); i++) {
			if (this.student.get(i).getNo() == student.getNo()) {
				this.student.set(i, student);
			}
		}
	}

	public void delete(int no) {
//		for (int i = 0; i < student.size(); i++) {
//			if (this.student.get(i).getNo() == no) {
//				student.remove(i);
//			}
//		}
		StudentDTO d = selectByNo(no);  //���� �ּ�ó���� �ݺ���,���ǹ� ����� selectByNo�޼���� ����� ����
		student.remove(d);
	}
}
