package chapter02_problems;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 : ");
		
		int num1 = a.nextInt();
		int num2 = a.nextInt();
		int num3 = a.nextInt();
		
		if((num1 + num2) > num3 && (num1+num3) > num2 && (num2+num3) > num3){
			System.out.println("삼각형이 됩니다.");
		}else{
			System.out.println("삼격형이 되지 않습니다.");
		}
			
	}

}
