package kh.com.cld.e04_association_composition;

// association(����) -> composition(����)
// ������ Ŭ���� ���� �����ֱⰡ ����
//   Eyes <-�� Person ��-> Heart
public class Person {
	private Eyes eyes = new Eyes();
	private Heart heart = new Heart();

}
