package chapter08_problems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		FileWriter fileWriter;
		File temp = new File("c:\\temp\\phone.txt");
		try {
			Scanner input = new Scanner(System.in);
			fileWriter = new FileWriter(temp);
						
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = input.nextLine(); // �� ���� ����
				if(line.equals("�׸�"))	// �׸��� equals �� ���ϰ� ���� ��� break; ���Ѽ� while�� Ż��
						break;
				fileWriter.write(line+"\r\n"); 
			}			
			System.out.println(temp.getPath()+"�� �����Ͽ����ϴ�.");	
			
			fileWriter.close(); // ���� �����͸� �ݾ����� ������ �����Ͱ� ������ �ȵ�
		} catch (IOException e) { // ����ó��
			e.printStackTrace();
		}
	}

}