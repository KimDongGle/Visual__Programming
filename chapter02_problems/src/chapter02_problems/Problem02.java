package chapter02_problems;
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99): ");
		int num = a.nextInt();
		int twoTen = num % 10;
		int twoOne = num / 10;
		
		if(twoOne == twoTen) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
	}
}