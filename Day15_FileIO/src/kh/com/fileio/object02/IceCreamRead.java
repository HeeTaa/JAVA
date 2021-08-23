package kh.com.fileio.object02;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class IceCreamRead {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("icecream02.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			ArrayList<IceCream> list = new ArrayList<>();

			list = (ArrayList<IceCream>) ois.readObject();
			for (IceCream p : list) {
				System.out.println(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
