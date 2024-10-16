package GUIEvent;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class ButtonEx extends JFrame {
	public ButtonEx() {
		setTitle("벤자민 버튼");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalicon = new ImageIcon("src/images/normalIcon.gif");
		ImageIcon rollovericon = new ImageIcon("src/images/rolloverIcon.gif");
		ImageIcon pressedicon = new ImageIcon("src/images/pressedIcon.gif");

		JButton btn = new JButton("call~~", normalicon);
		btn.setPressedIcon(pressedicon);
		btn.setRolloverIcon(rollovericon);

		c.add(btn);
		setSize(250, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ButtonEx();
	}
}
