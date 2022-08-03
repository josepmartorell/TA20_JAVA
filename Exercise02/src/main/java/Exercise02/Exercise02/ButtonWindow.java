package Exercise02.Exercise02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ButtonWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ButtonWindow() {
		setTitle("BUTTON SWITCHER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 132);
		contentPane = new JPanel();
		contentPane.setLayout(null);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(484, 144);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel lbl = new JLabel("YOU PRESSED");
		lbl.setBounds(10, 35, 86, 13);
		contentPane.add(lbl);
		
		final JLabel lbl_1 = new JLabel("");
		lbl_1.setBounds(91, 35, 60, 13);
		contentPane.add(lbl_1);
		
		JButton btnNewButton = new JButton("BUTTON 1");
		btnNewButton.setBounds(161, 31, 134, 21);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lbl_1.setText(" BUTTON 1");
				
			}

		});
		
		JButton btnNewButton_1 = new JButton("BUTTON 2");
		btnNewButton_1.setBounds(314, 31, 125, 21);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				lbl_1.setText(" BUTTON 2");
				
			}

		});
	}
}
