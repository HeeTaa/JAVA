package kh.com.cld.e03_association_aggregation;

// association(����) -> aggregation(����)
// �ν��Ͻ��� �����ֱⰡ ��ġ���� �ʴ� ����
//    Glasses <-��  Person  ��-> Watch
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
