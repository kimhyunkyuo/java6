package awt.p7;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest {
	private Frame frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BorderTest() {
		frame = new Frame("BorderLayout example");
		south = new Button("button 1");
		west = new Button("button 2");
		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFram() {
		frame.add(tf1, "north");
		frame.add(south, "south");
		frame.add(west, "west");
		frame.add(east, "east");
		frame.add(center, "Center");

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFram();
	}
}





