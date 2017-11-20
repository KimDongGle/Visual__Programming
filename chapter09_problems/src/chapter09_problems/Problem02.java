package chapter09_problems;
import javax.swing.*;
import java.awt.*;

public class Problem02 extends JFrame{
	public Problem02(){
		setTitle("Problem02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�ݱ�� ���� ����
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(5, 7)); //���� ���� ���� ����
		
		c.add(new JButton("North"), BorderLayout.NORTH); //���⿡ �°� ��ư ����
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("South"), BorderLayout.SOUTH);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Problem02();
	}
}