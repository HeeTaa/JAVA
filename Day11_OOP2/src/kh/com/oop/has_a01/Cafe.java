package kh.com.oop.has_a01;

//has-a ���� 
public class Cafe {
	// �ع��ʵ� : name , branch
	private String name; // ī���
	private String branch; // ������
	private Worker[] worker; // WorkerŬ������ �迭 ����
	private int[] visitPerDay; // int�� �迭 �湮�ڼ�
	private int index = 0;   // worker�迭�� �ε�����ȣ�� 0���� ++���ֱ� ���� �뵵

	public Cafe() {
	}

	public Cafe(String name, String branch, Worker[] worker, int[] visitPerDay) {
		super();
		this.name = name;
		this.branch = branch;
		this.worker = worker;
		this.visitPerDay = visitPerDay;
	}

	public Worker[] getWorker() {
		return worker;
	}

	public void setWorker(Worker[] worker) {
		this.worker = worker;
	}

	public int[] getVisitPerDay() {
		return visitPerDay;
	}

	public void setVisitPerDay(int[] visitPerDay) {
		this.visitPerDay = visitPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void addWorker(Worker worker){
		this.worker[index] = worker;
		index++;
	}

}
