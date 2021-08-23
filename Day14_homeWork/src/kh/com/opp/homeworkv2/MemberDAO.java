package kh.com.opp.homeworkv2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberDTO> mDTO = new ArrayList<>();

	public void mAdd(MemberDTO mDTO) {

		try (FileOutputStream fos = new FileOutputStream("netflix.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			this.mDTO.add(mDTO);
			oos.writeObject(this.mDTO);
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<MemberDTO> mPrint() {
		try (FileInputStream fis = new FileInputStream("netflix.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			mDTO = (ArrayList<MemberDTO>) ois.readObject();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mDTO;
	}

	public MemberDTO selectById(String id) {
		try (FileInputStream fis = new FileInputStream("netflix.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			mDTO = (ArrayList<MemberDTO>) ois.readObject();
			for (MemberDTO m : mDTO) {
				if (m.getId().equals(id)) {
					return m;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public MemberDTO mNickSearch(String nickname) {
		try (FileInputStream fis = new FileInputStream("netflix.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			mDTO = (ArrayList<MemberDTO>) ois.readObject();
			for (MemberDTO m : mDTO) {
				if (m.getNickname().equals(nickname)) {
					return m;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
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

		try (FileInputStream fis = new FileInputStream("netflix.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			mDTO = (ArrayList<MemberDTO>) ois.readObject();

			for (MemberDTO m : mDTO) {
				if (m.getId().equals(id)) {
					m.setNickname(nickname);
					m.setPoint(point);
				}
			}

			try (FileOutputStream fos = new FileOutputStream("netflix.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(mDTO);
				oos.flush();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void mDelete(String id) {

		try (FileInputStream fis = new FileInputStream("netflix.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			mDTO = (ArrayList<MemberDTO>) ois.readObject();

			for (MemberDTO m : mDTO) {
				if (m.getId().equals(id)) {
					mDTO.remove(m);
					break;
				}
			}

			try (FileOutputStream fos = new FileOutputStream("netflix.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);) {
				oos.writeObject(mDTO);
				oos.flush();

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
