package kh.com.fileio.object;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class IceCreamRead {
	public static void main(String[] args) {

		try (FileReader fr = new FileReader("icecream.txt"); BufferedReader br = new BufferedReader(fr);) {
			String line = "";
			ArrayList<IceCream> list = new ArrayList<>();
			while ((line = br.readLine()) != null) {
				String[] arr = line.split(", ");

				String name = arr[0];
				int price = Integer.parseInt(arr[1]);
				String expiry_date = arr[2];
				list.add(new IceCream(name, price, expiry_date));
			}
			System.out.println(list.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
