package chapter07_problems;

import java.util.*;

public class Problem05_2 {
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Student> studentHash = new HashMap<String, Student>();
	
	//ó�� �Է� �޴� �޼ҵ�
	public void firstSet() {
		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();
			StringTokenizer filter = new StringTokenizer(input, ",");
			String name = filter.nextToken().trim();
			String major = filter.nextToken().trim();
			String IDcode = filter.nextToken().trim();	
			double grade = Double.parseDouble(filter.nextToken().trim());
			Student student = new Student(name, major, IDcode, grade);
			//���� ��Ű���� ���� Problem05���� ���
			studentHash.put(name, student);
		}
	}
	
	//�Է� ���� ���� ����Ʈ�ϴ� �޼ҵ�
	public void printStudent() {
		Set<String>key = studentHash.keySet();	//�콬���� Ű�� ��ƿ�
		Iterator<String> it = key.iterator();	//Ű�� ���� �����
		while(it.hasNext()) {
			String name = it.next();
			Student forPrint = studentHash.get(name);
			System.out.println("----------------------");
			System.out.println("�̸� : " + forPrint.getName());
			System.out.println("�а� : " + forPrint.getMajor());	
			System.out.println("�й� : " + forPrint.getIDCode());	
			System.out.println("������� : " + forPrint.getCredit());	
		}
		System.out.println("----------------------");
	}
	//�˻� �޼ҵ�
	public void search () {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String check = scanner.nextLine();
			check.trim();
			if(check.equals("�׸�")) break;
			

			Student getS = studentHash.get(check);
			if(getS == null) {
				System.out.println(check + " �� �����ϴ�.");
			}else {
				System.out.print(getS.getName()+", "+getS.getMajor()+", ");
				System.out.println(getS.getIDCode()+", "+getS.getCredit());
			}
		}
	}
	
	//���ι�
	public static void main(String[] args) {		
		Problem05_2 problem = new Problem05_2();
		problem.firstSet();
		problem.printStudent();
		problem.search();
	}
}