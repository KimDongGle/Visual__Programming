package chapter02_problems;
import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		int xpos;
		int ypos;
		Scanner a = new Scanner(System.in);
		
		System.out.print("�� (x, y)�� ��ǥ�� �Է��Ͻÿ� : ");
		/*
		 ��ǥ (100,100), (200,200) �������� �̷���� �簢���� ������, 
		 �Է°� ��ǥ�� �� ����ǥ �ȿ� �ִ��� Ȯ��.
		*/
		xpos = a.nextInt();
		ypos = a.nextInt();
		
		if((xpos <= 200 && xpos >= 100)&&(ypos <= 200 && ypos >= 100)) {
			System.out.println("(" + xpos + "," + ypos + ")" + "�� �簢�� �ȿ� �ֽ��ϴ�.");
		}else {
			System.out.println("(" + xpos + "," + ypos + ")" + "�� �簢�� �ȿ� �����ϴ�.");
		}
		
	}
}