package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem04 extends JFrame {
	public Problem04() {
		super("LeftŰ�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		Container c = getContentPane();
		leftKeySet leftkey = new leftKeySet();
		JLabel label = new JLabel("Love Java");
		//�����̳�, Ű��� ��ü, ���� ��ü ����
		
		c.setLayout(new FlowLayout());
		c.add(label);
		//�÷ο� ���̾ƿ� ���� �� �� �߰�
		
		label.addKeyListener(leftkey);
		//����Ű�� ���������� Ȯ��
		c.add(label);
		//�����ʷ� ����� �� �ٽ� ǥ��
		
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true); // ���̺� ��Ŀ��
		label.requestFocus(); // ���̺� Ű ��Ŀ��
	}
	static public void main(String [] args) {
		new Problem04();
	}
}

class leftKeySet extends KeyAdapter {
	//����Ű�� �������� �� ��� ����
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			JLabel la = (JLabel)e.getSource(); //�� ������ ������
			String text  = new String(la.getText()); //�󺧿��� �ؽ�Ʈ�� ������
			String first = text.substring(0, 1); //�ؽ�Ʈ�� ù �κи� ����
			String others = text.substring(1); //�ؽ�Ʈ�� ù �κ��� ���ܸ� �������� ����
			text =  others + first;	//�� ���� �ΰ��� ��ġ�� �ݴ��
			
			la.setText(text); //���� �ؽ�Ʈ ǥ��
		}
	}
}