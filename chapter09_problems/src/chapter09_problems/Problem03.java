package chapter09_problems;
import javax.swing.*;
import java.awt.*;


public class Problem03 extends JFrame {
	public Problem03() {
		setTitle("Problem03");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기시 프로그램 종료
						
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10)); // 1 x 10
		
		JButton [] btn = new JButton [10];
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			c.add(btn[i]);
		}
		btn[0].setBackground(Color.RED); //각 색깔 입력
		btn[1].setBackground(Color.orange);
		btn[2].setBackground(Color.yellow);
		btn[3].setBackground(Color.green);
		btn[4].setBackground(Color.cyan);
		btn[5].setBackground(Color.blue);
		btn[6].setBackground(Color.magenta);
		btn[7].setBackground(Color.DARK_GRAY);
		btn[8].setBackground(Color.PINK);
		btn[9].setBackground(Color.GRAY);
				
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Problem03();
	}
}
