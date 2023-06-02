package awt.p27;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameClasTest extends WindowAdapter {
	private Frame f;

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);

		
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 100);
		f.setVisible(true);
	}
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
}
