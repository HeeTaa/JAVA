package kh.com.opp.homeworkv2;

public class Basic extends MemberDTO {
	public Basic() {
	}

	public Basic(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);

	}

	public String getMemberShip() {
		return "Basic";
	}
}
