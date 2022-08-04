package Exercise07.Exercise07;

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
					CurrencyExchangeCalculator frame = new CurrencyExchangeCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
