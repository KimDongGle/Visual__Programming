package chapter02_problems;
import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		int num;
		Scanner a = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오 : ");
		num = a.nextInt();

		if( ((num / 10) == 3 || (num / 10) == 6 || (num / 10) == 9) && ((num % 3) == 0)) {
			System.out.println("박수짝짝");
		}else if( !((num / 10) == 3 || (num / 10) == 6 || (num / 10) == 9) && (((num % 10)%3) == 0)) {
			System.out.println("박수짝");
		}else {
			System.out.println("조건에 맞는 숫자가 아닙니다.");
		}
	}
}
