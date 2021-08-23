package kh.com.fileio.object;

import java.io.FileWriter;
import java.util.ArrayList;

public class IceCreamWrite {
	public static void main(String[] args) {
		// ����Ʈ ����
		ArrayList<IceCream> list = new ArrayList<>();

		// IceCream ��ü�� �ؽ�Ʈ���Ϸ� ������ ����

		list.add(new IceCream("���κ������Ʈ", 3000, "210925"));
		list.add(new IceCream("���Ʈ", 3500, "221010"));

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
