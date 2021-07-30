import javax.swing.JOptionPane;

public class popUp {
	public static void main(String[] args) {
		// Swing(GUI)	
		
		JOptionPane.showMessageDialog(null,"이 메세지를 확인하세요.");    //메세지박스 생성
		
		String msg = JOptionPane.showInputDialog("메세지를 입력하세요."); //사용자에게 데이터를 입력받음
		System.out.println(msg);
		
	}
}
