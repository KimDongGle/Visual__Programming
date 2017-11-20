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
	public ColorPoint(int x, int y, String color) { //������ ��ǥ 2��, ����, �� 3��
		super (x, y);
		this.color = color;
	}
	public void setXY(int a, int b) { //��ǥ ���� �޼ҵ�
		move(a, b);
	}
	public void setColor(String color) { //���� ������ �޼ҵ�
		this.color = color;
	}
	public String toString() { //����� ���ڿ� ����
		return color + "���� (" + getX() + "," + getY() + ")�� ��";
	}
}

public class Problem05 {
	public static void main (String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "�Դϴ�.");
	}
}