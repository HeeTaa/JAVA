package kh.com.cld.e03_association_aggregation;

// association(연관) -> aggregation(집합)
// 인스턴스의 생명주기가 일치하지 않는 관계
//    Glasses <-◇  Person  ◇-> Watch
public class Person {

	public Person() {
	}

	private Glasses glasses;
	private Watch watch;

	public Person(Glasses glasses, Watch watch) {
		super();
		this.glasses = glasses;
		this.watch = watch;
	}

	public Glasses getGlasses() {
		return glasses;
	}

	public void setGlasses(Glasses glasses) {
		this.glasses = glasses;
	}

	public Watch getWatch() {
		return watch;
	}

	public void setWatch(Watch watch) {
		this.watch = watch;
	}
}
