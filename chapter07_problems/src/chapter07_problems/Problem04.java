package chapter07_problems;
import java.util.*;

public class Problem04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int input;
		int average = 0;
		
		while(true) {
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			input = scanner.nextInt(); 
			if(input == 0) break; //입력받은 정수가 0 이면 while문 탈출	
			v.add(input);	//필터링 후에 v벡터에 추가시킴
			
			for(int i = 0; i <v.size(); i++) { //먼저 v 출력
				System.out.print(v.get(i) + " ");
			}			
			average += v.lastElement();	//평균값에 추가된 값 더해주기(맨 마지막값)
			System.out.println();
			System.out.println("현재 평균 " + average/v.size());			
		}
	}
}
