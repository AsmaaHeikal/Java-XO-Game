//// This class represents the engine that runs a board game
//
//import java.util.Scanner; // for user input
//
//public class Game extends XO{
//        private XO board; // the board of the game
//        private Player players[2]; // the two players
//        // Constructor initializes the game with a board and players
//        Game(XO board, Player& players[2]){
//            this.board = board;
//            this.players = players;
//        }
//
//        // It runs the game and switches turns, until one wins or draw
//        public void play_game(){
//                // Welcome message
//                System.out.println("Welcome to XO Game!");
//                System.out.println("Please enter the name of the first player: ");
//                String name1 = input.nextLine();
//                System.out.println("Please enter your symbol: ");
//                char symbol1 = input.nextLine().charAt(0);
//                System.out.println("Please enter the name of the second player: ");
//                String name2 = input.nextLine();
//                System.out.println("Please enter your symbol: ");
//                char symbol2 = input.nextLine().charAt(0);
//                players[0] = new Player(name1, symbol1);
//                players[1] = new Player(name2, symbol2);
//                board = new XO();
//                board.displayBoard();
//                // The game loop that runs until one wins or draw
//                for (int i = 0; i < 2 ; i++){
//                        // Check if the game is over
//                        if(board.isWinner(players[i].getSymbol())){
//                                System.out.println("Player " + players[i].getName() + " wins!");
//                                return;
//                        }
//                        if(board.isDraw()){
//                                System.out.println("Draw!");
//                                return;
//                        }
//                        // Switch turns
//                        System.out.println("Player " + players[i].getName() + " turn:");
//                        System.out.println("Enter x and y coordinates: ");
//                        int x = input.nextInt();
//                        int y = input.nextInt();
//                        players[i].get_move(x, y);
//                        board.updateBoard(x, y, players[i].getSymbol());
//                        board.displayBoard();
//                }
//        }
//        // The scanner object for user input
//        Scanner input = new Scanner(System.in);
//}
