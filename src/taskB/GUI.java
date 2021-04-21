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
	
	// Board
	int[][] board;
    // frame
    static JFrame f;
    // Grid display
    static JPanel gridPanel;
    
    // Render board
    static JPanel gridPanel_nextFrame;


    // Frame Constructor
    void initalizeBoard() {
    	// Create the panels
        gridPanel = new JPanel();
        gridPanel_nextFrame = new JPanel();
        
        // DEBUG
    	int row = board.length, col = board[0].length;
    	
        // create a new frame to store text field and button
        f = new JFrame("Game of Life");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        // set the size of frame and set it visible
        f.setSize(WINDOW_HEIGHT, WINDOW_WIDTH);
        f.setVisible(true);
 
        System.out.println("~ Frame initialized");
        
        // Render initial grid
        render_initialGrid(row, col);
        
        
        // add panel to frame
        
        //f.add(gridPanel);
 
        
    }


	public GUI(int[][] board) {
		this.board = board;
		System.out.println("~ Board assigned to GUI");
	}


	@SuppressWarnings("deprecation")
	private void render_initialGrid(int row, int col) {
		final int ROWS = row;
		final int COLS = col;
		
		// Draws the orignal grid.
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
        
        System.out.println("~ Initial grid created");
        
        f.add(gridPanel);
        gridPanel_nextFrame = gridPanel;
        f.show();
        
        System.out.println("~ Creating next board");
        JLabel[][] frame_grid = new JLabel[row][col];
        frame_grid = grid;
        for(int i = 0; i < ROWS; i++) {
        	for(int j = 0; j < COLS; j++) {
        		if(board[i][j] == 1) {
        			frame_grid[i][j].setBackground(Color.RED);
        		}
        	}
        }
        
        gridPanel = gridPanel_nextFrame;
        System.out.println("~ Board created, updated");
        
		
	}
}