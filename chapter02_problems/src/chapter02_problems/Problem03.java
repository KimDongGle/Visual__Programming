package chapter02_problems;
import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");
		int won = a.nextInt();
		
		int manWon5 = won / 50000;    //5����¥�� ���
		won %= 50000;				//5�������� �� ������ 
		
		int manWon = won / 10000; //���� ¥�� ���
		won %= 10000;			//�������� �� ������ �� �� �ڵ� �ݺ�
		
		int chunWon = won / 1000; //õ�� ���
		won %= 1000;
		
		int backWon = won / 100; //��� ����
		won %= 100;
		
		int oShipWon = won / 50;  //���ʿ� ����
		won %= 50;
		
		int shipWon = won / 10;	//�ʿ� ����
		won %= 10;				//1��¥���� ������
		
		
		
		
		System.out.println("�������� : " + manWon5);
		System.out.println("������ : " + manWon);
		System.out.println("õ���� : " + chunWon);
		System.out.println("��� : " + backWon);
		System.out.println("���ʿ� : " + oShipWon);
		System.out.println("�ʿ� : " + shipWon);
		System.out.println("�Ͽ� : " + won);
	}
}