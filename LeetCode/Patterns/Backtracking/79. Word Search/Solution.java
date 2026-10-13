
class Solution {

    public boolean search(char[][] board, String word,
                          int i, int j, int c,
                          boolean[][] visited) {

        // Current character does not match
        if (board[i][j] != word.charAt(c)) {
            return false;
        }

        // All characters have been matched
        if (c == word.length() - 1) {
            return true;
        }

        // Mark the current cell as used
        visited[i][j] = true;

        int row = board.length;
        int col = board[0].length;

        int[][] dir = {
            {0, 1}, {0, -1}, {1, 0}, {-1, 0}
        };

        // Explore all four directions
        for (int[] d : dir) {
            int ni = i + d[0];
            int nj = j + d[1];

            // Check boundaries and whether cell is unused
            if (ni >= 0 && ni < row &&
                nj >= 0 && nj < col &&
                !visited[ni][nj]) {

                if (search(board, word, ni, nj,
                           c + 1, visited)) {
                    return true;
                }
            }
        }

        // Backtrack: allow this cell in other paths
        visited[i][j] = false;

        return false;
    }

    public boolean exist(char[][] board, String word) {

        int row = board.length;
        int col = board[0].length;

        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (board[i][j] == word.charAt(0)) {

                    if (search(board, word, i, j,
                               0, visited)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
