package kh.com.collection.arraylist;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		// Array vs ArrayList

		// ArrayList생성
		ArrayList list = new ArrayList(); //ArrayList는 객체형(Object형) 배열이다
		
		// 값 추가
		list.add("apple");
		list.add("banana");
		
		// 값 출력
		System.out.println("arr.get(0) : " + list.get(0));
		System.out.println("arr.get(0) : " + list.get(1));
		
		// 값을 더 추가
		list.add("kiwi");
		list.add("mango");
		
		// 길이값
		System.out.println(list.size()); // length가 아니라 size를 사용
		
		// 값 삭제
		list.remove(0);
		
		// 다른자료형 값 추가
		list.add(100);
		list.add(3.14);
		list.add(true);
		list.add('A');	
		
		// String형을 char형으로 형변환
		// Arraylist는 객체(Object)라는 최고조상에 Arraylist라는 자식으로 상속되어있다
		// Arraylist는 상속되어있으므로 조상인 객체의 메서드만 사용할수있다.
		((String)list.get(0)).charAt(0); //자식인 String형의 메서드를 사용하고싶으면 String형으로 강제형변환으로 String의 메서드를 사용할수있다.
		
		
		//모두출력
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i));
		}
		
	}
}
