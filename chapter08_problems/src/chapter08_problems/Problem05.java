package chapter08_problems;
import java.io.*;
import java.util.Scanner;

public class Problem05 {
	static String fileOne;
	static String fileTwo;
	
	public static void start () {	//�ڵ尡 �����ϸ� �� ������ �̸��� �Է¹���.
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		fileOne = scanner.nextLine();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		fileTwo = scanner.nextLine();
		System.out.println(fileOne + "�� " + fileTwo + "�� ���մϴ�.");
		scanner.close();
	}
	
	private static void checkFile(FileInputStream one, FileInputStream two) throws IOException {	
		//������ ���ϰ� ����� �޼����� �������.
		byte[] oneBuf = new byte[1024];
		byte[] twoBuf = new byte[1024];		
		int oneC, twoC, checkNum = 0;
		
		while(checkNum == -1) { //���� ������ while�� Ż��
			oneC = one.read(oneBuf, 0, oneBuf.length);
			twoC = two.read(twoBuf, 0, twoBuf.length);		
			if(oneC != twoC) 	//���� �ʴ� ���
				checkNum = -1;
			if(oneC == -1)		//���� �˻�Ϸ� �� break�� Ż��
				break;		
			for (int i = 0; i < twoC; i++) {
				if (oneBuf[i] != twoBuf[i])
					checkNum = -1;
			}
		}		
		if(checkNum != -1)
			System.out.println("������ �����ϴ�");
		else
			System.out.println("������ �ٸ��ϴ�");
	}
	
	public static void main(String[] args) {	
		FileInputStream one = null;
		FileInputStream two = null;			
		start();
		
		try {
			one = new FileInputStream(fileOne);
			two = new FileInputStream(fileTwo);			
			checkFile(one, two);
            one.close();
            two.close();			
		}		
		catch(IOException e) {
			System.out.println("����� ����");
		}
	}
}