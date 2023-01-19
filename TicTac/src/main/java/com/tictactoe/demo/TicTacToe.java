package com.tictactoe.demo;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Player-1 name: ");
		String name1 = sc.nextLine();
		System.out.print("Enter Player-2 name: ");
		String name2 = sc.nextLine();
    	
		Players p = new Players(name1, name2);
    	Board board = new Board();
    	board.printBoard();
		
		while(true){
			p.player1Turn();
			if(p.isGameFinished()){
				break;
			}
			board.printBoard();

			p.player2Turn();
			if(p.isGameFinished()){
				break;
			}
			board.printBoard();
		}
		
		sc.close();
	}

}
