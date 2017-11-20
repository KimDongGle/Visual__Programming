package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem04 extends JFrame {
	public Problem04() {
		super("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		Container c = getContentPane();
		leftKeySet leftkey = new leftKeySet();
		JLabel label = new JLabel("Love Java");
		//컨테이너, 키어뎁터 객체, 레벨 객체 생성
		
		c.setLayout(new FlowLayout());
		c.add(label);
		//플로우 레이아웃 설정 후 라벨 추가
		
		label.addKeyListener(leftkey);
		//왼쪽키가 눌려지는지 확인
		c.add(label);
		//리스너로 변경된 라벨 다시 표시
		
		setSize(200,100);
		setVisible(true);
		
		label.setFocusable(true); // 레이블 포커스
		label.requestFocus(); // 레이블 키 포커스
	}
	static public void main(String [] args) {
		new Problem04();
	}
}

class leftKeySet extends KeyAdapter {
	//왼쪽키가 눌려졌을 때 기능 구현
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			JLabel la = (JLabel)e.getSource(); //라벨 정보를 가져옴
			String text  = new String(la.getText()); //라벨에서 텍스트를 가져옴
			String first = text.substring(0, 1); //텍스트의 첫 부분만 때넴
			String others = text.substring(1); //텍스트의 첫 부분을 제외만 나머지를 때넴
			text =  others + first;	//위 때넨 두개의 배치를 반대로
			
			la.setText(text); //변경 텍스트 표시
		}
	}
}
