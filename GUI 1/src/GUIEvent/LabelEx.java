package GUIEvent;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;
public class LabelEx extends JFrame {
	public LabelEx() {
		setTitle("레이블");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textlabel = new JLabel("나~는 행복합니다~");
		
		ImageIcon beauty = new ImageIcon("src/images/beauty.jpg");
		JLabel imagelabel = new JLabel(beauty);
		
		ImageIcon normalicon = new ImageIcon("src/images/normalIcon.gif");
		JLabel label = new JLabel("한화라서 행복합니다.", normalicon, SwingConstants.CENTER);
		
		c.add(textlabel);
		c.add(imagelabel);
		c.add(label);
		
		setSize(500,600);
		setVisible(true);
	
	
	
	}
	public static void main(String[] args) {
		new LabelEx();
	}

}
