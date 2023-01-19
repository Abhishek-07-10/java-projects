package com.tictactoe.demo;

public class Board {
	static char board[][] = {{' ', ' ', ' '},
						{' ', ' ', ' '},
						{' ', ' ', ' '}};
	
	
	void printBoard() {
		System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] +"\n");
	}
	
	void update(int i, char symbol){
		switch (i) {
		case 1: 
			board[0][0] = symbol;
			break;
		
		case 2:
			board[0][1] = symbol;
			break;
			
		case 3:
			board[0][2] = symbol;
			break;
			
		case 4:
			board[1][0] = symbol;
			break;
		
		case 5: 
			board[1][1] = symbol;
			break;
			
		case 6:
			board[1][2] = symbol;
			break;
			
		case 7:
			board[2][0] = symbol;
			break;
			
		case 8:
			board[2][1] = symbol;
			break;
			
		case 9: 
			board[2][2] = symbol;
			break;
		}
	}

	boolean isMoveAvailable(int i){
		switch (i) {
		case 1: 
			return board[0][0] == ' ';
		
		case 2:
			return board[0][1] == ' ';
			
		case 3:
			return board[0][2] == ' ';
			
		case 4:
			return board[1][0] == ' ';
		
		case 5: 
			return board[1][1] == ' ';
						
		case 6:
			return board[1][2] == ' ';
			
		case 7:
			return board[2][0] == ' ';
			
		case 8:
			return board[2][1] == ' ';
			
		case 9: 
			return board[2][2] == ' ';
			
		default:
			return false;
		}
	}

    public boolean hasContestantWon(char symbol) {
		if ((board[0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
			(board[1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
			(board[2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
			(board[0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
			(board[0][2] == symbol && board [1][2] == symbol && board [2][2] == symbol) ||
			
			(board[0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
			(board[0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) ) {
			return true;
		}
		return false;
	}
}