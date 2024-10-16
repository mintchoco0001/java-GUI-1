package GUIEvent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.Flow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex extends JFrame {

	public Ex() {
		setTitle("모르겠다");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel jl = new JLabel("hello");
		jl.setLocation(30,30);
		jl.setSize(50,50);
		
		c.addMouseListener(new MouseListener() {

			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				jl.setLocation(x, y);
			}
			public void mouseReleased(MouseEvent e) {}
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {}
			public void mouseClicked(MouseEvent e) {}
		});
		c.add(jl);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex();
	}
}