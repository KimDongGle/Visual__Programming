package chapter09_problems;
import java.awt.*;
import javax.swing.*;

public class Problem05 extends JFrame{
	public Problem05() {
		setTitle("Problem05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기시 프로그램 종료
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));		
		JLabel[] label = new JLabel [16]; //JLable 배열 선언
		
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
		//색깔 배열 선언

		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true); //색깔 보이기
			label[i].setBackground(color[i]);
			c.add(label[i]); //라벨 추가
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Problem05();
	}


}
