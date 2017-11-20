package probelm_java;

public class Circle{
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) { //3개의 인자의 를 받고 초기화 시키는 생성자
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {		//Object의 toString()을 오버라이딩하여 출력
		return "Circle(" + this.x + "," + this.y + ")반지름" + this.radius;
	}
	
	public boolean equals(Object b) {
		Circle a = (Circle)b;	//인자 b 오브젝트를 Circle 으로 다운 캐스팅
		if(x == a.x && y == a.y) {	// 두 좌표만 비교하여 리턴
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
	    Circle a = new Circle(2,3,5);
	    Circle b = new Circle(2,3,30);
	    System.out.println("원 a : " + a);
	    System.out.println("원 b : " + b);
	    if(a.equals(b))
	        System.out.println("같은 원");
	    else
	        System.out.println("서로 다른 원");
	}
}

