package chapter09_problems;
import javax.swing.*;
import java.awt.*;

public class Problem06 extends JFrame{
	public Problem06(){
		setTitle("Problem06");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�ݱ�� ���α׷� ����
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel[] label = new JLabel [20]; //JLable �迭 ����
				
		for(int i = 0; i < label.length; i++) {
			label[i] = new JLabel();	//JLable �迭 ��ü ����
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			// ���� ��ǥ ����
						
			label[i].setLocation(x, y);		//��ǥ����
			label[i].setSize(10, 10);		//�� ������ 10x10
			label[i].setOpaque(true);		//���� ǥ��
			label[i].setBackground(Color.blue);	//���� �Ķ�
			c.add(label[i]);		//�����̳ʿ� �߰�
		}
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Problem06();
	}
}