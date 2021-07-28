
public class Exam03_Remove {
	public static void main(String[] args) {

		// 조건문 써서 arr배열의 1번 인덱스(2라는값)는 빼고 나머지 인덱스만 옮겨담기.
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int[] temp = new int[arr.length - 1];

		for (int i = 0, j = 0; i < arr.length; i++) {
										  
			if (arr[i] == 2) {            //arr 1번인덱스의 2라는값을 만나면 
				continue;                 //아래 j++을 건너뛴다
			}
			temp[j++] = arr[i];           // j = i 같은값으로 증가하다가 위에 continue로 인해 j값이 낮아지면서 밀어낸다   
		}
	}
}
