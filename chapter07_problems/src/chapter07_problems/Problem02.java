package chapter07_problems;
import java.util.*;


public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> c = new ArrayList<Character>();
		Character input = null;
		double total = 0;	
		
		System.out.print("a6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");
		for(int i = 0; i < 6; i++) {			// 6���� ���ڸ� �Է¹���.
			input = scanner.next().charAt(0);	
			c.add(input);						// c ����Ʈ�� �߰�.
		}
		
		for(int i = 0; i < c.size(); i++) {
			switch(c.get(i)) {		// c�� �� �ε������� ���� �������� �� ���� ����ġ�� ����
			
			//���� ���е� �����ٰ� �˸��� ������ ������.
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
		
		total = total / c.size();	//����� �� ������ ���� c����Ʈ �����ŭ ������
		System.out.println(total);
	}
}