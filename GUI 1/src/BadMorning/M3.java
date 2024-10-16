package BadMorning;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class M3 extends JFrame {
	public M3() {
		setTitle("GridLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		JButton[] btn = new JButton[10];
		for (int i = 0; i < btn.length; i++) {
			JButton a= new JButton(""+(i+1));
			c.add(a);
		}
		
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new M3();
	}

}
