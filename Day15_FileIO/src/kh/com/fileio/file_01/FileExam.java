package kh.com.fileio.file_01;

import java.io.File;

public class FileExam {
	public static void main(String[] args) {

		// File �������� ���ڰ����� ������ ��θ� �����ְų�
		// ������ ������Ʈ�� ����� ���� �����̸��� �����ش�
		File file = new File("test.txt");

		System.out.println("�������� ����? " + file.isFile());
		System.out.println("�������� ����? " + file.isDirectory());
		System.out.println("���� ũ�� ? " + file.length());
		System.out.println("������ ���� ���? " + file.getAbsolutePath());
		System.out.println("������ �̸�? " + file.getName());

		System.out.println("==================================================================");

		File folder = new File("C:\\workspace1\\Day15_FileIO\\temp"); // ��� �ۼ��Ҷ� ��踦 ������1�� �Ǵ� ��������2���� �ۼ�

		System.out.println("�������� ����? " + folder.isFile());
		System.out.println("�������� ����? " + folder.isDirectory());
		System.out.println("���� ũ�� ? " + folder.length());
		System.out.println("������ ���� ���? " + folder.getAbsolutePath());
		System.out.println("������ �̸�? " + folder.getName());

		System.out.println("==================================================================");

		// �ش������� ���ϸ� ���
		for (File f : folder.listFiles()) {
			System.out.println(f.getName());
		}

		System.out.println("==================================================================");

		File File2 = new File("temp.txt");

		System.out.println(File2.exists()); // ���� ���翩��
		if (!File2.exists()) {
			try {
				File2.createNewFile(); // ���� ����
			} catch (Exception e) {
				e.printStackTrace(); // ������ ȭ�鿡 �������
			}
		}

		System.out.println("==================================================================");

		File folder2 = new File("C:\\workspace1\\Day15_FileIO\\temp2");
		if (!folder2.exists()) { // ���� ���翩��
			folder2.mkdir(); // ���� ����
		}

	}
}
