package taskB;

import java.io.File;

public class GoL_main {

	public static void main(String[] args) {
		System.out.println("~ Starting project");
		File gliderGun = new File("/Users/gnyhlmprt/Google Drive/Coding/GoL/GameOfLife/src/taskB/GliderGunBig.txt");
		System.out.println("~ Input file loaded");
		GoL_Board board = new GoL_Board(gliderGun);
		System.out.println("~ Board created");
		GUI f = new GUI(board.getBoard());
		
		System.out.println("~ Initializing board");
		f.initalizeBoard();

	}

}
