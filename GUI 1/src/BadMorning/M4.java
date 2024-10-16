package BadMorning;

import java.awt.event.*;
import java.util.Iterator;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class M4 extends JFrame {

	

	public M4() {

		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			JButton a= new JButton(""+(i+1));
			a.setBackground(new Color(r,g,b));
			a.setOpaque(true);
			c.add(a);
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new M4();
	}

}
