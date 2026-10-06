class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    boolean helper(char[][] board,int r,int c){
        if(r==9) return true;
        if(board[r][c] != '.') {
            if(c < 8) return helper(board, r, c+1);
            else return helper(board, r+1, 0);
        }

        for(int i=1;i<=9;i++){
            if(safe(i,r,c,board)){
                board[r][c]=(char)(i+'0');
                
                boolean solved;
                if(c < 8) solved = helper(board, r, c+1);
                else solved = helper(board, r+1, 0);

                if(solved) return true;

                board[r][c]='.';
            }
        }
        return false;
    }
    boolean safe(int num,int r,int c,char[][] board){
        for(int i=0;i<9;i++){
            if(board[r][i] == (char)(num+'0')) return false;
            if(board[i][c] ==(char)(num+'0')) return false;
        }
        int sr = (r/3)*3;
        int sc = (c/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(num+'0'))
                    return false;
            }
        }
        return true;
    }
}