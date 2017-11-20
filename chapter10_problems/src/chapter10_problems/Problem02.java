package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem02 extends JFrame {
	public Problem02() {
		super("���콺 �巡��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container c = getContentPane(); //�����̳� ��ü ����
		c.setLayout(null); //���̾ƿ��� �ʿ���� null
		MouseActionListener listener = new MouseActionListener();
		//�����ص� ���콺 ������ ��ü�� ������
		
		c.setBackground(Color.green); //�⺻ ���� �ʷ�
		c.addMouseListener(listener);	//���콺 Ŭ�� ����
		c.addMouseMotionListener(listener); //���콺 ������ ����
		/*
		 * �巡�״� Ŭ�� �� �����̴� �ൿ�̴�.
		 * ���콺 �����ʷ� Ŭ�� ������ Ŭ���� �����ϰ�
		 * ���� ���콺 ��� �����ʷ� �������� �����ؼ�
		 * ���ÿ� �� ���� �ν��ϰ� �ൿ�� ���Ѵ�.
		*/
		
		setSize(300,300);
		setVisible(true);
		//���̾ƿ� ũ��� ǥ�ü���
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem02();
	}
}

class MouseActionListener extends MouseAdapter {	
	public void mouseReleased(MouseEvent e) {
		//���콺�� ������ �ൿ�� �������ش�.(�ٽ� ���� �ʷ�����) �ܼ� Ŭ���ô� ���� �ൿ�� ���� ���� �� �ʿ䰡 ����.
		Container newC = (Container)e.getSource();
		newC.setBackground(Color.green);
	}
	public void mouseDragged(MouseEvent e) {
		//���콺�� Ŭ���ǰ� �����϶� �ൿ�� �������ش�. (���� �������)
		Container newC = (Container)e.getSource();
		newC.setBackground(Color.YELLOW);
	}
}