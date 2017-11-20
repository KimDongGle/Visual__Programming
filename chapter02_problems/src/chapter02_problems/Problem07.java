package chapter02_problems;
import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		int xpos;
		int ypos;
		Scanner a = new Scanner(System.in);
		
		System.out.print("점 (x, y)의 좌표를 입력하시오 : ");
		/*
		 좌표 (100,100), (200,200) 두점으로 이루어진 사각형이 있을때, 
		 입력값 좌표가 이 두좌표 안에 있는지 확인.
		*/
		xpos = a.nextInt();
		ypos = a.nextInt();
		
		if((xpos <= 200 && xpos >= 100)&&(ypos <= 200 && ypos >= 100)) {
			System.out.println("(" + xpos + "," + ypos + ")" + "는 사각형 안에 있습니다.");
		}else {
			System.out.println("(" + xpos + "," + ypos + ")" + "는 사각형 안에 없습니다.");
		}
		
	}
}
