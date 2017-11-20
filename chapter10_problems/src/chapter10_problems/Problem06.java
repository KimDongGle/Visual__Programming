package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Problem06 extends JFrame {
	public Problem06() {
		super("Ŭ�� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //��ġ������ �ʿ����
		FontClickListener listener = new FontClickListener();
		JLabel label = new JLabel("C");

		c.add(label);
		label.setLocation(100, 100);
		label.setSize(10, 10);
		label.addMouseListener(listener);
		c.add(label);
		
		setSize(300,300);
		setVisible(true);
		//���̾ƿ� ũ��� ǥ�ü���	
		
		label.setFocusable(true); // ���̺� ��Ŀ��
		label.requestFocus(); // ���̺� Ű ��Ŀ��	
	}
	
	static public void main(String [] args) {
		new Problem06();
	}
}

class FontClickListener extends MouseAdapter {
	//Ŭ���� ���� ��ġ ��� ����
	public void mouseClicked(MouseEvent e) {
		JLabel setLabel = (JLabel)e.getSource();
		int x = (int)(Math.random()*250) + 0; //250x250 ���̿� �������� �޾ƿ� 
		int y = (int)(Math.random()*250) + 0;
		setLabel.setLocation(x, y); //�޾ƿ� ���������� ��ǥ����
	}
}
