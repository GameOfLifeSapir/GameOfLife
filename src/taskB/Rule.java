package Rules;
public class Rule implements CA_Rule {
	int[][] board;
	int[][] oldboard;

	Rule(int[][] board) {
		this.board = oldboard;
		createBoard(this.board);
		ImplementRule();
	}
	public void createBoard(int[][] board){
		int col = board.length;
		int row = board[col].length;
		newboard = int[col + 2][row + 2];
		for(int i = 1; i < board.length; i++) {
			for(int j = 1; j < board[i].length; j++) {
				newboard[i][j] = board[i - 1][j - 1];
			}
		}
	}
	public int[][] ImplementRule(){
		int result;
		for(int col = 0; col< board.length; col++) {
			for(int row = 0; row< board[col].length; row++) {
				 result = (Rule_1(col,row) + Rule_2(col,row) + Rule_3(col,row));
				if (result == 0) {
					board[col][row] = 0;
				}
				else
					board[col][row] = 1;
			}
			
		}
		return board;
	}
	public int Rule_1(int col,int row) {
		if(board[col][row] == 1) {
			int alive_neighbors = check_neighbors(col,row);
			if (alive_neighbors < 2 || alive_neighbors > 3) {
				return 0; 
		}
			return 1;
		}
		return 0;
	}
	public int Rule_2(int col,int row) {
		if(board[col][row] == 1) {
			int alive_neighbors = check_neighbors(col,row);
			if (alive_neighbors == 2 || alive_neighbors == 3) {
				return 1;
		}
		
		}
		return 0;
	}
	public int Rule_3(int col,int row) {
		if(board[col][row] == 0) {
			int alive_neighbors = check_neighbors(col,row);
			if (alive_neighbors == 3) {
				return 1;
		}
		}
		return 0;
	}
		
	public int check_neighbors(int col,int row) {
		int alive_neighbors = 0;
		
		if(col != 0 && row!= 0 && col != board.length && row!= board[col].length) {
			if(board[col-1][row] == 1) {
				alive_neighbors++;
			}
			if(board[col-1][row+1] == 1) {
				alive_neighbors++;
			}
			if(board[col-1][row-1] == 1) {
				alive_neighbors++;
			}
			if(board[col][row +1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row - 1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row+1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row] == 1) {
				alive_neighbors++;
			}
			if(board[col][row-1] == 1) {
				alive_neighbors++;
			}
		}
		if(col == 0) {
			if(board[col].length == 0) {
				if(board[col][row +1] == 1) {
					alive_neighbors++;
				}
				if(board[col+1][row+1] == 1) {
					alive_neighbors++;
				}
				if(board[col+1][row] == 1) {
					alive_neighbors++;
				}			
				}
			else if(row == board[col].length) {

				if(board[col+1][row - 1] == 1) {
					alive_neighbors++;
				}
				if(board[col+1][row] == 1) {
					alive_neighbors++;
				}
				if(board[col][row-1] == 1) {
					alive_neighbors++;
					}
			}
			else {
			if(board[col][row +1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row - 1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row+1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row] == 1) {
				alive_neighbors++;
			}
			if(board[col][row-1] == 1) {
				alive_neighbors++;
				}
			}
		}
		if(row == 0) {
			if(col == board.length) {
				if(board[col-1][row] == 1) {
					alive_neighbors++;
				}
				if(board[col-1][row+1] == 1) {
					alive_neighbors++;
				}
				if(board[col][row +1] == 1) {
					alive_neighbors++;
				}
			}
			else {
			if(board[col-1][row] == 1) {
				alive_neighbors++;
			}
			if(board[col-1][row+1] == 1) {
				alive_neighbors++;
			}
			if(board[col][row +1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row+1] == 1) {
				alive_neighbors++;
			}
			if(board[col+1][row] == 1) {
				alive_neighbors++;
			}
		}
}
if(col == board.length) {
	if(row == board[col].length) {
		if(board[col][row-1] == 1) {
			alive_neighbors++;
		}
		if(board[col-1][row-1] == 1) {
			alive_neighbors++;
		}
		if(board[col-1][row] == 1) {
			alive_neighbors++;
		}
}

}
else if(row == board[col].length) {
	if(board[col][row-1] == 1) {
		alive_neighbors++;
	}
	if(board[col+1][row-1] == 1) {
		alive_neighbors++;
	}
	if(board[col+1][row] == 1) {
		alive_neighbors++;
	}
	if(board[col-1][row-1] == 1) {
		alive_neighbors++;
	}
	if(board[col-1][row] == 1) {
		alive_neighbors++;
	}
		}
		return alive_neighbors;
	}
	
}
