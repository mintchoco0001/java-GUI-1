package GUIEvent;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel[] keyMessage;
	
	public KeyListenerEx() {
		setTitle("키 이벤트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel (" getKeyCode() ");
		keyMessage[1] = new JLabel (" getKeyChar() ");
		keyMessage[2] = new JLabel (" getKeyText() ");

		for (int i = 0; i < keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.yellow);
		}
	
		setSize(600,600);
		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();
		
	}
	
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}

}
