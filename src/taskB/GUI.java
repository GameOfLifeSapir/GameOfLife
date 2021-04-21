package taskB;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
class GUI extends JFrame {
	final int WINDOW_HEIGHT = 768;
	final int WINDOW_WIDTH = 1024;
    // frame
    static JFrame f;
    // label to display text
    static JLabel l;

    // Frame Constructor
    GUI() {
    	// Create the panels
        JPanel p = new JPanel();
        JPanel gridPanel = new JPanel();
    	int row = 80, col = 80;
        // create a new frame to store text field and button
        f = new JFrame("Game of Life");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Initialize label
        l = new JLabel();
        // set the size of frame and set it visible
        f.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        f.setVisible(true);
        
        
        l.setText("Game of Life"); // Header
        l.setFont(new Font("Courier", Font.BOLD,75));
 
        gridPanel.setLayout(new GridLayout(row, col));
        JLabel[][] grid= new JLabel[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                grid[i][j] = new JLabel();
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                //grid[i][j].setBackground(Color.black);
                grid[i][j].setOpaque(true);
                gridPanel.add(grid[i][j]);
            }
        }
        
        // add panel to frame
        f.add(gridPanel);
        f.show();
        //f.add(gridPanel);
 
       
 
    }
}