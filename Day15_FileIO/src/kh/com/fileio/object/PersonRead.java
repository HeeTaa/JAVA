package kh.com.fileio.object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class PersonRead {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();

		try (FileReader fr = new FileReader("person.txt"); BufferedReader br = new BufferedReader(fr);) {
			String line = "";

			while ((line = br.readLine()) != null) {
				String[] arr = line.split(":");

				int birth_date = Integer.parseInt(arr[0]);
				String name = arr[1];
				char gender = arr[2].charAt(0);
				list.add(new Person(birth_date, name, gender));
			}
			for (Person p : list) {
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
