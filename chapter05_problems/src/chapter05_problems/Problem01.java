package chapter05_problems;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV{ // TV를 상속받은 ColorTV 클래스 생성 
	private int Color; //색을 담을 변수 설정
	public ColorTV(int size, int color) { //생성자 초기화 설정
		super(size);
		this.Color = color;
	}
	public void printProperty() { //변수들을 알맞게 출력하는 메소드
		System.out.println(getSize() + "인치  " + Color + "컬러");
	}
	protected int getColor() {
		return Color;
	}
}

class IPTV extends ColorTV { //ColorTV를 상속 받은 IPTV클래스 추가 
	private String IP; //IP를 담을 변수 설정
	public IPTV(String IP, int inch, int color) { //생성자 초기화
		super(inch, color); //super() 함수활용 inch와 color 명시
		this.IP = IP;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + IP + " 주소의 " + getSize() +"인치 " + getColor() + "컬러");
	}	
}

public class Problem01 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
