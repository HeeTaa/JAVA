package kh.com.fileio.object02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class PersonRead {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("person02.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			ArrayList<Person> list = new ArrayList<>();

			list = (ArrayList<Person>)ois.readObject(); // 오브젝트형을 Arraylist에 넣을수 없으므로 다운캐스팅해준다
			for (Person p : list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
