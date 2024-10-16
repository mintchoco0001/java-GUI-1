package GUIEvent;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class Ex3 extends JFrame {
	private JLabel jl;
	private final int FU = 10;
	Container c = getContentPane();

	public Ex3() {
		setTitle("난 안될거야");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		c = getContentPane();
		c.setLayout(null);

		c.addKeyListener(new MyKeyListener());
		jl = new JLabel("HELLO");
		jl.setLocation(50,50);
		jl.setSize(51,50);
		jl.setFont(new Font("asdf", Font.BOLD, 35));
		
		c.add(jl);
		setSize(600, 600);

		setVisible(true);
		c.setFocusable(true);
		c.requestFocus();

	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e)  {
			int keycode = e.getKeyCode();
			switch (keycode) {
			case KeyEvent.VK_UP:
				jl.setLocation(jl.getX(), jl.getY() - FU);
				break;
			case KeyEvent.VK_DOWN:
				jl.setLocation(jl.getX(), jl.getY() + FU);
				break;
			case KeyEvent.VK_LEFT:
				jl.setLocation(jl.getX() - FU, jl.getY());
				break;
			case KeyEvent.VK_RIGHT:
				jl.setLocation(jl.getX() + FU, jl.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ex3();
	}

}
