package GUIEvent;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class CADC extends JFrame {

	public CADC() {
		setTitle("더블클릭 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300, 300);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}
	}

	public static void main(String[] args) {
		new CADC();
	}

}
