package chapter08_problems;

import java.io.FileReader;
import java.io.IOException;

public class Problem04 {
	public static void start() {		//ó�� ����� �����ص� �޼ҵ�
		System.out.println("c:\\windows\\system.ini ������ �о� ����մϴ�.");
		System.out.printf("%4d", 1);
		System.out.print(": 1");
		System.out.print("1");
	}
	
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");  //�о���� ��� ����
			int c;
			int line = 1;
			
			char changeLine = '\n';
			int changeLineInt = (int)changeLine;
			
			start();  //ó�� ����� �������� �޼ҵ� ����
			
			while ((c = fin.read()) != -1) { // ������ ���� ������ -1�� ������ ����
				if(c == changeLineInt) {	// ���� \n�� �������
					line++;		// ���ι�ȣ�� �߰�
					System.out.printf("%4d", line);		//���� ��ȣ ���
					System.out.print(": ");
				} else {
					System.out.print((char)c); //�̿� \n�� �ƴҽ� �ѹ��ھ� ���� ���
				}
			}													  
			fin.close();
		} catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}