package chapter10_problems;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Problem02 extends JFrame {
	public Problem02() {
		super("마우스 드래그");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container c = getContentPane(); //컨테이너 객체 선언
		c.setLayout(null); //레이아웃이 필요없어 null
		MouseActionListener listener = new MouseActionListener();
		//구현해둔 마우스 리스너 객체를 가져옴
		
		c.setBackground(Color.green); //기본 배경색 초록
		c.addMouseListener(listener);	//마우스 클릭 감지
		c.addMouseMotionListener(listener); //마우스 움직임 감지
		/*
		 * 드래그는 클릭 후 움직이는 행동이다.
		 * 마우스 리스너로 클릭 감지로 클릭을 감지하고
		 * 이후 마우스 모션 리스너로 움직임을 감지해서
		 * 동시에 이 둘을 인식하고 행동을 취한다.
		*/
		
		setSize(300,300);
		setVisible(true);
		//레이아웃 크기와 표시설정
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Problem02();
	}
}

class MouseActionListener extends MouseAdapter {	
	public void mouseReleased(MouseEvent e) {
		//마우스를 땔때의 행동을 설정해준다.(다시 배경색 초록으로) 단순 클릭시는 취할 행동이 없어 구현 할 필요가 없다.
		Container newC = (Container)e.getSource();
		newC.setBackground(Color.green);
	}
	public void mouseDragged(MouseEvent e) {
		//마우스가 클릭되고 움직일때 행동을 설정해준다. (배경색 노랑으로)
		Container newC = (Container)e.getSource();
		newC.setBackground(Color.YELLOW);
	}
}
