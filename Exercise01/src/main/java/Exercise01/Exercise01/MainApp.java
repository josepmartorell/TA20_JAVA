package Exercise01.Exercise01;

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
					WindowInterface frame = new WindowInterface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
