package switch_test;

import java.util.Scanner;

public class switchChange {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��): ");
		int won = a.nextInt();
		double doller = won / 1100;		
		
		System.out.println(won + "���� " + "$" + doller + "�Դϴ�.");
	}
}