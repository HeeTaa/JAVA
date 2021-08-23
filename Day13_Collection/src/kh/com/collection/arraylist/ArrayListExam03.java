package kh.com.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam03 {
	public static void main(String[] args) {
		
		ArrayList tempArr = new ArrayList();  //���� : 1. ��ü���� ����ϱ� ������ �� ��븶�� �ٿ�ĳ�����ؾ��ϴ� ���ŷο��� �ִ�, 2. ��������� ���� �����س��ұ� ������ ������ ����� �ϱ� �����.
		ArrayList<String> strArr = new ArrayList<>(); //�ذ� : ���׸�(Generic)�� ����ؼ� �ش� ArrayList�� Ÿ���� ���� �� 
		
		tempArr.add("Hello");
		tempArr.add(150);		
		strArr.add("����ȣ");
		
	
		
		
		
		//ArrayList �������//
		
		// ���� ArrayList�����	
				// int -> Integer 
				// char -> Character	
				ArrayList<Integer> intArr = new ArrayList<>();
				ArrayList<Character> charArr = new ArrayList<>();
				ArrayList<Long> longArr = new ArrayList<>();
				ArrayList<Double> doubleArr = new ArrayList<>();
				ArrayList<Float> floatArr = new ArrayList<>();
				
		//�ʱ� ������ ����
		ArrayList<String> strArr2 = new ArrayList<>(5);  
		
		// Array.asList() , List.of() �� ���� �ʱⰪ ����
		ArrayList<String> strArr3 = new ArrayList<>(Arrays.asList("a","b","c"));
		ArrayList<String> strArr4 = new ArrayList<>(List.of("a","b","c"));
		
		// indexOf Ư�� ���� ã�Ƽ� �ε����� �������� ���� �� ���
		System.out.println(strArr3.indexOf("c"));
		
		// �� ���� 
		strArr4.set(2,"d");
		System.out.println(strArr4.get(2));
		
		//toString()    // �⺻String�� ������ ���̸� �ּҰ��� ���     String�� ArryList�� ���̸� ��簪�� ���  		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("a");
		arr2.add("b");
		arr2.add("c");
		System.out.println(arr2); //arr2.toString() �̷��� �������ִ�.
		
		
		
		
		
		
	}
}
