package chapter09_problems;
import java.awt.*;
import javax.swing.*;

public class Problem05 extends JFrame{
	public Problem05() {
		setTitle("Problem05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�ݱ�� ���α׷� ����
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));		
		JLabel[] label = new JLabel [16]; //JLable �迭 ����
		
		
		Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA};
		//���� �迭 ����

		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true); //���� ���̱�
			label[i].setBackground(color[i]);
			c.add(label[i]); //�� �߰�
		}
		setSize(500,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Problem05();
	}


}