package com.geek.week7;

/**
 * 有效的数独
 * https://leetcode-cn.com/problems/valid-sudoku/description/
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] row= new int[9][9];
        int[][] col=new int[9][9];
        int[][] grid=new int[9][9];
        int n;
        for(int i =0;i<9;i++){
            for(int j=0;j<9;i++){
                if(board[i][j] != '.'){
                    n = board[i][j]-'1';
                    if(row[i][n] !=0 || col[j][n] !=0 || grid[i/3*3+j/3][n] !=0){
                        return false;
                    }
                    row[i][n] =1;
                    col[j][n] =1;
                    grid[i/3*3+j/3][n]=1;
                }
            }
        }


//        for(int i =0;i<9;i++){
//            int row =0;
//            int col =0;
//            int block =0;
//            for(int j =0;j<9;j++){
//                // 由于传入为char，需要转换为int，减48
//                int h = board[i][j] - 48;
//                int v = board[j][i] - 48;
//                int s = board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3] - 48;
//                // "."的ASCII码为46，故小于0代表着当前符号位"."，不用讨论
//                if(h > 0){
//                    row = sodokuer(h, row);
//                }
//                if(v > 0){
//                    col = sodokuer(v, col);
//                }
//                if(s > 0){
//                    block = sodokuer(s, block);
//                }
//                if(row == -1 || col == -1 || block == -1){
//                    return false;
//                }
//            }
//        }

//        Set set = new HashSet();
//        for(int i =0;i<9;i++){
//            for(int j =0;j<9;j++){
//                char number = board[i][j];
//                if(number != '.'){
//                    if(!set.add(number+"row"+i) || !set.add(number+"col"+j) || !set.add(number+"block"+i/3+"-"+j/3)){
//                        return false;
//                    }
//                }
//            }
//        }
        return true;
    }

    private int sodokuer(int n ,int val){
        return ((val >> n) & 1) ==1 ? -1 : val ^(1<<n);
    }
}
