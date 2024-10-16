package BadMorning;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class M2 extends JFrame{
	public M2() {
		setTitle("Boarder");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new BorderLayout(5,7));
		c.add(new JButton("동"), new BorderLayout().EAST);
		c.add(new JButton("서"), new BorderLayout().WEST);
		c.add(new JButton("남"), new BorderLayout().SOUTH);
		c.add(new JButton("북"), new BorderLayout().NORTH);
		c.add(new JButton("센"), new BorderLayout().CENTER);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new M2();
	}

}
