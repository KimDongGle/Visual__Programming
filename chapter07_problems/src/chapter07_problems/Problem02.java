package chapter07_problems;
import java.util.*;


public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> c = new ArrayList<Character>();
		Character input = null;
		double total = 0;	
		
		System.out.print("a6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>> ");
		for(int i = 0; i < 6; i++) {			// 6개의 문자를 입력받음.
			input = scanner.next().charAt(0);	
			c.add(input);						// c 리스트에 추가.
		}
		
		for(int i = 0; i < c.size(); i++) {
			switch(c.get(i)) {		// c의 각 인덱스마다 값을 가져오고 그 값을 스위치로 구별
			
			//이하 구분된 값에다가 알맞은 점수를 더해줌.
			case 'A' :			
				total += 4.0;
				break;				
			case 'B' :
				total += 3.0;
				break;				
			case 'C' :
				total += 2.0;
				break;				
			case 'D' :
				total += 1.0;
				break;				
			case 'F' :
				break;
			default :
				break;
			}
		}
		
		total = total / c.size();	//평균은 총 더해진 값에 c리스트 사이즈만큼 나누기
		System.out.println(total);
	}
}
