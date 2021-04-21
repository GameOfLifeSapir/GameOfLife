package taskB;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 
 * @author 
 * This class implements a Game of life board
 * 
 */
public class GoL_Board
{
	/**
	 * 
	 * @param rows: Number of rows
	 * @param cols: Number of columns
	 * Init new GoL automaton with an empty board
	 */
	
	private int[][] board = null;
	
	public GoL_Board(File initialBoard)
	{
		//reading the text file
		String rowS,colS;
		int row,col;
		String text = null;
		BufferedReader initialBoardText = null;
		try {
			initialBoardText = new BufferedReader(new FileReader(initialBoard));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			text = initialBoardText .readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] strArray = text.split(" ");
		rowS = strArray[0];
		colS = strArray[1];
		row = Integer.parseInt(rowS);
		col = Integer.parseInt(colS);
		this.board = new int [row][col];
		
		try {
			int i = 0;
			while ((text = initialBoardText.readLine()) != null) {
			    for (int j = 0; j < text.length(); j++) {
			    	if(text.charAt(j) == '*') board[i][j] = 1;	
				}
			    i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}

	private int[][] getBoard() {
		return board;
	}

	@Override
	public Iterator iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * @param board: The board to be set.
	 * Set parameter board as current board
	 */
	public void SetBoard(int[][] board)
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				this.board[i][j] = board[i][j];
			}
		}
	}

	/**
	 * 
	 * @return current CA state as a String 
	 */
	public String CurrentBoardOutput()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	// TODO add methods and fields as needed.
	
}
