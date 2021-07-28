
public class Exam02_String {

	public static String greeting(String str) {
		if ("Hello".equals(str)) {
			return "Hi";
		} else if ("Bye".equals(str)) {
			return "See you";
		} else {
			return "none";
		}
	}
	
	public static void sayHi(String str){
		if(str.equals("Hi")) {
			System.out.println("Hi");  //void는 리턴을 하지 못하기 때문에 메서드 안에서 출력
		}
			
	}
	
	public static void sayBye(){       //인자값이 없이 호출되었으므로 매개변수 또한 없다.
			System.out.println("Bye");  //void이므로 메서드에서 직접 출력하거나 	
	}								    //void를 String으로 바꿔서 스트링값으로 리턴	

	public static void main(String[] args) {
		// Hello 라고 인자값을 넘기면 Hi라고 리턴
		// Bye 라고 인자값을 넘기면 See you를 리턴
		// Hello나 Bye가 아닌값을 넘기면 none을 리턴

		System.out.println(greeting("Hello"));
		System.out.println(greeting("Bye"));
		System.out.println(greeting("sasdf"));
       
		
		//Hi라고 인자값을 넘기면 Hi라고 리턴 
		//그 외의 값은 아무것도 출력하지 않는다. // void
		
		sayHi("Hi");
		sayHi("sdfsdf");
		
		//sayBye 메서드를 호출하면 "Bye"를 출력
		sayBye();       // 인자값 없이 메서드만 호출한다
		
		
		
		
		
	}
}
