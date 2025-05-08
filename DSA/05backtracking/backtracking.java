//Backtracking in java.
/*
Backtracking is an algorithm that finds all the possible solutions and 
selects the desired solution from the given set of solutions.

->types of backtracking in java;
1.Dkecision ->given two point there are any way to reach one point to another point
2.Optimization->there are various way one point to another point but find shortest path.
3.Enumeration->how many posible way one point to another point.
 
 
*/

/* 

 
//Q-:print array using backtracking
public class backtracking {

    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion  
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;

    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String arge[]){
    
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
        
    }
}
*/

/*
//find and print all subsets of a given string;
//Note-:No of subsets is=2^n 
//  intput-abc
//  output-:a,b,c,ab,bc,ac,abc;

import java.util.*;
public class backtracking {   //TC(2^n*n) and SC (n)

    public static void find_all_sub(String str,String ans,int i){
        //base case
        if(i==str.length());
        System.out.println(ans);
        return;

        //recursion
        find_all_sub(str, ans+str.charAt(i), i+1);
        find_all_sub(str, ans, i+1);
    }

    public static void main(String arge[]){
    
        String str="abc";
        find_all_sub(str,"",0); 
        
    }
}
*/

/* 

//Q-:find and print all premutations of a string;
//Note-:No of permutation is=n!
import java.util.*;
public class backtracking {

    public static void findPermutation(String str,String ans){//TC=(n*n!)
        //base case
        if(str.length()==0){
        System.out.println(ans);
        return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String Newstr=str.substring(0, i)+str.substring(i+1);
            findPermutation(Newstr, ans+curr);
        }
       
        
    }

    public static void main(String arge[]){
    
        String str="abc";
        findPermutation(str, "");
        
    }
}

*/

/* 

//Q-:N-Queens-:place n queens on an N*N chessboard such that no 2 queens cna attack each other 

import java.util.*;
public class backtracking {

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueen(char board[][],int row){  //Tc=O(n!)

        //base case
        if(row==board.length){
            printBoard(board);
            return;
        }


        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){   //function isSafe call
                board[row][j]='Q';
                nQueen(board, row+1);   //function call
                board[row][j]='x';      //backtraking step
            }
        }  
    }

    //Printing the board........  
    public static void printBoard(char board[][]){
        System.out.println("--------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arge[]){
    
       int n=4;
       char board[][]=new char[n][n];

       //initialize
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='x';   //khali jagah hai . se intitialize kiya hai
        }
       }
        

       nQueen(board,0);
    }
}

*/

/* 


//Another type of queens -Count Ways
//Q-:N-Queens-: Count total number of ways in which we can solve N Queens Problem.

import java.util.*;
public class backtracking {

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQueen(char board[][],int row){  //Tc=O(n!)

        //base case
        if(row==board.length){
            //printBoard(board);
            count++;  //only here change for count total posible way
            return;
        }


        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){   //function isSafe call
                board[row][j]='Q';
                nQueen(board, row+1);   //function call
                board[row][j]='x';      //backtraking step
            }
        }  
    }

    //Printing the board........  
    public static void printBoard(char board[][]){
        System.out.println("--------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String arge[]){
    
       int n=4;
       char board[][]=new char[n][n];

       //initialize
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='x';   //khali jagah hai . se intitialize kiya hai
        }
       }
        

       nQueen(board,0);
       System.out.println("Total ways to solve n Queens = "+count);
    }
}

*/

/* 

//Another type:-Print 1 Solution
//Q-:N-Queens-:Check if problem can be solved and print only 1 solution to N queens problem.

import java.util.*;
public class backtracking {

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }


    //here chenge void to boolean 
    public static boolean nQueen(char board[][],int row){  //Tc=O(n!)

        //base case
        if(row==board.length){
            //printBoard(board);
            count++;  //only here change for count total posible way
            return true;
        }


        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){   //function isSafe call
                board[row][j]='Q';
                if(nQueen(board, row+1)){//here add if condition
                    return true;
                }  
                board[row][j]='x';      
            }
        }  
        return false; 
    }

    //Printing the board........  
    public static void printBoard(char board[][]){
        System.out.println("--------chess board-------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int count=0;
    public static void main(String arge[]){
    
       int n=4;
       char board[][]=new char[n][n];

       //initialize
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            board[i][j]='x';   //khali jagah hai . se intitialize kiya hai
        }
       }
        
       if(nQueen(board,0)){
        System.out.println("Solution is posible");
        printBoard(board);
       }
       else{
        System.out.println("Solution is not posible");
       }
       
       
    }
}
*/

/* 
//Q-Grid Ways:-Find number of ways to reach from(0,0) to (N-1,M-1) in a NxM Grid.
//Allowed moves-right or Down.

import java.util.*;
public class backtracking {

    //maximum time coplexity
    public static int gridWay(int i,int j,int n,int m){//Tc=O(2^(n+m))
        //base case
        if(i==n-1 && j==m-1){  //condition for last cell
            return 1;
        }
        else if(i==n || j==n){  //boundary cross condition
            return 0;
        }

        int w1=gridWay(i+1, j, n, m);
        int w2=gridWay(i, j+1, n, m);
        return w1+w2;
    }


    //optimal solution 

    public static void main(String arge[]){
    
     int n=3,m=3;
     System.out.println(gridWay(0, 0, n, m));
       
    }
}
*/




















/*

//Q-Sudoku:-Write a function to complete a Sudoku.
//Allowed moves-right or Down.

import java.util.*;

public class backtracking {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // row
        for (int i = 0; i <= 8; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // grid
        // sr=staring row
        // sc=staring col
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // grid size 3x3 so add 3 and above divid and multiply by 3.
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        // recursion
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) {// solution is exist
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    // function for printSodoku
    public static void printSodoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String arge[]) {

        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 2 } };

        if (sudokuSolver(sudoku,0,0)) {
            System.out.println("Solution exists");
            printSodoku(sudoku);
        } else {
            System.out.println("Solution does not  exists");
        }

    }
}
*/