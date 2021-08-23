package kh.com.fileio.object02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonModify {
	public static void main(String[] args) {
		// 파일을 불러오기
		try (FileInputStream fis = new FileInputStream("person02.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			ArrayList<Person> list = new ArrayList<>();

			list = (ArrayList<Person>) ois.readObject();
			// 내용 수정
			for (Person p : list) {
				if (p.getName().equals("김희태")) {
					p.setBirth_date(880115);
					p.setName("권희태");
					p.setGender('남');
				}
			}

			// 파일에 넣기(덮어씌운다)
			try (FileOutputStream fos = new FileOutputStream("person02.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(list);
				oos.flush();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

