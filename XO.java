public class XO extends GenericBoard {
    // Calling the constructor of the super class and giving n value of 3.
    public XO() {
        super(3); 
    }
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ

    @Override
    public boolean updateBoard(int x, int y, char symbol) {
        x--; // convert to 0-based
        y--;
        if (x < 0 || x >= n || y < 0 || y >= n || grid[x][y] != ' ') {
            return false; // invalid move
        }
        grid[x][y] = symbol;
        return true;
    }
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ

    @Override
    public boolean isWinner(char symbol) {
        // Checking rows and columns.
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }

        // Checking diagonals.
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }
        if (grid[0][2] == symbol && grid[1][1] == symbol && grid[2][0] == symbol) {
            return true;
        }

        return false;
    }
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ

    @Override
    public boolean isDraw() {
        // If there is no space left and no winner, then it's draw.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == ' ') {
                    return false; // There are still empty cells. That's why it returns false.
                }
            }
        }
        return true; // If all cells are filled, then return true.
    }
}
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ
