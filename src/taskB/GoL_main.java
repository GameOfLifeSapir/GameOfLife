package taskB;

import java.io.File;

public class GoL_main {

	public static void main(String[] args) {
		System.out.println("~ Starting project");
		File gliderGun = new File("C:\\Users\\pioni\\OneDrive\\Documents\\GitHub\\GameOfLife\\src\\taskB\\GliderGunBig.txt");
		System.out.println("~ Input file loaded");
		GoL_Board board = new GoL_Board(gliderGun);
		System.out.println("~ Board created");
		GUI f = new GUI(board.getBoard());
		System.out.println("~ Initializing board");
		//Rule r = new Rule(board.getBoard());
		
		
		f.initalizeBoard();
		f.updateBoard();
		
//		while() {
//			try {
//				r.ImplementRule();
//				f.updateBoard();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		

	} 

}
