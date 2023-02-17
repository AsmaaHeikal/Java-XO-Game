public class Main {
    public static void main(String[] args) {
        XO board = new XO();
        board.displayBoard();
        Player p1= new Player("A", 'X');
        int x=0,y=0;
        p1.get_move(x, y);
    }
}
