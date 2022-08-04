package Exercise08.Exercise08;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ExchangeCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	final String[] msg = {"EUR/PTAS", "PTAS/EUR"};
	private boolean switcher = true;

	/**
	 * Create the frame.
	 */
	public ExchangeCalculator() {
		setTitle("WITHDRAWALS CONVERSION (PREMIUM VERSION)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 164);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("AMOUNT TO CONVERT");
		label.setBounds(24, 23, 139, 13);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(173, 20, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setBounds(350, 23, 67, 13);
		contentPane.add(lblResult);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(427, 20, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		final JButton btn = new JButton(msg[0]);
		btn.setBounds(173, 79, 96, 21);
		contentPane.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand() == "EUR/PTAS") {
					if ((textField.getText().isEmpty()))
					{
					     JOptionPane.showMessageDialog(null, "PLEASE DO NOT LEAVE ANY FIELD BLANK!");
					}
					else if (!isNumeric(textField.getText())) 
					{
						JOptionPane.showMessageDialog(null, "THE INPUT IS NOT NUMERICAL");
					}
					else
					{
						Float parsed = Float.parseFloat(textField.getText());
						Float result = (float) (parsed*166.386F);					
						String str =String.valueOf(result); 
						textField_1.setText(str);						
					}					
				} else {
					if ((textField.getText().isEmpty()))
					{
					     JOptionPane.showMessageDialog(null, "PLEASE DO NOT LEAVE ANY FIELD BLANK!");
					}
					else if (!isNumeric(textField.getText())) 
					{
						JOptionPane.showMessageDialog(null, "THE INPUT IS NOT NUMERICAL");
					}
					else
					{
						Float parsed = Float.parseFloat(textField.getText());
						Float result = (float) (parsed/166.386F);					
						String str =String.valueOf(result); 
						textField_1.setText(str);						
					}					
				}
					
		
			}
			
		});
		
		JButton btn_1 = new JButton("SWITCH");
		btn_1.setBounds(427, 79, 96, 21);
		contentPane.add(btn_1);
		
		btn_1.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				if(switcher) {
					btn.setText(msg[1]);
					switcher = false;
				}else {
					btn.setText(msg[0]);
					switcher = true;
				};
				
			}
		});
		

		JButton btn_3 = new JButton("RESTART");
		btn_3.setBounds(25, 79, 114, 21);
		contentPane.add(btn_3);
		
		btn_3.addActionListener(new ActionListener(){	
			public void actionPerformed(ActionEvent e){
				textField.setText("");
				textField_1.setText("");
			}
		});
		
	}
	
	private static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
