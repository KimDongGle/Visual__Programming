package chapter02_problems;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("���� 3�� �Է� : ");
		
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		int num3 = a.nextInt();
		
		if((num1 + num2) > num3 && (num1+num3) > num2 && (num2+num3) > num3){
			System.out.println("�ﰢ���� �˴ϴ�.");
		}else{
			System.out.println("������� ���� �ʽ��ϴ�.");
		}
			
	}

}