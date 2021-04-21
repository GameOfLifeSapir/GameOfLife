package Rules;

public class Rule implements CA_Rule {
	Board old_board;
	Board new_board;

	Rule(Board board) {
		old_board = board;
		new_board = board;
	}

	public boolean ImplementRule(){
		for(int col = 0; col< old_board.rows; col++) {
			for(int row = 0; row< old_board.cols; row++) {
				new_board(col,row) = (Rule_1(col,row) || Rule_2(col,row) || Rule_3(col,row) || Rule_4(col,row));
			}
		}
	}
	public boolean Rule_1(int col,int row) {
		if(old_board(col,row) == true) {
			
		
		int alive_neighbors = check_neighbors(col,row);
		if (alive_neighbors < 2 || alive_neighbors >3) {
			return false;
		}
		return true;
		}
		return false;
	}
	public boolean Rule_2(int col,int row) {
		if(old_board(col,row) == true) {
		int alive_neighbors = check_neighbors(col,row);
		if (alive_neighbors == 2 || alive_neighbors >3) {
			return false;
		}
		return true;
		}
		
	public int check_neighbors(int col,int row) {
		int alive_neighbors = 0;
		
		if(col != 0 && row!= 0 && col != old_board.rows && row!= old_board.cols) {
			if(old_board(col-1,row) == true) {
				alive_neighbors++;
			}
			if(old_board(col-1,row+1) == true) {
				alive_neighbors++;
			}
			if(old_board(col-1,row-1) == true) {
				alive_neighbors++;
			}
			if(old_board(col,row +1 ) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row - 1) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row+1) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row) == true) {
				alive_neighbors++;
			}
			if(old_board(col,row-1) == true) {
				alive_neighbors++;
			}
		}
		if(col == 0) {
			if(row == 0) {
				if(old_board(col,row +1 ) == true) {
					alive_neighbors++;
				}
				if(old_board(col+1,row+1) == true) {
					alive_neighbors++;
				}
				if(old_board(col+1,row) == true) {
					alive_neighbors++;
				}			
				}
			else if(row == old_board.rows) {

				if(old_board(col+1,row - 1) == true) {
					alive_neighbors++;
				}
				if(old_board(col+1,row) == true) {
					alive_neighbors++;
				}
				if(old_board(col,row-1) == true) {
					alive_neighbors++;
					}
			}
			else {
			if(old_board(col,row +1 ) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row - 1) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row+1) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row) == true) {
				alive_neighbors++;
			}
			if(old_board(col,row-1) == true) {
				alive_neighbors++;
				}
			}
		}
		if(row == 0) {
			if(col == old_board.cols) {
				if(old_board(col-1,row) == true) {
					alive_neighbors++;
				}
				if(old_board(col-1,row+1) == true) {
					alive_neighbors++;
				}
				if(old_board(col,row +1 ) == true) {
					alive_neighbors++;
				}
			}
			else {
			if(old_board(col-1,row) == true) {
				alive_neighbors++;
			}
			if(old_board(col-1,row+1) == true) {
				alive_neighbors++;
			}
			if(old_board(col,row +1 ) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row+1) == true) {
				alive_neighbors++;
			}
			if(old_board(col+1,row) == true) {
				alive_neighbors++;
			}
		}
}
if(col == old_board.rows) {
	if(row == old_board.cols) {
		if(old_board(col,row-1) == true) {
			alive_neighbors++;
		}
		if(old_board(col-1,row-1) == true) {
			alive_neighbors++;
		}
		if(old_board(col-1,row) == true) {
			alive_neighbors++;
		}
}

}
else if(row == old_board.cols) {
	if(old_board(col,row-1) == true) {
		alive_neighbors++;
	}
	if(old_board(col+1,row-1) == true) {
		alive_neighbors++;
	}
	if(old_board(col+1,row) == true) {
		alive_neighbors++;
	}
	if(old_board(col-1,row-1) == true) {
		alive_neighbors++;
	}
	if(old_board(col-1,row) == true) {
		alive_neighbors++;
	}
		}
		
	}
	
}
