package chapter04_problems;

import java.util.Scanner;
 
 
class Day{
	private String work;
	public void set(String work) {
		this.work = work; 
	}
	public String get() { 
		return work; 
	}
	public void show() {
		if(work == null)
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
	}
}
 
 
public class MonthSchedule {
	String work;
	Day[] myDay;
	int day;
	int maxday;
	static int exit = 0;	//main������ ��밡���ϰ� static ����
	
	public MonthSchedule(int a) { //������ �迭 ���̸� ���ÿ� �ʱ�ȭ
		maxday = a;
		myDay = new Day[a];	//�޾ƿ� �迭 ���̸�ŭ ��ü �迭 ����
		for(int i = 0; i < a; i++) {
			myDay[i] = new Day();	//��ü ���۷��� ����
			myDay[i].set(null);	//�迭 ��� null������ �ʱ�ȭ
		}
	}
	
	public void input() {	//�Է��� �޴� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("����(��ĭ�����Է�) : ");
		this.work = scanner.nextLine();
		myDay[this.day-1].set(work);
	}
	
	public void view() {	//�� ��¥�� ���� �˷��ִ� �޼ҵ�
		System.out.print(this.day +"���� �� ���� ");
		myDay[this.day-1].show();
	}
	
	public void finish() {	//���� �޼����� ����ϴ� �޼ҵ�
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() { //�⺻������ ����Ǵ� �޼ҵ�
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.print("����(�Է�:1, ����:2, ������:3)");
		option = scanner.nextInt();
		
		if(option==1) { //�� �Է� ���ڸ��� �� ��� ����
			System.out.print("��¥(1~"+ maxday + ")? : ");
			this.day = scanner.nextInt();
			input();
		}
		
		if(option==2) {
			System.out.print("��¥(1~"+ maxday + ")?");
			this.day = scanner.nextInt();
			view();
		}
		
		if(option==3) {
			finish();
			exit++;
		}
	} 

	public static void main(String[] args) {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		MonthSchedule april = new MonthSchedule(30); //april ��ü �����ϸ� ��¥�� ����
		
		while(exit == 0) {
			april.run();
		}
	}
}