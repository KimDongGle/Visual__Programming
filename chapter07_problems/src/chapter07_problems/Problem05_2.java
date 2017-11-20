package chapter07_problems;

import java.util.*;

public class Problem05_2 {
	Scanner scanner = new Scanner(System.in);
	HashMap<String, Student> studentHash = new HashMap<String, Student>();
	
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
			Student student = new Student(name, major, IDcode, grade);
			//같은 패키지라 이전 Problem05에서 사용
			studentHash.put(name, student);
		}
	}
	
	//입력 받은 것을 프린트하는 메소드
	public void printStudent() {
		Set<String>key = studentHash.keySet();	//헤쉬맵의 키를 담아옴
		Iterator<String> it = key.iterator();	//키와 값을 담아줌
		while(it.hasNext()) {
			String name = it.next();
			Student forPrint = studentHash.get(name);
			System.out.println("----------------------");
			System.out.println("이름 : " + forPrint.getName());
			System.out.println("학과 : " + forPrint.getMajor());	
			System.out.println("학번 : " + forPrint.getIDCode());	
			System.out.println("학점평균 : " + forPrint.getCredit());	
		}
		System.out.println("----------------------");
	}
	//검색 메소드
	public void search () {
		while(true) {
			System.out.print("학생 이름 >> ");
			String check = scanner.nextLine();
			check.trim();
			if(check.equals("그만")) break;
			

			Student getS = studentHash.get(check);
			if(getS == null) {
				System.out.println(check + " 가 없습니다.");
			}else {
				System.out.print(getS.getName()+", "+getS.getMajor()+", ");
				System.out.println(getS.getIDCode()+", "+getS.getCredit());
			}
		}
	}
	
	//메인문
	public static void main(String[] args) {		
		Problem05_2 problem = new Problem05_2();
		problem.firstSet();
		problem.printStudent();
		problem.search();
	}
}
