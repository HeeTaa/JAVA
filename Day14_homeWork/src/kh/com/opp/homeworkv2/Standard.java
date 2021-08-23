package kh.com.opp.homeworkv2;

public class Standard extends MemberDTO {
	public Standard() {
	}

	public Standard(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}

	public String getMemberShip() {
		return "Stand";
	}
}
