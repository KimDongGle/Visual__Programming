package chapter02_problems;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��): ");
		int won = a.nextInt();
		double doller = won / 1100;		
		
		System.out.println(won + "���� " + "$" + doller + "�Դϴ�.");
	}
}