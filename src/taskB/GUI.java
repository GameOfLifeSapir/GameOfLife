package taskB;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
	// Window size
	final int WINDOW_HEIGHT = 768;
	final int WINDOW_WIDTH = 1024;
	
	// 
	
	
	void createPanel() {
		JFrame frame = new JFrame("Game of Life");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		JLabel label1 = new JLabel("Test");
		frame.getContentPane().add(label1, BorderLayout.CENTER);
		
	}
	
	
}
