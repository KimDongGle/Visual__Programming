package chapter04_problems;
import java.util.Scanner;

class Phone { //폰 정보(이름, 번호)를 저장 하는 클래스
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
		
		System.out.print("인원수 >>");
		member = scanner.nextInt();	
		System.out.println(member);
		
		man = new Phone[member];

		for(int i = 0; i <man.length; i++) { //정보를 입력받으며 동시에 배열 객체 생성 및 저장
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = scanner.next();
			phoneNum = scanner.nextLine();
			
			man[i] = new Phone();
			man[i].set(name, phoneNum);
		}
		
		System.out.println("저장되었습니다.");
		
		while (stop == 0) {
			System.out.println("검색할 이름 >>");
			searchName = scanner.nextLine();
			if(searchName.equals("그만")) 
				stop++;
			else
				search(searchName);			
		}
	}
	
	public void search(String FindName) { //검색 메소드
		int i = 0;
		
		for(; i < man.length; i++) {
			if(man[i].name.equals(FindName)) {
				System.out.println(FindName + "의 번호는 " + man[i].phoneNum + " 입니다.");
				break;
				
			}			
		}
		if(i == man.length)
			System.out.println(FindName + "이 없습니다.");
	}
	
	public void view() { //Phone으로 선언한 man의 배열 객체를 보는 메소드
		for(int i = 0; i < member; i++) {
			man[i].show();
		}
	}
	
	
	
	public static void main(String[] args) {
		new PhoneBook();
	}
}
