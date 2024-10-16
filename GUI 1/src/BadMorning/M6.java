package BadMorning;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class M6 extends JFrame{
	public M6() {
		setTitle("RandomLabel");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		for (int i = 0; i < 20; i++) {
			int x = (int) (Math.random() * 250);
			int y = (int) (Math.random() * 250);
			JLabel a = new JLabel("");
			
			if((a.getX()>=50&&a.getX()<=250)&&(a.getY()>=50&&a.getY()<=250)) {
				a.setLocation(x,y);
				a.setSize(10,10);
				a.setOpaque(true);
				a.setBackground(Color.blue);
				c.add(a);
			}
			
		}
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		new M6();
	}

}
