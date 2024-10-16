package BadMorning;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class M5 extends JFrame{
	public M5() {
		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(0,4));
		JButton[] btn = new JButton[16];
		for (int i = 0; i < btn.length; i++) {
			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			JButton a= new JButton(""+(i));
			a.setBackground(new Color(r,g,b));
			a.setOpaque(true);
			c.add(a);
		}
		setSize(500, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new M5();
	}

}
