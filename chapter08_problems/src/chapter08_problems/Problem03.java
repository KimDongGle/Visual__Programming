package chapter08_problems;
import java.io.*;


public class Problem03 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\windows\\system.ini");  //�о���� ��� ����
			int c;
			while ((c = fin.read()) != -1) { // ������ ���� ������ -1�� ������ ����
				System.out.print(Character.toUpperCase((char)c)); //�ѹ��ھ� �о���̰� ��ȯ �Լ��� 
			}													  //����ؼ� �ҹ��ڸ� �빮�ڷ� �ٲ۴�.
			fin.close();
		} catch(IOException e) {
			System.out.println("����� ����");
		}
	}

}