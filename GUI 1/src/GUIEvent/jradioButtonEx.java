package GUIEvent;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

public class jradioButtonEx extends JFrame {
	private JRadioButton[] radio = new JRadioButton[3];
	private String[] test = { "사과", "배", "체리" };
	private ImageIcon[] image = { new ImageIcon("src/images/apple.jpg"), new ImageIcon("src/images/pear.jpg"),
			new ImageIcon("src/images/cherry.jpg") };
	private JLabel imageLabel = new JLabel();

	public jradioButtonEx() {
		setTitle("radio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JPanel radiopanel = new JPanel();
		radiopanel.setBackground(Color.gray);
		ButtonGroup g = new ButtonGroup();

		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(test[i]);
			g.add(radio[i]);
			radiopanel.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		radio[2].setSelected(true);
		c.add(radiopanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(300, 300);
		setVisible(true);
	}

	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return;
			}
			if (radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			} else if (radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} else {
				imageLabel.setIcon(image[2]);
			}
		}
	}

	public static void main(String[] args) {
		new jradioButtonEx();
	}

}
