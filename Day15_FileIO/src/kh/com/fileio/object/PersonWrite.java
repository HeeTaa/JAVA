package kh.com.fileio.object;

import java.io.FileWriter;
import java.util.ArrayList;

public class PersonWrite {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();

		try (FileWriter fw = new FileWriter("person.txt", true);) {
			list.add(new Person(881122, "±Ë»Ò≈¬", '≥≤'));
			list.add(new Person(000115, "±«µµø¨", 'ø©'));
			for (Person p : list) {
				fw.write(p.toString() + "\n");
			}
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
