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
//			System.out.println(std);    //toString()이 뒤에 숨겨져 있으므로 주소값이 아닌 원하는 값이 출력 된다.

		return student; // 출력기능은 UI에 넣는게 좋으므로 student값만 리턴해주고 Main에서 출력
	}

	public StudentDTO selectByNo(int no) {
		for (StudentDTO std : student) {
			if (std.getNo() == no) {
				return std;                  //일치하는게 있으면 std주소값 리턴
			}
		}
		return null;                         //일치하는게 없으면 null값 리턴
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
		StudentDTO d = selectByNo(no);  //위의 주석처리된 반복문,조건문 기능은 selectByNo메서드와 기능이 같다
		student.remove(d);
	}
}
