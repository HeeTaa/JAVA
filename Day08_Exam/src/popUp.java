import javax.swing.JOptionPane;

public class popUp {
	public static void main(String[] args) {
		// Swing(GUI)	
		
		JOptionPane.showMessageDialog(null,"�� �޼����� Ȯ���ϼ���.");    //�޼����ڽ� ����
		
		String msg = JOptionPane.showInputDialog("�޼����� �Է��ϼ���."); //����ڿ��� �����͸� �Է¹���
		System.out.println(msg);
		
	}
}
