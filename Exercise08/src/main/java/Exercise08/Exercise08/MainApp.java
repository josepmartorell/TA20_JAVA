package Exercise08.Exercise08;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class MainApp 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExchangeCalculator frame = new ExchangeCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
