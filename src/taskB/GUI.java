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
    // Grid display
    static JPanel gridPanel;


    // Frame Constructor
    GUI() {
    	// Create the panels
        gridPanel = new JPanel();
        
        // DEBUG
    	int row = 80, col = 80;
    	
        // create a new frame to store text field and button
        f = new JFrame("Game of Life");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // set the size of frame and set it visible
        f.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        f.setVisible(true);
 
        
        // Render initial grid
        render_initialGrid(row, col);
        
        
        // add panel to frame
        
        //f.add(gridPanel);
 
        
    }


	@SuppressWarnings("deprecation")
	private void render_initialGrid(int row, int col) {
		final int LENGTH = row;
		
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
        
        f.add(gridPanel);
        f.show();
        
        for(int i = 0; i < LENGTH; i++) {
        	grid[i][i].setBackground(Color.red);
        	
        	gridPanel.revalidate();
        	gridPanel.repaint();
        	
//        	
//        	f.remove(gridPanel);
//            f.add(gridPanel);
//            f.show();
        }
        
        
		
	}
}