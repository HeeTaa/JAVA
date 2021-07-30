package kh.com.oop.encapsulation;

// ĸ��ȭ(encapsulation) -> ��������

//   ����������
//   public : ��� Ŭ�������� ������ ������
//   private : �ش� Ŭ���������� ������ ���������� getter,setter�� �̿��� ������ ������ش�.
//   package(default) : ���� ��Ű�� �������� ���� ������
//   protected : ���� ��Ű������ Ŭ������ �ش� Ŭ������ ��� �޾����� ���� ������

public class Car {
	// �Ӽ� : ����ʵ�(�������)
	// �Ϲ������� �ڹٿ��� ��ü�� ���赵(Ŭ����)�� �ۼ��Ҷ� ��������� private ���������ڷ� �����ϱ�� ����ߴ�.
	private String brand;
	private int speed;
	private int price;
	
	//getter / setter // ��Ŭ�� -> source -> getter setter ���� �ڵ����� ��������
	public void setBrand(String brand) {	//�Ű��������� ���������� �Ȱ������ִ°��� ����.		   
		if(brand.equals("Kia")) {    //������ �־��༭ �ٸ� �����Ͱ��� �����Ѵ�.
		this.brand = brand; //this : �ڱ��ڽ��� �����ϴ�   //�ڱ��ڽ� brand������ �Ű������� �־��ش� 
		}
	}
	public String getBrand() {
		return this.brand;
	}	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void speedUp() {
		speed += 1;	
		System.out.println(speed);
	}
	void speedDown() {
		speed -= 1;	
		System.out.println(speed);
	}
	void powerOn() {
		System.out.println("�õ� on");
	}
	void powerOff() {
		System.out.println("�õ� off");
	}
}
