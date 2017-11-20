package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Problem01 extends JFrame {
	public Problem01() {
		super("마우스 올리기 내리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("Love Java");
		c.add(label); 
		//초기작업 (창 꺼질때 종료, 컨테이너 생성 및 정렬 설정, 라벨 붙이기
		
		label.addMouseListener(new MouseAdapter() {	//익명 클래스 활용, 어뎁터로 필요한 기능만 사용
			@Override
			public void mouseEntered(MouseEvent e) { //마우스가 올려졌을때
				JLabel newLabel = (JLabel)e.getSource();
				newLabel.setText("Love Java");
			}
			@Override
			public void mouseExited(MouseEvent e) {	//마우스가 올려지지 않았을때
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});
		setSize(300,150);
		setVisible(true);
	}
	
	static public void main(String [] args) {
		new Problem01();
	}
}
