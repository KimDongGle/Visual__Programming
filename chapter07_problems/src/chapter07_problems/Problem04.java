package chapter07_problems;
import java.util.*;

public class Problem04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int input;
		int average = 0;
		
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			input = scanner.nextInt(); 
			if(input == 0) break; //�Է¹��� ������ 0 �̸� while�� Ż��	
			v.add(input);	//���͸� �Ŀ� v���Ϳ� �߰���Ŵ
			
			for(int i = 0; i <v.size(); i++) { //���� v ���
				System.out.print(v.get(i) + " ");
			}			
			average += v.lastElement();	//��հ��� �߰��� �� �����ֱ�(�� ��������)
			System.out.println();
			System.out.println("���� ��� " + average/v.size());			
		}
	}
}