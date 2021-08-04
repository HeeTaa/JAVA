package kh.com.opp.homework_oop;

public class Message {
	//멤버필드
	private String Writer;
	private String message;
	private String day;

	Message() { // 기본생성자
	};

	// 생성자
	public Message(String writer, String message, String day) {
		super();
		Writer = writer;
		this.message = message;
		this.day = day;
	}

	// getter,setter
	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public void printAll() {
		System.out.println(Writer + message + day);
	}

}
