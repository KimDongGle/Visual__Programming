package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem05 extends JFrame {
	public Problem05() {
		super("LeftŰ�� ���ڿ� �̵�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		Container c = getContentPane();
		FontSizeSet fontSet = new FontSizeSet();
		JLabel label = new JLabel("Love Java");
		//�����̳�, Ű��� ��ü, ���� ��ü ����		
		c.setFont(new Font("Arial", Font.PLAIN, 10));
		c.setLayout(new FlowLayout());
		c.add(label);
		//�÷ο� ���̾ƿ� ���� �� �� �߰�		
		label.addKeyListener(fontSet);
		//����Ű�� ���������� Ȯ��
		c.add(label);
		//�����ʷ� ����� �� �ٽ� ǥ��		
		setSize(300,300);
		setVisible(true);		
		label.setFocusable(true); // ���̺� ��Ŀ��
		label.requestFocus(); // ���̺� Ű ��Ŀ��
	}
	static public void main(String [] args) {
		new Problem05();
	}
}
class FontSizeSet extends KeyAdapter {
	//����Ű�� �������� �� ��� ����
	@Override
	public void keyPressed(KeyEvent e) {
		JLabel la = (JLabel)e.getSource(); //�� ������ ������
		Font f = la.getFont();
		int size = f.getSize();		
		if(e.getKeyCode() == KeyEvent.VK_PLUS)//�޾ƿ� Ű�� �÷��� �϶�
			System.out.println("work+");
			la.setFont(new Font("Arial", Font.PLAIN, size+5)); //��Ʈ 5 ����		
		if(e.getKeyCode() == KeyEvent.VK_MINUS) { //�޾ƿ� Ű�� �÷��� �϶�
			//��Ʈ 5�� �����ϵ� 5 ���ϸ� ����� 5�� ����� 
			if(size <= 5) {
				la.setFont(new Font("Arial", Font.PLAIN, 5)); 
			}else{
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}
	}
}