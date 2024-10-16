package GUIEvent;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;

public class ActionEventEx2 extends JFrame {

	public ActionEventEx2() {
		
		setTitle("Action Event");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JButton btn = new JButton("클릭");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("클릭")) {
					b.setText("눌렸다");
				}else {
					b.setText("클릭");
				}
			}
		});
		c.add(btn);
		setSize(400, 600);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ActionEventEx2();
	}

}
