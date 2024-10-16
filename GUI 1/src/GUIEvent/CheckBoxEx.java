package GUIEvent;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class CheckBoxEx extends JFrame {
	public CheckBoxEx() {
		setTitle("췍");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon cherryicon = new ImageIcon("src/images/cherry.jpg");
		ImageIcon selectedCherryicon = new ImageIcon("src/images/selectedCherry.jpg");
		
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배", true);
		JCheckBox cherry = new JCheckBox("체리", cherryicon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryicon);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
