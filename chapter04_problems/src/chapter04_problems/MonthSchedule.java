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
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}
 
 
public class MonthSchedule {
	String work;
	Day[] myDay;
	int day;
	int maxday;
	static int exit = 0;	//main에서도 사용가능하게 static 선언
	
	public MonthSchedule(int a) { //생성자 배열 길이를 동시에 초기화
		maxday = a;
		myDay = new Day[a];	//받아온 배열 길이만큼 객체 배열 생성
		for(int i = 0; i < a; i++) {
			myDay[i] = new Day();	//객체 레퍼런스 생성
			myDay[i].set(null);	//배열 모두 null값으로 초기화
		}
	}
	
	public void input() {	//입력을 받는 메소드
		Scanner scanner = new Scanner(System.in);
		System.out.print("할일(빈칸없이입력) : ");
		this.work = scanner.nextLine();
		myDay[this.day-1].set(work);
	}
	
	public void view() {	//각 날짜의 일을 알려주는 메소드
		System.out.print(this.day +"일의 할 일은 ");
		myDay[this.day-1].show();
	}
	
	public void finish() {	//종료 메세지를 출력하는 메소드
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() { //기본적으로 실행되는 메소드
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
		option = scanner.nextInt();
		
		if(option==1) { //각 입력 숫자마다 각 기능 수행
			System.out.print("날짜(1~"+ maxday + ")? : ");
			this.day = scanner.nextInt();
			input();
		}
		
		if(option==2) {
			System.out.print("날짜(1~"+ maxday + ")?");
			this.day = scanner.nextInt();
			view();
		}
		
		if(option==3) {
			finish();
			exit++;
		}
	} 

	public static void main(String[] args) {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		MonthSchedule april = new MonthSchedule(30); //april 객체 생성하며 날짜수 전달
		
		while(exit == 0) {
			april.run();
		}
	}
}