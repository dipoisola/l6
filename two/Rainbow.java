package l6.two;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Rainbow extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton jb1 = new JButton(),
			jb2 = new JButton(),
			jb3 = new JButton(),
			jb4 = new JButton(),
			jb5 = new JButton(),
			jb6 = new JButton(),
			jb7 = new JButton();
	
	public Rainbow() {
		setTitle("Rainbow Color Frame");
		setBounds(10, 10, 825, 160);
		Dimension dimension = new Dimension(110, 110);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
		
		jb1.setPreferredSize(dimension);
		jb1.setBackground(Color.RED);
		Red red = new Red();
		jb1.addActionListener(red);
		
		jb2.setPreferredSize(dimension);
		jb2.setBackground(Color.ORANGE);
		Orange orange = new Orange();
		jb2.addActionListener(orange);
		
		jb3.setPreferredSize(dimension);
		jb3.setBackground(Color.YELLOW);
		Yellow yellow = new Yellow();
		jb3.addActionListener(yellow);
		
		jb4.setPreferredSize(dimension);
		jb4.setBackground(Color.GREEN);
		Green green = new Green();
		jb4.addActionListener(green);
		
		jb5.setPreferredSize(dimension);
		jb5.setBackground(Color.BLUE);
		Blue blue = new Blue();
		jb5.addActionListener(blue);
		
		jb6.setPreferredSize(dimension);
		jb6.setBackground(new Color(75, 0, 130));
		Indigo indigo = new Indigo();
		jb6.addActionListener(indigo);
		
		jb7.setPreferredSize(dimension);
		jb7.setBackground(new Color(238, 130, 238));
		Violet violet = new Violet();
		jb7.addActionListener(violet);
		
		add(jb1);
		add(jb2);
		add(jb3);
		add(jb4);
		add(jb5);
		add(jb6);
		add(jb7);
	}
	
	class Red implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Red signifies passion, vitality, enthusiasm and security");
		}
		
	}
	
	class Orange implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Orange signifies creativity, practicality, playfulness as well as equilibrium or control");
		}
		
	}
	
	class Yellow implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Yellow represents clarity of thought, wisdom, orderliness and energy");	
		}
		
	}
	
	class Green implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Green denotes fertility, growth, balance, health and wealth");
		}
		
	}
	
	class Blue implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Blue has been associated with Spirituality and Divinity");
		}
		
	}
	
	class Indigo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Indigo is often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition");
		}
		
	}
	
	class Violet implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Deeper shades of violet or purple denote high spiritual mastery");
		}
		
	}

}
