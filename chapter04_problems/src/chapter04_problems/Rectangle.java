package chapter04_problems;

public class Rectangle {
	int x, y, width, height, nemo;
 
	public Rectangle(int x, int y, int width, int height) { //생성자
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {	//넓이 지정하는 변수를 따로 지정해줌
		nemo = width * height;
		System.out.println(nemo);
		return nemo;
	}
	
	public void show() {
		System.out.println("("+ x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contain(Rectangle r) {  //각 두 좌표의 차를 구해서 판단한다. 
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
		System.out.println("s의 면적은 " + r.square());
		if(t.contain(r))
			System.out.println("t는 r을 포함합니다.");
		if(t.contain(s))
			System.out.println("t는 s를 포함합니다.");
	}
 
}
