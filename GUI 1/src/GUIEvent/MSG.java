package GUIEvent;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
public class MSG extends JFrame {
	 MSG() {
		 setTitle("알림창 띄우기");
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
	
		 JButton btn = new JButton("벤자민 버트");
		 btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "아래 내용","위쪽 내용", JOptionPane.ERROR_MESSAGE);
			}
		});
		 
		 c.add(btn);
		 setSize(400,600);
		 setVisible(true);
	}
	public static void main(String[] args) {
		new MSG();
	}

}
