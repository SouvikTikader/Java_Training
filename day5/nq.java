public class nq {
  void queen(int[][] board, int row,int n){
    if(row==n){
      printBoard(board, n);
          return;

      
    }
    for (int j=0;j<n;j++){
      if(issafe(board, row,j,n)){
        board[row][j]=1;
        queen(board,row+1,n);
        board[row][j]=0;
      }
    }
  }
  boolean issafe(int[][] board, int row, int col,int n){
    for(int j=0;j<n;j++){
      if(board[row][j]==1){
        return false;
      }
    }
    for(int i=0;i<n;i++){
      if(board[i][col]==1){
        return false;
      }
    }
    
    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 1) {
            return false;
        }
    }

    for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
        if (board[i][j] == 1) {
            return false;
        }
    }
    return true;
  }
  void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
        System.out.println(); 
  }
  public static void main(String[] args) {
        int n = 8; 
        int[][] board = new int[n][n];
        
        nq solver = new nq();
        solver.queen(board, 0, n);
    
      
  }
  
}
