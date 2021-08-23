package kh.com.fileio.object;

import java.io.FileWriter;
import java.util.ArrayList;

public class IceCreamWrite {
	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<IceCream> list = new ArrayList<>();

		// IceCream 객체를 텍스트파일로 데이터 저장

		list.add(new IceCream("레인보우샤베트", 3000, "210925"));
		list.add(new IceCream("요거트", 3500, "221010"));

		try (FileWriter fw = new FileWriter("icecream.txt", true);) {
			for (IceCream i : list) {
				fw.write(i.toString() + "\n");
			}
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
