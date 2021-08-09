package kh.com.oop.has_a01;

public class WorkerArray {
	public static void main(String[] args) {

		// 객체 배열의 생성
		Worker[] wk = new Worker[5];

		Worker w0 = new Worker("001", "Tom", "01011111111");
		wk[0] = w0; // w0의 주소값을 wk[0]배열에 넣었으니 두 변수는 같은 주소값을 가지고있다.
		System.out.println(w0.getId()); // w0과
		System.out.println(wk[0].getId()); // wk[0]은 같은 주소값을 가지고있으니 같은 Id를 출력한다.
		wk[0] = null; // wk[0]의 주소값만 삭제된다. w0의 주소값과 객체가 남아있다 만약 w0 = null까지 한다면 0번 배열객체는 삭제된다.

		wk[1] = new Worker("002", "Alley", "01022222222");
		for (int i = 0; i < wk.length; i++) {
			if (wk[i] != null) {
				System.out.println(wk[i].getId());
				System.out.println(wk[i].getName());
				System.out.println(wk[i].getPhone());
			}
		}
		wk[1] = null; // wk[1]의 주소값이 삭제된다. wk[1]배열객체는 삭제된다.

		wk[2] = new Worker("003", "Kim", "01033333333");
	}
}
