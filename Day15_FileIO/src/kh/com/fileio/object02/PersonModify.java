package kh.com.fileio.object02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonModify {
	public static void main(String[] args) {
		// ������ �ҷ�����
		try (FileInputStream fis = new FileInputStream("person02.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			ArrayList<Person> list = new ArrayList<>();

			list = (ArrayList<Person>) ois.readObject();
			// ���� ����
			for (Person p : list) {
				if (p.getName().equals("������")) {
					p.setBirth_date(880115);
					p.setName("������");
					p.setGender('��');
				}
			}

			// ���Ͽ� �ֱ�(������)
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

