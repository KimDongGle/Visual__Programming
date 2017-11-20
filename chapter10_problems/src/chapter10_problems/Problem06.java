package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Problem06 extends JFrame {
	public Problem06() {
		super("클릭 랜덤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null); //배치관리자 필요없음
		FontClickListener listener = new FontClickListener();
		JLabel label = new JLabel("C");

		c.add(label);
		label.setLocation(100, 100);
		label.setSize(10, 10);
		label.addMouseListener(listener);
		c.add(label);
		
		setSize(300,300);
		setVisible(true);
		//레이아웃 크기와 표시설정	
		
		label.setFocusable(true); // 레이블 포커스
		label.requestFocus(); // 레이블 키 포커스	
	}
	
	static public void main(String [] args) {
		new Problem06();
	}
}

class FontClickListener extends MouseAdapter {
	//클릭시 랜덤 배치 기능 구현
	public void mouseClicked(MouseEvent e) {
		JLabel setLabel = (JLabel)e.getSource();
		int x = (int)(Math.random()*250) + 0; //250x250 사이에 랜덤값을 받아옴 
		int y = (int)(Math.random()*250) + 0;
		setLabel.setLocation(x, y); //받아온 랜덤값으로 좌표설정
	}
}

