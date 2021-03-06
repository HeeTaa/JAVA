package kh.com.opp.homework;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberDTO> mDTO = new ArrayList<>();
		
	public void mAdd(MemberDTO mDTO) {
		this.mDTO.add(mDTO);
	}

	public ArrayList<MemberDTO> mPrint() {
		return mDTO;
	}

	public MemberDTO selectById(String id) {
		for (MemberDTO std : mDTO) {
			if (std.getId().equals(id)) {
				return std;
			}
		}
		return null;
	}

	public MemberDTO mNickSearch(String nickname) {
		for (MemberDTO std : mDTO) {
			if (std.getNickname().equals(nickname)) {
				return std;
			}
		}
		return null;
	}

	public boolean olId(String id) {
		for (MemberDTO std : mDTO) {
			if (std.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public boolean olNick(String nickname) {
		for (MemberDTO std : mDTO) {
			if (std.getNickname().equals(nickname)) {
				return true;
			}
		}
		return false;
	}

	public void mModify(String id, String nickname, int point) {
		for (MemberDTO std : mDTO) {
			if (std.getId().equals(id)) {
				std.setNickname(nickname);
				std.setPoint(point);
			}

		}
	}

	public void mDelete(String id) {
		mDTO.remove(selectById(id));
	}

}
