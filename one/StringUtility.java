package l6.one;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class StringUtility extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton button1 = new JButton("Count Letters"), 
			button2 = new JButton("Reverse Letters"), 
			button3 = new JButton("Remove Duplicates");
	
	JTextField textField1 = new JTextField(),
			   textField2 = new JTextField();

	public StringUtility() {
		Container contentPane = getContentPane();
		
		setTitle("String Utility");
		setSize(450, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		contentPane.setLayout(null);
		
		button1.setBounds(40, 10, 150, 25);
		contentPane.add(button1);
		CountLetter countLetter = new CountLetter();
		button1.addActionListener(countLetter);
		
		button2.setBounds(40, 45, 150, 25);
		contentPane.add(button2);
		ReverseLetter reverseLetter = new ReverseLetter();
		button2.addActionListener(reverseLetter);
		
		button3.setBounds(40, 80, 150, 25);
		contentPane.add(button3);
		RemoveDuplicate remove = new RemoveDuplicate();
		button3.addActionListener(remove);
		
		textField1.setBounds(220, 30, 180, 25);
		contentPane.add(textField1);
		
		textField2.setBounds(220, 65, 180, 25);
		contentPane.add(textField2);
	}
	
	class CountLetter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = textField1.getText();
			textField2.setText("");
			
			if (input != null && input != "") {
				int count = Utility.countLetters(input);
				textField2.setText(Integer.toString(count));
			}
		}
		
	}
	
	class ReverseLetter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = textField1.getText();
			textField2.setText("");
			
			if (input != null && input != "") {
				String reversed = Utility.reverseLetters(input);
				textField2.setText(reversed);
			}
		}
		
	}
	
	class RemoveDuplicate implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String input = textField1.getText();
			textField2.setText("");
			
			if (input != null && input != "") {
				String noDuplicates = Utility.removeDuplicates(input);
				textField2.setText(noDuplicates);
			}
		}
		
	}
}
