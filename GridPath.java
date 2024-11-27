public class GridPath {
    private int[][] grid;

    public Location getNextLoc(int row, int col) {
        return null;
        int below = grid[row+1][col];
        int right = grid [row][col+1];
        
    }

    public int sumPath(int row, int col) {
        return 0;
    }

    public GridPath(int[][] values) {
        grid = values;
    }

    public String toString() {
        String s = "";
        for (int[] row:grid) {
            for (int col:row) {
                s += col + " ";
            }
            s += "\n";
        }
        return s;
    }
}

