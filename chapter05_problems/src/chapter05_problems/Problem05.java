package chapter05_problems;

class Point {
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String color) { //생성자 좌표 2개, 색깔, 총 3개
		super (x, y);
		this.color = color;
	}
	public void setXY(int a, int b) { //좌표 변경 메소드
		move(a, b);
	}
	public void setColor(String color) { //색깔 재정의 메소드
		this.color = color;
	}
	public String toString() { //출력할 문자열 리턴
		return color + "색의 (" + getX() + "," + getY() + ")의 점";
	}
}

public class Problem05 {
	public static void main (String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
}
