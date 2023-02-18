public class XO extends GenericBoard {
    // ba3mel call ll constructor beta3et el superclass we edeto value n = 3
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
        // ba check kol el rows w kol el columns
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == symbol && grid[i][1] == symbol && grid[i][2] == symbol) {
                return true;
            }
            if (grid[0][i] == symbol && grid[1][i] == symbol && grid[2][i] == symbol) {
                return true;
            }
        }

        // ba check el diagonals
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
        // el Draw by7sl lw mafe4 ay space fadia we mafe4 winner
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == ' ') {
                    return false; // lesa fe empty cells 34an keda rag3t false
                }
            }
        }
        return true; // lw kol el cells filled then return true
    }
}
//ــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ
