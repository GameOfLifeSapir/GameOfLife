package taskB;

import java.io.BufferedReader;
import java.io.File;
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
public class GoL_Board extends CA
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
		String MatrixValue[] = new String[2];
		BufferedReader initialBoardText = new BufferedReader(new FileReader(initialBoard));
		try {
			text = initialBoardText .readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] strArray = text.split(" ");
		rowS = strArray[0];
		colS = strArray[1];
		row = Integer.parseInt(rowS);
		col = Integer.parseInt(colS);

		board = new int [row][col];
		
		
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
		// TODO Auto-generated method stub
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
