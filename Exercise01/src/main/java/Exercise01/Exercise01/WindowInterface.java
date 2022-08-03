package Exercise01.Exercise01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowInterface extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField y;
	private JTextField x;



	/**
	 * Create the frame.
	 */
	public WindowInterface() {
		setTitle("WINDOW MANAGER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        setSize(484, 181);
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JButton btn = new JButton("maximize");
		btn.setBounds(347, 6, 105, 21);
		contentPane.add(btn);
		btn.addActionListener(this);
	
		JButton btn_1 = new JButton("resize");
		btn_1.setBounds(347, 37, 105, 21);
		contentPane.add(btn_1);
		btn_1.addActionListener(this);
		
		JButton btn_2 = new JButton("close");
		btn_2.setBounds(347, 99, 105, 21);
		contentPane.add(btn_2);
		btn_2.addActionListener(this);
		
		JButton btn_3 = new JButton("customize");
		btn_3.setBounds(347, 68, 105, 21);
		contentPane.add(btn_3);
		btn_3.addActionListener(this);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "customize")
				setSize(Integer.parseInt(x.getText()), Integer.parseInt(y.getText()));
			}
		});
		
		y = new JTextField();
		y.setBounds(201, 7, 85, 19);
		contentPane.add(y);
		y.setColumns(10);
		
		x = new JTextField();
		x.setBounds(45, 7, 85, 19);
		contentPane.add(x);
		x.setColumns(10);
		
		JLabel lbl = new JLabel("width");
		lbl.setForeground(Color.RED);
		lbl.setBounds(10, 10, 42, 13);
		contentPane.add(lbl);
		
		JLabel lbl_1 = new JLabel("height");
		lbl_1.setForeground(Color.RED);
		lbl_1.setBackground(Color.WHITE);
		lbl_1.setBounds(155, 10, 36, 13);
		contentPane.add(lbl_1);
	}



	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "maximize") 
			setExtendedState(MAXIMIZED_BOTH);
		if (e.getActionCommand() == "resize") 
			setExtendedState(JFrame.NORMAL);
		if (e.getActionCommand() == "close") 
			System.exit(ABORT);
		
	}




}
