class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        int index = 0;

        // First search the first Character
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == word.charAt(0)){
                    if(searchNext(board, word, i, j, index, m, n)) return true;
                }
            }
        }
        return false;
    }

    public boolean searchNext(char[][] board, String word, int row, int col, int index, int m, int n){
        if(index == word.length()) return true;
        if(row < 0 || col < 0 || row >= m || col >= n || board[row][col] != word.charAt(index) || 
        board[row][col] == '!') return false;

        char ch = board[row][col];
        board[row][col] = '!';

        boolean top = searchNext(board, word, row-1, col, index+1, m, n);
        boolean bottom = searchNext(board, word, row+1, col, index+1, m, n);
        boolean left = searchNext(board, word, row, col-1, index+1, m, n);
        boolean right = searchNext(board, word, row, col+1, index+1, m, n);

        board[row][col] = ch;
        return top || bottom || left || right;
    }

}
