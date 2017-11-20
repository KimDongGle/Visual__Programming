package chapter07_problems;
import java.util.*;

class Student {
	//저장할 데이터 4개 변수 선언
	String name;
	String major;
	String IDcode;
	double credit;	
	public Student(String name, String major, String iDcode, double credit) {
		this.name = name;
		this.major = major;
		this.IDcode = iDcode;
		this.credit = credit;
		// TODO Auto-generated constructor stub
	}
	//set메소드 모음
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setId(String IDcode) {
		this.IDcode = IDcode;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}	
	//get메소드 모음
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getIDCode() {
		return IDcode;
	}
	public double getCredit() {
		return credit;
	}	
}

public class Problem05 {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	//처음 입력 받는 메소드
	public void firstSet() {
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String input = scanner.nextLine();

			StringTokenizer filter = new StringTokenizer(input, ",");
			String name = filter.nextToken().trim();
			String major = filter.nextToken().trim();
			String IDcode = filter.nextToken().trim();	
			double grade = Double.parseDouble(filter.nextToken().trim());
			studentList.add(new Student(name, major, IDcode, grade));
		}
	}
	
	//입력 받은 것을 프린트하는 메소드
	public void printStudent() {
		for(int i = 0; i < 4; i++) {
			Student forPrint = studentList.get(i);
			System.out.println("----------------------");
			System.out.println("이름 : " + forPrint.getName());
			System.out.println("학과 : " + forPrint.getMajor());	
			System.out.println("학번 : " + forPrint.getIDCode());	
			System.out.println("학점평균 : " + forPrint.getCredit());	
		}
		System.out.println("----------------------");
	}
	
	public void search () {
		while(true) {
			System.out.print("학생 이름 >> ");
			String check = scanner.nextLine();
			check.trim();
			if(check.equals("그만")) break;			
			
			for(int i = 0; i < 4; i++) {
				Student getS = studentList.get(i);
				if(check.equals(getS.name)) {
					System.out.print(getS.getName()+", "+getS.getMajor()+", ");
					System.out.println(getS.getIDCode()+", "+getS.getCredit());
				}
			}
		}
	}
	
	//메인문
	public static void main(String[] args) {		
		Problem05 problem = new Problem05();
		problem.firstSet();
		problem.printStudent();
		problem.search();
	}
}
