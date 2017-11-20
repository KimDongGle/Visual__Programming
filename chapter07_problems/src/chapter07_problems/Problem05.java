package chapter07_problems;
import java.util.*;

class Student {
	//������ ������ 4�� ���� ����
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
	//set�޼ҵ� ����
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
	//get�޼ҵ� ����
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
			studentList.add(new Student(name, major, IDcode, grade));
		}
	}
	
	//�Է� ���� ���� ����Ʈ�ϴ� �޼ҵ�
	public void printStudent() {
		for(int i = 0; i < 4; i++) {
			Student forPrint = studentList.get(i);
			System.out.println("----------------------");
			System.out.println("�̸� : " + forPrint.getName());
			System.out.println("�а� : " + forPrint.getMajor());	
			System.out.println("�й� : " + forPrint.getIDCode());	
			System.out.println("������� : " + forPrint.getCredit());	
		}
		System.out.println("----------------------");
	}
	
	public void search () {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String check = scanner.nextLine();
			check.trim();
			if(check.equals("�׸�")) break;			
			
			for(int i = 0; i < 4; i++) {
				Student getS = studentList.get(i);
				if(check.equals(getS.name)) {
					System.out.print(getS.getName()+", "+getS.getMajor()+", ");
					System.out.println(getS.getIDCode()+", "+getS.getCredit());
				}
			}
		}
	}
	
	//���ι�
	public static void main(String[] args) {		
		Problem05 problem = new Problem05();
		problem.firstSet();
		problem.printStudent();
		problem.search();
	}
}