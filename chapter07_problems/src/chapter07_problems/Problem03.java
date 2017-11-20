package chapter07_problems;
import java.util.*;

public class Problem03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		String input01 = null;
		Integer input02 = null;

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		while(true) {
			System.out.print("나라 이름, 인구 >> ");
			input01 = scanner.next();	//나라이름과 인구 입력받기
			if(input01.equals("그만"))	
				break;
			input02 = scanner.nextInt();
			
			nations.put(input01, input02);
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String search = scanner.next();
			if(search.equals("그만")) break;	
			Integer value = nations.get(search);	//nations에서 값 받아오기
			
			if(value == null)	//받아온 값이 null인걸 판단.
				System.out.println(search + " 나라는 없습니다.");
			else
				System.out.println(search + "의 인구는 " + value);
		}
		scanner.close();
	}
}
