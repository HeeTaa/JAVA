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
		init(); // �����ڸ� �ҷ��ö� ����ȭ�۾� ����
	}

	private void init() { // ����ȭ�۾�
		try {
			if (!file.exists()) { // ������ �����ϴ��� Ȯ��
				file.createNewFile(); // ������ ���������ʴ´ٸ� ���ϻ���
			} else {
				mPrint(); // ������ �����ϸ� �о����
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

		if (file.length() != 0) { // ����ũ�Ⱑ 0 (�����̾�����)�̸� �����о���� �������� EOF������ �߻��ϹǷ� ������ �ɾ��ش�
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
