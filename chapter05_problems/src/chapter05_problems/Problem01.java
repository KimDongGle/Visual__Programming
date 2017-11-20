package chapter05_problems;

class TV {
	private int size;
	public TV(int size) { this.size = size; }
	protected int getSize() { return size; }
}

class ColorTV extends TV{ // TV�� ��ӹ��� ColorTV Ŭ���� ���� 
	private int Color; //���� ���� ���� ����
	public ColorTV(int size, int color) { //������ �ʱ�ȭ ����
		super(size);
		this.Color = color;
	}
	public void printProperty() { //�������� �˸°� ����ϴ� �޼ҵ�
		System.out.println(getSize() + "��ġ  " + Color + "�÷�");
	}
	protected int getColor() {
		return Color;
	}
}

class IPTV extends ColorTV { //ColorTV�� ��� ���� IPTVŬ���� �߰� 
	private String IP; //IP�� ���� ���� ����
	public IPTV(String IP, int inch, int color) { //������ �ʱ�ȭ
		super(inch, color); //super() �Լ�Ȱ�� inch�� color ����
		this.IP = IP;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� " + IP + " �ּ��� " + getSize() +"��ġ " + getColor() + "�÷�");
	}	
}

public class Problem01 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}