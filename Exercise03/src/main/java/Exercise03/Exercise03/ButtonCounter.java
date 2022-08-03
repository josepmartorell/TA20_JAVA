package Exercise03.Exercise03;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ButtonCounter extends JFrame {

	private JPanel contentPane;
	private JLabel label_1;
	private JLabel label_2;
	private String[] msg = {"PRESSED", "Times"};
	

	/**
	 * Create the frame.
	 */
	public ButtonCounter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 128);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		label_1 = new JLabel("START COUNT!");
		label_1.setBounds(23, 10, 206, 13);
		contentPane.add(label_1);
		
		label_2 = new JLabel("START COUNT!");
		label_2.setBounds(239, 10, 206, 13);
		contentPane.add(label_2);
		
		JButton button_1 = new JButton("BUTTON 1");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_1.setBackground(Color.ORANGE);
		button_1.setBounds(10, 33, 219, 21);
		contentPane.add(button_1);
		button_1.addActionListener(new ActionListener() {
			int counter = 0;
			public void actionPerformed(ActionEvent e) {
				counter++;
				label_1.setText(msg[0] + " " + counter + " " +msg[1]);
				
			}
		});
		
		JButton button_2 = new JButton("BUTTON 2");
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(239, 33, 206, 21);
		contentPane.add(button_2);
		button_2.addActionListener(new ActionListener() {
			int counter = 0;
			public void actionPerformed(ActionEvent e) {
				counter++;
				label_2.setText(msg[0] + " " + counter + " " +msg[1]);
				
			}
		});
		

	}
}
