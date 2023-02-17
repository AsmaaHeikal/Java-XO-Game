public abstract class GenericBoard {
    protected int n;
    protected char[][] grid;
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ
// hena ba3mel constructor lel class 34an a2dr anady 3leh b3d keda fe el XO class.
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

    //kol el methods de hat3mlha override fe el subclass we dh 3la 7sb el game elly e7na han3mlha.
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

