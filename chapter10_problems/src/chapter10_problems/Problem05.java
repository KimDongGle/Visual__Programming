package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem05 extends JFrame {
	public Problem05() {
		super("Left키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		Container c = getContentPane();
		FontSizeSet fontSet = new FontSizeSet();
		JLabel label = new JLabel("Love Java");
		//컨테이너, 키어뎁터 객체, 레벨 객체 생성		
		c.setFont(new Font("Arial", Font.PLAIN, 10));
		c.setLayout(new FlowLayout());
		c.add(label);
		//플로우 레이아웃 설정 후 라벨 추가		
		label.addKeyListener(fontSet);
		//왼쪽키가 눌려지는지 확인
		c.add(label);
		//리스너로 변경된 라벨 다시 표시		
		setSize(300,300);
		setVisible(true);		
		label.setFocusable(true); // 레이블 포커스
		label.requestFocus(); // 레이블 키 포커스
	}
	static public void main(String [] args) {
		new Problem05();
	}
}
class FontSizeSet extends KeyAdapter {
	//왼쪽키가 눌려졌을 때 기능 구현
	@Override
	public void keyPressed(KeyEvent e) {
		JLabel la = (JLabel)e.getSource(); //라벨 정보를 가져옴
		Font f = la.getFont();
		int size = f.getSize();		
		if(e.getKeyCode() == KeyEvent.VK_PLUS)//받아온 키가 플러스 일때
			System.out.println("work+");
			la.setFont(new Font("Arial", Font.PLAIN, size+5)); //폰트 5 증가		
		if(e.getKeyCode() == KeyEvent.VK_MINUS) { //받아온 키가 플러스 일때
			//폰트 5를 감소하되 5 이하면 사이즈를 5로 만든다 
			if(size <= 5) {
				la.setFont(new Font("Arial", Font.PLAIN, 5)); 
			}else{
				la.setFont(new Font("Arial", Font.PLAIN, size-5));
			}
		}
	}
}