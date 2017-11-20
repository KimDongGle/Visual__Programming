package chapter05_problems;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: " + res + getDestString() + "�Դϴ�");
		scanner.close();
	}
}

class Km2Mile extends Converter{
	
	public Km2Mile(double src) { // ������
		this.ratio = src;
	}	
	@Override
	protected double convert(double src) { //km�� ������ ������ ����
		return src/ratio;
	}
	@Override
	protected String getSrcString() { //�ٲ� �Ÿ����� ����
		return "Km";
	}
	@Override
	protected String getDestString() { //�ٲ� �Ÿ����� ����
		return "mile";
	}	
}

public class Prombelm03_04 {
	public static void main(String[] args) {
			Km2Mile toMile = new Km2Mile(1.6);  //km���� mile������� ����
			toMile.run();
	}

}