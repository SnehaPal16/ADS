public class WordSearch79 {
        public boolean exist(char[][] board, String word) {
            int m = board.length, n = board[0].length;
    
            // Try to find the word starting from every cell
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }
    
        private boolean dfs(char[][] board, String word, int i, int j, int index) {
            // If index reaches word length, word is found
            if (index == word.length()) return true;
    
            // Boundary checks and character match check
            if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
                return false;
            }
    
            // Mark the cell as visited by modifying it temporarily
            char temp = board[i][j];
            board[i][j] = '#'; // Use a special character to mark visited
    
            // Explore in four possible directions
            boolean found = dfs(board, word, i + 1, j, index + 1) ||
                            dfs(board, word, i - 1, j, index + 1) ||
                            dfs(board, word, i, j + 1, index + 1) ||
                            dfs(board, word, i, j - 1, index + 1);
    
            // Restore the cell after backtracking
            board[i][j] = temp;
            return found;
        }
}
    

