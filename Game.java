// This class represents the engine that runs a board game

import java.util.Scanner; // for user input

public class Game extends XO{
        private XO board; // the board of the game
        private Player players[]; // the two players
        // Constructor initializes the game with a board and players
        Game(){
            players = new Player[2];
        }

        // It runs the game and switches turns, until one wins or draw
        public void play_game(){
                // Welcome message
                System.out.println("Welcome to XO Game!");
                System.out.println("Please enter the name of the first player: ");
                String name1 = input.nextLine();
                System.out.println("Please enter your symbol: ");
                char symbol1 = input.nextLine().charAt(0);
                System.out.println("Please enter the name of the second player: ");
                String name2 = input.nextLine();
                System.out.println("Please enter your symbol: ");
                char symbol2 = input.nextLine().charAt(0);
                // Initialize the players
                players[0] = new Player(name1, symbol1);
                players[1] = new Player(name2, symbol2);
                // Initialize the board
                board = new XO();
                // The game loop that runs until one wins or draw
                while(true){
                        // Check if the game is over
                        if(board.isWinner(players[0].getSymbol())){
                                System.out.println("Player " + players[0].getName() + " wins!");
                                return;
                        }
                        if(board.isWinner(players[1].getSymbol())){
                                System.out.println("Player " + players[1].getName() + " wins!");
                                return;
                        }
                        if(board.isDraw()){
                                System.out.println("Draw!");
                                return;
                        }
                        // Switch turns
                        int x = 0 , y = 0;
                        players[0].get_move(x, y);
                        board.updateBoard(players[0].x, players[0].y, players[0].getSymbol());
                        board.displayBoard();
                        // Check if the game is over
                        if(board.isWinner(players[0].getSymbol())){
                                System.out.println("Player " + players[0].getName() + " wins!");
                                return;
                        }
                        if(board.isWinner(players[1].getSymbol())){
                                System.out.println("Player " + players[1].getName() + " wins!");
                                return;
                        }
                        if(board.isDraw()){
                                System.out.println("Draw!");
                                return;
                        }
                        // Switch turns
                        players[1].get_move(x, y);
                        board.updateBoard(players[1].x, players[1].y, players[1].getSymbol());
                        board.displayBoard();
                }
        }
        // The scanner object for user input
        Scanner input = new Scanner(System.in);
}
