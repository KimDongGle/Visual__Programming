package chapter09_problems;
import javax.swing.*;
import java.awt.*;

public class Problem06 extends JFrame{
	public Problem06(){
		setTitle("Problem06");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기시 프로그램 종료
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel[] label = new JLabel [20]; //JLable 배열 선언
				
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel();	//JLable 배열 객체 생성
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			// 랜덤 좌표 생성
						
			label[i].setLocation(x, y);		//좌표설정
			label[i].setSize(10, 10);		//라벨 사이즈 10x10
			label[i].setOpaque(true);		//색상 표시
			label[i].setBackground(Color.blue);	//배경색 파랑
			c.add(label[i]);		//컨테이너에 추가
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Problem06();
	}
}
