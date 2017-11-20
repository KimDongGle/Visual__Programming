package chapter05_problems;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + getDestString() + "입니다");
		scanner.close();
	}
}

class Km2Mile extends Converter{
	
	public Km2Mile(double src) { // 생성자
		this.ratio = src;
	}	
	@Override
	protected double convert(double src) { //km를 비율에 나눠서 리턴
		return src/ratio;
	}
	@Override
	protected String getSrcString() { //바꿀 거리단위 종류
		return "Km";
	}
	@Override
	protected String getDestString() { //바뀔 거리단위 종류
		return "mile";
	}	
}

public class Prombelm03_04 {
	public static void main(String[] args) {
			Km2Mile toMile = new Km2Mile(1.6);  //km에서 mile변경시의 비율
			toMile.run();
	}

}
