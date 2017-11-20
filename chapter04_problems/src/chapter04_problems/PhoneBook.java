package chapter04_problems;
import java.util.Scanner;

class Phone { //�� ����(�̸�, ��ȣ)�� ���� �ϴ� Ŭ����
	public String name;
	String phoneNum;
	
	public void set(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	public void show() {
		System.out.println(this.name + " " + this.phoneNum);
	}
	public void name(String name) {
		
	}
}



public class PhoneBook {
	int member;
	Phone[] man;
	int stop = 0;
	
	
	public PhoneBook() {
		String name, phoneNum, searchName;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ο��� >>");
		member = scanner.nextInt();	
		System.out.println(member);
		
		man = new Phone[member];

		for(int i = 0; i <man.length; i++) { //������ �Է¹����� ���ÿ� �迭 ��ü ���� �� ����
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = scanner.next();
			phoneNum = scanner.nextLine();
			
			man[i] = new Phone();
			man[i].set(name, phoneNum);
		}
		
		System.out.println("����Ǿ����ϴ�.");
		
		while (stop == 0) {
			System.out.println("�˻��� �̸� >>");
			searchName = scanner.nextLine();
			if(searchName.equals("�׸�")) 
				stop++;
			else
				search(searchName);			
		}
	}
	
	public void search(String FindName) { //�˻� �޼ҵ�
		int i = 0;
		
		for(; i < man.length; i++) {
			if(man[i].name.equals(FindName)) {
				System.out.println(FindName + "�� ��ȣ�� " + man[i].phoneNum + " �Դϴ�.");
				break;
				
			}			
		}
		if(i == man.length)
			System.out.println(FindName + "�� �����ϴ�.");
	}
	
	public void view() { //Phone���� ������ man�� �迭 ��ü�� ���� �޼ҵ�
		for(int i = 0; i < member; i++) {
			man[i].show();
		}
	}
	
	
	
	public static void main(String[] args) {
		new PhoneBook();
	}
}