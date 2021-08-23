package kh.com.collection.arraylist;

import java.util.ArrayList;

public class ArrayListExam01 {
	public static void main(String[] args) {
		// Array vs ArrayList

		// ArrayList����
		ArrayList list = new ArrayList(); //ArrayList�� ��ü��(Object��) �迭�̴�
		
		// �� �߰�
		list.add("apple");
		list.add("banana");
		
		// �� ���
		System.out.println("arr.get(0) : " + list.get(0));
		System.out.println("arr.get(0) : " + list.get(1));
		
		// ���� �� �߰�
		list.add("kiwi");
		list.add("mango");
		
		// ���̰�
		System.out.println(list.size()); // length�� �ƴ϶� size�� ���
		
		// �� ����
		list.remove(0);
		
		// �ٸ��ڷ��� �� �߰�
		list.add(100);
		list.add(3.14);
		list.add(true);
		list.add('A');	
		
		// String���� char������ ����ȯ
		// Arraylist�� ��ü(Object)��� �ְ����� Arraylist��� �ڽ����� ��ӵǾ��ִ�
		// Arraylist�� ��ӵǾ������Ƿ� ������ ��ü�� �޼��常 ����Ҽ��ִ�.
		((String)list.get(0)).charAt(0); //�ڽ��� String���� �޼��带 ����ϰ������ String������ ��������ȯ���� String�� �޼��带 ����Ҽ��ִ�.
		
		
		//������
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i));
		}
		
	}
}
