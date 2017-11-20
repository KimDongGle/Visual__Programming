package probelm_java;

public class MyPoint {
	private int x, y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {	//Object 의 toString()을 오버라이딩
		return "Point(" + this.x + "," + this.y + ")"; 
	}

	public boolean equals(Object point) { 
		MyPoint p = (MyPoint)point;  //인자 point 오브젝트를 MyPoint 으로 다운 캐스팅
		if(x == p.x && y == p.y) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
	    MyPoint p = new MyPoint(3, 50);
	    MyPoint q = new MyPoint(4, 50);
	    System.out.println(p);  // p.toString()으로 자동 변환됨
	    if(p.equals(q))
	        System.out.println("같은 점");
	    else
	        System.out.println("다른 점");
	}
}