package chapter04_problems;

public class Rectangle {
	int x, y, width, height, nemo;
 
	public Rectangle(int x, int y, int width, int height) { //������
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {	//���� �����ϴ� ������ ���� ��������
		nemo = width * height;
		System.out.println(nemo);
		return nemo;
	}
	
	public void show() {
		System.out.println("("+ x + ", " + y + ")���� ũ�Ⱑ " + width + "x" + height + "�� �簢��");
	}
	
	public boolean contain(Rectangle r) {  //�� �� ��ǥ�� ���� ���ؼ� �Ǵ��Ѵ�. 
		if( ((this.x - r.x) <= 0 && (this.y - r.y) <= 0) && ((this.width - r.width) >= 0 && (this.height - r.height) >= 0) )
			return true;
		else		
			return false;
	}
	
 
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 100, 39);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + r.square());
		if(t.contain(r))
			System.out.println("t�� r�� �����մϴ�.");
		if(t.contain(s))
			System.out.println("t�� s�� �����մϴ�.");
	}
 
}