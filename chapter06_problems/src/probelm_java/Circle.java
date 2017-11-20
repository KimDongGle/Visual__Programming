package probelm_java;

public class Circle{
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) { //3���� ������ �� �ް� �ʱ�ȭ ��Ű�� ������
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public String toString() {		//Object�� toString()�� �������̵��Ͽ� ���
		return "Circle(" + this.x + "," + this.y + ")������" + this.radius;
	}
	
	public boolean equals(Object b) {
		Circle a = (Circle)b;	//���� b ������Ʈ�� Circle ���� �ٿ� ĳ����
		if(x == a.x && y == a.y) {	// �� ��ǥ�� ���Ͽ� ����
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
	    Circle a = new Circle(2,3,5);
	    Circle b = new Circle(2,3,30);
	    System.out.println("�� a : " + a);
	    System.out.println("�� b : " + b);
	    if(a.equals(b))
	        System.out.println("���� ��");
	    else
	        System.out.println("���� �ٸ� ��");
	}
}
