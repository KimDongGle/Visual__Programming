package chapter02_problems;
import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		int num;
		Scanner a = new Scanner(System.in);
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ� : ");
		num = a.nextInt();

		if( ((num / 10) == 3 || (num / 10) == 6 || (num / 10) == 9) && ((num % 3) == 0)) {
			System.out.println("�ڼ�¦¦");
		}else if( !((num / 10) == 3 || (num / 10) == 6 || (num / 10) == 9) && (((num % 10)%3) == 0)) {
			System.out.println("�ڼ�¦");
		}else {
			System.out.println("���ǿ� �´� ���ڰ� �ƴմϴ�.");
		}
	}
}