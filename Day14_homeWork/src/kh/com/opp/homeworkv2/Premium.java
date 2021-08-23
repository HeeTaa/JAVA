package kh.com.opp.homeworkv2;

public class Premium extends MemberDTO {
	public Premium() {
	}

	public Premium(String id, String nickname, String signup_date, int point) {
		super(id, nickname, signup_date, point);
	}

	public String getMemberShip() {
		return "Premium";
	}
}