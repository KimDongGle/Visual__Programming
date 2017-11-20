package chapter07_problems;
import java.util.*;

public class Problem03 {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		String input01 = null;
		Integer input02 = null;

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		while(true) {
			System.out.print("���� �̸�, �α� >> ");
			input01 = scanner.next();	//�����̸��� �α� �Է¹ޱ�
			if(input01.equals("�׸�"))	
				break;
			input02 = scanner.nextInt();
			
			nations.put(input01, input02);
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String search = scanner.next();
			if(search.equals("�׸�")) break;	
			Integer value = nations.get(search);	//nations���� �� �޾ƿ���
			
			if(value == null)	//�޾ƿ� ���� null�ΰ� �Ǵ�.
				System.out.println(search + " ����� �����ϴ�.");
			else
				System.out.println(search + "�� �α��� " + value);
		}
		scanner.close();
	}
}