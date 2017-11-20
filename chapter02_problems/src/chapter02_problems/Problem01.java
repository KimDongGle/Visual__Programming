package chapter02_problems;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);		
		
		System.out.print("원화를 입력하세요(단위 원): ");
		int won = a.nextInt();
		double doller = won / 1100;		
		
		System.out.println(won + "원은 " + "$" + doller + "입니다.");
	}
}
