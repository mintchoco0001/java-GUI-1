package BadMorning;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

import javax.swing.JFrame;

public class M1 extends JFrame{
	public M1() {
		setTitle("swing");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setBackground(Color.cyan);
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new M1();
	}

}
