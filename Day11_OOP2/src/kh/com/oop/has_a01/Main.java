package kh.com.oop.has_a01;

public class Main {
	public static void main(String[] args) {

//		Worker worker1 = new Worker("001", "Tom", "0101231234");
//		Worker worker2 = new Worker("002", "Alley", "0105556666");
		int[] visitPerDay = new int[] { 100, 200, 300, 400, 500, 600, 700 };
		Worker[] worker = new Worker[5];
		Cafe starbucks = new Cafe("스타벅스", "역삼점", worker, visitPerDay);
		
		System.out.println(starbucks.getName());
		System.out.println(starbucks.getBranch());

//		System.out.println(starbucks.getWorker().getId()); // starbucks객체.Worker1객체.
//		System.out.println(starbucks.getWorker().getName());
//		System.out.println(starbucks.getWorker().getPhone());

		System.out.println(starbucks.getVisitPerDay()[0]); // starbucks객체.visitPerDay객체배열
		System.out.println(starbucks.getVisitPerDay()[1]);
		System.out.println(starbucks.getVisitPerDay()[2]);

		visitPerDay[2] = 350; // 아래코드와 같은결과
		starbucks.getVisitPerDay()[2] = 350; // ★객체배열은 getter로 값 변경. (getVisitPerDay는 visitPerDay 배열의 주소값을 반환해주기때문)

		int[] visitPerDay2 = new int[] { 800, 900, 1000 };
		starbucks.setVisitPerDay(visitPerDay2); // 만약 객체배열 구조 자체를 변경할떄는 setter를 사용한다
		
		worker[0] = new Worker("001","Tom","0101111"); //생성즉시 0번배열에 넣는방법
		
		Worker wk = new Worker("002","Alley","0102222"); //생성 후에
		worker[1] = wk; 							     //1번배열에 넣는방법
		
		worker[0].setName("Jessi");                //worker배열주소의 0번인덱스.setName
		starbucks.getWorker()[0].setName("Jessi"); //starbucks주소의.worker배열주소의 0번인덱스.setName
		System.out.println(worker[0].getName());   //worker배열주소의 0번인덱스.getName
		System.out.println(starbucks.getWorker()[0].getName());	//starbucks주소의.worker배열주소의 0번인덱스.getName	 
		
		//////////////////위의 방법은 여러번의 주소참조를 해야하므로 번거롭다. 아래방법은 addWorker라는 메서드를 이용
		starbucks.addWorker(new Worker("003","Tom","0103333"));   //배열객체 worker에 순차적으로 넣기  인자값은 new Worker("003","Tom","0103333") 즉 주소값이다.
		System.out.println(starbucks.getWorker()[0].getId());
	}
}
