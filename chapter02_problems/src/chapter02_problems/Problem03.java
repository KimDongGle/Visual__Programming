package chapter02_problems;
import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오: ");
		int won = a.nextInt();
		
		int manWon5 = won / 50000;    //5만원짜리 장수
		won %= 50000;				//5만원권을 뺀 나머지 
		
		int manWon = won / 10000; //만원 짜리 장수
		won %= 10000;			//만원권을 뺀 나머지 밑 밑 코드 반복
		
		int chunWon = won / 1000; //천원 장수
		won %= 1000;
		
		int backWon = won / 100; //백원 개수
		won %= 100;
		
		int oShipWon = won / 50;  //오십원 개수
		won %= 50;
		
		int shipWon = won / 10;	//십원 개수
		won %= 10;				//1원짜리는 나머지
		
		
		
		
		System.out.println("오만원권 : " + manWon5);
		System.out.println("만원권 : " + manWon);
		System.out.println("천원권 : " + chunWon);
		System.out.println("백원 : " + backWon);
		System.out.println("오십원 : " + oShipWon);
		System.out.println("십원 : " + shipWon);
		System.out.println("일원 : " + won);
	}
}
