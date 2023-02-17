import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    protected int x, y;
    // Constructor initializes the player with a name and symbol
    Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    // Getters
    public String getName(){
        return name;
    }
    public char getSymbol(){
        return symbol;
    }
    // It gets the move from the player
    public void get_move(int x, int y){
        System.out.println("Player " + name + " turn:");
        System.out.print("Enter x and y coordinates: ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        System.out.println("x = " + x + ", y = " + y);
    }
}
