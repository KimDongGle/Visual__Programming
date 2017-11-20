package chapter02_problems;
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99): ");
		int num = a.nextInt();
		int twoTen = num % 10;
		int twoOne = num / 10;
		
		if(twoOne == twoTen) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
	}
}
