package kh.com.fileio.object02;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import kh.com.fileio.object02.Person;

public class PersonWrite {	
	//직렬화(Serialization) : 객체를 연속적인 데이터(바이트)화 하는것  <-->역직렬화
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person(881122, "김희태", '남'));
		list.add(new Person(000115, "권도연", '여'));
		
		try(FileOutputStream fos = new FileOutputStream("person02.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);){
			oos.writeObject(list);  //객체로 쓴다
			oos.flush();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
