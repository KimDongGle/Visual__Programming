package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Problem01 extends JFrame {
	public Problem01() {
		super("���콺 �ø��� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		c.add(label); 
		//�ʱ��۾� (â ������ ����, �����̳� ���� �� ���� ����, �� ���̱�
		
		label.addMouseListener(new MouseAdapter() {	//�͸� Ŭ���� Ȱ��, ��ͷ� �ʿ��� ��ɸ� ���
			@Override
			public void mouseEntered(MouseEvent e) { //���콺�� �÷�������
				JLabel newLabel = (JLabel)e.getSource();
				newLabel.setText("Love Java");
			}
			@Override
			public void mouseExited(MouseEvent e) {	//���콺�� �÷����� �ʾ�����
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});
		setSize(300,150);
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new Problem01();
	}
}