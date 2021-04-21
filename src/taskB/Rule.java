package taskB;

public class Rule {
	int[][] board;
	int[][] updatedBoard;

	Rule(int[][] board) {
		this.board = board;
		updatedBoard = new int[this.board.length][this.board[0].length];
	}

	public void ImplementRule() {
		int neigh = 0;
		for (int col = 0; col < board.length - 1; col++) {
			for (int row = 0; row < board[col].length - 1; row++) {
				try {
					neigh = board[row][col - 1] + board[row + 1][col - 1] + board[row + 1][col] + board[row + 1][col + 1]
							+ board[row][col + 1] + board[row - 1][col - 1] + board[row - 1][col]
							+ board[row - 1][col + 1];
					if ((neigh != 3 || neigh != 2) && board[row][col] == 1) {
						updatedBoard[col][row] = 0;
					}

					if (neigh == 3 && board[row][col] == 0)
						updatedBoard[col][row] = 1;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}

		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {

				board[i][j] = updatedBoard[i][j];

			}

		}
	}

	/*
	 * public void ImplementRule(){ int result; for(int col = 0; col< board.length;
	 * col++) { for(int row = 0; row< board[col].length; row++) { result =
	 * (Rule_1(col,row) + Rule_2(col,row) + Rule_3(col,row)); if (result == 0) {
	 * board[col][row] = 0; } else board[col][row] = 1; }
	 * 
	 * } }
	 */
//	public int Rule_1(int col, int row) {
//		if (board[col][row] == 1) {
//			int alive_neighbors = check_neighbors(col, row);
//			if (alive_neighbors < 2 || alive_neighbors > 3) {
//				return 0;
//			}
//			return 1;
//		}
//		return 0;
//	}
//
//	public int Rule_2(int col, int row) {
//		if (board[col][row] == 1) {
//			int alive_neighbors = check_neighbors(col, row);
//			if (alive_neighbors == 2 || alive_neighbors == 3) {
//				return 1;
//			}
//
//		}
//		return 0;
//	}
//
//	public int Rule_3(int col, int row) {
//		if (board[col][row] == 0) {
//			int alive_neighbors = check_neighbors(col, row);
//			if (alive_neighbors == 3) {
//				return 1;
//			}
//		}
//		return 0;
//	}
//
//	public int check_neighbors(int col, int row) {
//		int alive_neighbors = 0;
//		for (int i = -1; i < 2; i++) {
//			for (int j = -1; j < 2; j++) {
//				try {
//					if (board[i][j] == 0) {
//						alive_neighbors++;
//					}
//				} catch (Exception e) {
//				}
//			}
//		}
//		return alive_neighbors;
//	}

//		if (col != 0 && row != 0 && col != board.length && row != board[col].length) {
//			if (board[col - 1][row] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col - 1][row + 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col - 1][row - 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col][row + 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col + 1][row - 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col + 1][row + 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col + 1][row] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col][row - 1] == 1) {
//				alive_neighbors++;
//			}
//		}
//		if (col == 0) {
//			if (board[col].length == 0) {
//				if (board[col][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row] == 1) {
//					alive_neighbors++;
//				}
//			} else if (row == board[col].length) {
//
//				if (board[col + 1][row - 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col][row - 1] == 1) {
//					alive_neighbors++;
//				}
//			} else {
//				if (board[col][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row - 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col][row - 1] == 1) {
//					alive_neighbors++;
//				}
//			}
//		}
//		if (row == 0) {
//			if (col == board.length) {
//				if (board[col - 1][row] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col - 1][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col][row + 1] == 1) {
//					alive_neighbors++;
//				}
//			} else {
//				if (board[col - 1][row] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col - 1][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row + 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col + 1][row] == 1) {
//					alive_neighbors++;
//				}
//			}
//		}
//		if (col == board.length) {
//			if (row == board[col].length) {
//				if (board[col][row - 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col - 1][row - 1] == 1) {
//					alive_neighbors++;
//				}
//				if (board[col - 1][row] == 1) {
//					alive_neighbors++;
//				}
//			}
//
//		} else if (row == board[col].length) {
//			if (board[col][row - 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col + 1][row - 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col + 1][row] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col - 1][row - 1] == 1) {
//				alive_neighbors++;
//			}
//			if (board[col - 1][row] == 1) {
//				alive_neighbors++;
//			}
//		}
//		return alive_neighbors;
//	}
}