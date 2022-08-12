package com.company;
class Sudoku{

    public boolean isSafe(char [][]board,int row,int col,int number){
        for(int i =0;i<board.length;i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
        }
        for(int i =0;i<board.length;i++){
            if(board[row][i] == (char)(number +'0')){
                return false;
            }
        }
        //grid
        int sr = 3 * (row/3);
        int sc = 3 * (col/3);

        for(int i=sr; i<sr+3; i++) {
            for(int j=sc; j<sc+3; j++) {
                if(board[i][j] == (char)(number+'0')) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean helper(char[][]board,int row ,int col){
        //1.calculate next row and next col
        int nrow = 0;
        int ncol = 0;
        if(col == board.length-1){ //the col index is in the end
            nrow = row +1;
            col = 0;
        }else{
            nrow = row;
            ncol = col +1;
        }

        if(board[row][col]!='.'){
            if(helper(board,nrow,ncol)){
                return true;
            }else{
                for(int i =1;i<=9;i++){
                    if(isSafe(board,row,col,i)){
                        board[row][col] = (char)(i+'0');
                        if(helper(board,nrow,ncol)){
                            return true;
                        }else{
                            board[row][col] ='.';// Backtracking
                        }
                    }
                }
            }
        }
        return false;
    }

    public void sudokuSolver(char [][]board){
        helper(board,0,0);//row and col
    }
}

public class java_22_SudokuSolver {
    public static void main(String[] args) {
        int a =5;
        char c = (char)(a+'0');
        System.out.println(c);
    }
}
