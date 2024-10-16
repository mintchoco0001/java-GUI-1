package GUIEvent;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class Ex2 extends JFrame {
	private JLabel keyMessage;
	Container c = getContentPane();

	public Ex2() {
		setTitle("난 안될거야");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		c.addKeyListener(new MyKeyListener());

		keyMessage = new JLabel(" 키를 입력하세요. ");

		c.add(keyMessage);
		keyMessage.setOpaque(true);
		keyMessage.setBackground(Color.yellow);

		setSize(600, 600);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			char keyChar = e.getKeyChar();
			int keyCode = e.getKeyCode();
			
			if(keyChar=='%') {
				c.setBackground(Color.yellow);
			}else if(keyCode >= 112 || keyCode <=123){
				keyMessage.setText(e.getKeyText(keyCode)+" 키가 눌렸습니다");
			}else {
				keyMessage.setText(Character.toString(keyChar) + " 키가 눌렸습니다");
			}
		}
	}

	public static void main(String[] args) {
		new Ex2();
	}

}
