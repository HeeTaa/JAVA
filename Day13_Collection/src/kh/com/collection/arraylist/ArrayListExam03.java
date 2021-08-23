package kh.com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam03 {
	public static void main(String[] args) {
		
		ArrayList tempArr = new ArrayList();  //단점 : 1. 객체형을 사용하기 때문에 매 사용마다 다운캐스팅해야하는 번거로움이 있다, 2. 모든형태의 형을 저장해놓았기 때문에 관리나 사용을 하기 힘들다.
		ArrayList<String> strArr = new ArrayList<>(); //해결 : 제네릭(Generic)을 사용해서 해당 ArrayList의 타입을 정해 줌 
		
		tempArr.add("Hello");
		tempArr.add(150);		
		strArr.add("무야호");
		
	
		
		
		
		//ArrayList 여러기능//
		
		// 여러 ArrayList만들기	
				// int -> Integer 
				// char -> Character	
				ArrayList<Integer> intArr = new ArrayList<>();
				ArrayList<Character> charArr = new ArrayList<>();
				ArrayList<Long> longArr = new ArrayList<>();
				ArrayList<Double> doubleArr = new ArrayList<>();
				ArrayList<Float> floatArr = new ArrayList<>();
				
		//초기 사이즈 지정
		ArrayList<String> strArr2 = new ArrayList<>(5);  
		
		// Array.asList() , List.of() 를 통해 초기값 지정
		ArrayList<String> strArr3 = new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> strArr4 = new ArrayList<>(List.of("a","b","c"));
		
		// indexOf 특정 값을 찾아서 인덱스를 가져오고 싶을 때 사용
		System.out.println(strArr3.indexOf("c"));
		
		// 값 수정 
		strArr4.set(2,"d");
		System.out.println(strArr4.get(2));
		
		//toString()    // 기본String형 변수에 붙이면 주소값을 출력     String형 ArryList에 붙이면 모든값을 출력  		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("a");
		arr2.add("b");
		arr2.add("c");
		System.out.println(arr2); //arr2.toString() 이렇게 숨겨져있다.
		
		
		
		
		
		
	}
}
