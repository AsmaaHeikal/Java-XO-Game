public abstract class GenericBoard {
    protected int n;
    protected char[][] grid;
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ
// Creating constructor to be called in XO class.
    public GenericBoard(int n) {
        
        this.n = n;
        this.grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                this.grid[i][j] = ' ';
            }
        }
    }
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ

    //These methods are going to be overriden depending on the game. 
    public abstract boolean updateBoard(int x, int y, char symbol);

    public abstract boolean isWinner(char symbol);

    public abstract boolean isDraw();
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ
//displaying board

    public void displayBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + grid[i][j] + " ");
                if (j < n - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < n - 1) {
                for (int k = 0; k < n; k++) {
                    System.out.print("----");
                }
                System.out.println();
            }
        }
    }
}
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ

