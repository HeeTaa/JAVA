package kh.com.oop.has_a01;

//has-a 관계 
public class Cafe {
	// 멈버필드 : name , branch
	private String name; // 카페명
	private String branch; // 지점명
	private Worker[] worker; // Worker클래스형 배열 직원
	private int[] visitPerDay; // int형 배열 방문자수
	private int index = 0;   // worker배열의 인덱스번호를 0부터 ++해주기 위한 용도

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
