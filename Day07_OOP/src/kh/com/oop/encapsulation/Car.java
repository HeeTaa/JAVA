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
	public void setBrand(String brand) {			   //brand��� �Ű������� �޾Ƽ�
		this.brand = brand; //this : �ڱ��ڽ��� �����ϴ�   //�ڱ��ڽ� brand������ �Ű������� �־��ش� 
	}
	public String getBrand() {
		return this.brand;
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
