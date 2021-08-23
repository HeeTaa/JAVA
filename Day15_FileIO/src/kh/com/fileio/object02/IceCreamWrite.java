package kh.com.fileio.object02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class IceCreamWrite {
	public static void main(String[] args) {

		ArrayList<IceCream> list = new ArrayList<>();

		list.add(new IceCream("레인보우샤베트", 3000, "210925"));
		list.add(new IceCream("요거트", 3500, "221010"));

		try (FileOutputStream fos = new FileOutputStream("icecream02.txt", true);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
