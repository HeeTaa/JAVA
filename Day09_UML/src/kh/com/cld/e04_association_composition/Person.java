package kh.com.cld.e04_association_composition;

// association(연관) -> composition(구성)
// 연관된 클래스 간의 생명주기가 동일
//   Eyes <-◆ Person ◆-> Heart
public class Person {
	private Eyes eyes = new Eyes();
	private Heart heart = new Heart();

}
