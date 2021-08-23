package kh.com.fileio.object02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import kh.com.fileio.object02.Person;

public class PersonWrite {	
	//����ȭ(Serialization) : ��ü�� �������� ������(����Ʈ)ȭ �ϴ°�  <-->������ȭ
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(881122, "������", '��'));
		list.add(new Person(000115, "�ǵ���", '��'));
		
		try(FileOutputStream fos = new FileOutputStream("person02.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeObject(list);  //��ü�� ����
			oos.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
