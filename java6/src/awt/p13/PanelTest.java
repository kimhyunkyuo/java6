package awt.p13;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class PanelTest {
	private Frame f;
	private Panel P;
	private Button ok,cancel;
	private TextField tf1;
	
  
	public PanelTest() {
		f = new Frame("panel example");
		ok = new Button("전송");
		cancel = new Button("삭제");
		tf1 = new TextField("Input...");
		P = new Panel();
	}
	public void startFrame() {
		f.add(tf1, BorderLayout.NORTH);
		P.setBackground(Color.green);
		P.add(ok);
		P.add(cancel);
		f.add(P,BorderLayout.CENTER);
		
		f.setSize(400, 400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		PanelTest g = new PanelTest();
		g.startFrame();
	}
}
