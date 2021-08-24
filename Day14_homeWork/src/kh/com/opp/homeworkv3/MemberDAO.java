package kh.com.opp.homeworkv3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberDTO> mDTO = new ArrayList<>();
	private String file_name = "netflix.txt";
	File file = new File(file_name);

	public MemberDAO() {
		init(); // 생성자를 불러올때 동기화작업 실행
	}

	private void init() { // 동기화작업
		try {
			if (!file.exists()) { // 파일이 존재하는지 확인
				file.createNewFile(); // 파일이 존재하지않는다면 파일생성
			} else {
				mPrint(); // 파일이 존재하면 읽어오기
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void mAdd(MemberDTO mDTO) {
		this.mDTO.add(mDTO);
		writeAll();
	}

	public void writeAll() {
		try (FileOutputStream fos = new FileOutputStream(file_name);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(mDTO);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public ArrayList<MemberDTO> mPrint() {

		if (file.length() != 0) { // 파일크기가 0 (내용이없으면)이면 내용읽어오는 과정에서 EOF오류가 발생하므로 조건을 걸어준다
			try (FileInputStream fis = new FileInputStream(file_name);
					ObjectInputStream ois = new ObjectInputStream(fis);) {
				mDTO = (ArrayList<MemberDTO>) ois.readObject();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mDTO;
	}

	public MemberDTO selectById(String id) {

		for (MemberDTO m : mDTO) {
			if (m.getId().equals(id)) {
				return m;
			}
		}
		return null;
	}

	public MemberDTO mNickSearch(String nickname) {

		for (MemberDTO m : mDTO) {
			if (m.getNickname().equals(nickname)) {
				return m;
			}
		}
		return null;
	}

	public boolean olId(String id) {
		for (MemberDTO m : mDTO) {
			if (m.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public boolean olNick(String nickname) {
		for (MemberDTO m : mDTO) {
			if (m.getNickname().equals(nickname)) {
				return true;
			}
		}
		return false;
	}

	public void mModify(String id, String nickname, int point) {

		for (MemberDTO m : mDTO) {
			if (m.getId().equals(id)) {
				m.setNickname(nickname);
				m.setPoint(point);
				writeAll();
			}
		}
	}

	public void mDelete(String id) {
		for (MemberDTO m : mDTO) {
			if (m.getId().equals(id)) {
				mDTO.remove(m);
				writeAll();
				break;
			}
		}

	}
	
	public String getDate(long signup_date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return sdf.format(signup_date);
	}
}
