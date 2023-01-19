package com.tictactoe.demo;

import java.util.Scanner;

public class Players {
    String player1 ;
    String player2 ;

    public Players(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
    
    Board board = new Board();
    // board.printBoard();
    Scanner sc = new Scanner(System.in);

    public boolean isGameFinished(){
        if(board.hasContestantWon('X')){
            board.printBoard();
			System.out.println(this.player1 + " wins!");
			return true;
        }
        if(board.hasContestantWon('O')){
            board.printBoard();
			System.out.println(this.player2 + " wins!");
			return true;
        }

        for(int i = 1 ; i <= 9 ; i++){
            if(board.isMoveAvailable(i)){
                return false;
            }
        }
        board.printBoard();
        System.out.println("Game Tie!!!!!");
        return true;
    }

    void player1Turn(){
        int pos ;
        while(true){
            System.out.println(this.player1 + " Enter the positions from [1-9] in board");
            pos = sc.nextInt();
            if(board.isMoveAvailable(pos)){
                board.update(pos, 'X');
                break;
            }
            else{
                System.out.println("Space occupied!!!. Enter the different number from [1-9]\n");
            }
            board.printBoard();
        }
    }

    void player2Turn(){
        int pos ;
        while(true){
            System.out.println(this.player2 + " Enter the positions from [1-9] in board");
            pos = sc.nextInt();
            if(board.isMoveAvailable(pos)){
                board.update(pos, 'O');
                break;
            }
            else{
                System.out.println("Space occupied!!!. Enter the different number from [1-9]\n");
            }
            board.printBoard();
        }
    }
}