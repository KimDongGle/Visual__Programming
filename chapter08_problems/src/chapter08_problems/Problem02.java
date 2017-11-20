package chapter08_problems;
import java.io.*;

public class Problem02 {
	public static void main(String[] args) {  //���� 8-1 ����
		FileReader fin = null;
		try {
			fin = new FileReader("c:\\temp\\phone.txt");  //�о���� ��� ����
			int c;
			while ((c = fin.read()) != -1) { // ������ ���� ������ -1�� ������ ����
				System.out.print((char)c); //�� ���ھ� �о����.
			}
			fin.close();	
		} catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}