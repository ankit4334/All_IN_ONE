//One-d Array in java;
//defining an array 


/* 

1.What is an Array in Programming?
An Array is a collection of similar data types stored in contiguous memory locations.
At the time of declaration of an array, you must specify the type of data with the array name.


2.What is a Jagged Array in Java?
Jagged arrays are multidimensional arrays in which the member arrays are of different sizes. 
As an example, we can make a 2D array where the first array contains three elements, and the 
second array consists of four elements. Below is an example demonstrating the concept of jagged arrays.


*/



//int min=Integer.MIN_VALUE;
//int max=Integer.MAX_VALUE;

/*
 public class array04 {
    public static void main(String arge[]){
        //declear array
        int a[]=new int[3];
        int[] b=new int[3];
        //both array declearation is correct
        a[0]=10;
        a[1]=20;
        a[2]=30;
        System.out.println(a[2]);

        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
         
    }
}
*/











/*
  //method 2 array declearation
 public class array04 {
    public static void main(String arge[]){
        //declear array
        int a[]={10,20,30};
        System.out.println(a[2]);

        for(int i=0;i<3;i++){
            System.out.println(a[i]);
        }
         
    }
}

*/





//********************************* */
/*
//question->Trapping  Rainwater
import java.util.*;
public class array04 {

    public static int trappedRainwater(int height[]){
        int n=height.length;
        //calculate left max boundary -array
        int leftMax[]=new int[n]; 
        leftMax[0]=height[0];
        for(int i=0;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);

        }
        //calculate rifht max boundary -array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
         int trappedWater=0;
        for(int i=0;i<n;i++){
            //waterLevel=min(leftmax boundary,rightmax boundary)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //trapped water =waterLevel-height[i]
            trappedWater+=waterLevel-height[i];
        }
        
       
    
    
        return trappedWater;

    }
    public static void main(String arge[]){
        int height[]={4,2,0,6,3,2,5};

         System.out.println(trappedRainwater(height));
    }
}


*/


/*

//BUY AND SELL STOCKS

import java.util.*;
public class array04 {

    public static int buyAndSellStocks(int prices[]){
    int n=prices.length;
    int buyPrice=Integer.MAX_VALUE;
     int maxProfit=0;
     for(int i=0;i<n;i++){
          if(buyPrice<prices[i]){  //profit
             int profit=prices[i]-buyPrice;   //today's profit
             maxProfit=Math.max(profit,maxProfit);

          }
          else{
            buyPrice=prices[i];

          }
     }
        
    
         return maxProfit;

    }
    public static void main(String arge[]){
        int prices[]={7,1,5,3,6,4};

         System.out.println(buyAndSellStocks(prices));
    }
}
 

 */












/* 
  //taking array from user
  //method 2 array declearation
  import java.util.*;
 public class array04 {
    public static void main(String arge[]){
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int arr[]=new int[size];

       for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
       }

       for(int i=0;i<size;i++){
        System.out.println(arr[i]);
       }
    }
}


*/















/*
//2-d Array in java 
//2-D Array declaration
import java.util.*;
 public class array04 {
    public static void main(String arge[]){
        Scanner sc=new Scanner(System.in);


        int a[][]=new int[3][3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=sc.nextInt();

        }
       }

       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           System.out.print(a[i][j]+" ");

        }
        System.out.println();
       }


    }
}  

 */




















/*

 //2-d Array in java 
//2-D Array declaration
import java.util.*;
 public class array04 {
    public static void main(String arge[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int a[][]=new int[n][m];
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            a[i][j]=sc.nextInt();

        }
       }

       

       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
           System.out.print(a[i][j]+" ");
           
           }
        System.out.println();
       }


    }
}  
 */














/* 
 //print the diagonal sum
 import java.util.*;
 public class array04 {


    public static int diagonalSum(int matrix[][]){
        // int row=matrix.length;
        // int col=matrix[0].length;
        // int sum=0;

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         if(i==j){   //first diagonal
        //             sum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){  //socond digonal or(i==matrix.length-j-1);
        //              sum+=matrix[i][j];
        //         }

        //     }
        // }
        
        // return sum;

     //linear time complexity solve
     int sum=0;
     for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];   //first diagonal

        if(i!=matrix.length-1-i)   //second diagonal
        sum+=matrix[i][matrix.length-i-1];

     }

     return sum;


    }

    public static void main(String arge[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

       System.out.println(diagonalSum(matrix));
    }
}  
*/






/* 
 //Add two matrix 
 //TC=O(r*c)  && SC=O(r*c)
 import java.util.*;
 public class array04 {
    public static void addTwoMatix(int mat1[][],int mat2[][]){
        int r=mat1.length;
        int c=mat2[0].length;
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=mat1[i][j]+mat2[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String arge[]){
        int mat1[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int mat2[][]={{4,3,2,1},{5,2,9,2},{4,2,1,9},{8,4,2,7}};

       addTwoMatix(mat1,mat2);

    }
}  
*/




/* 
 //Print Row index with max Sum;
 import java.util.*;
 public class array04 {
    public static int maxRowIndex(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        int ans[][]=new int[r][c];
        int index=-1;
        int sum=0;
        for(int i=0;i<r;i++){
            int currSum=0;
            for(int j=0;j<c;j++){
                currSum+=mat[i][j]; 
                if(currSum>sum){
                    sum=currSum;
                    index=i;
                }  
            }    
        }

        return index;
    }

    public static void main(String arge[]){
        int mat[][]={{1,2,3,4},{5,6,7,8},{99,10,11,12},{13,14,15,16}};
        
        System.out.println(maxRowIndex(mat));

    }
}  
*/





//Reverse EAch row of Matrix
import java.util.*;
public class array04 {
   
    public static void reverseRow(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;

        for(int i=0;i<r;i++){
            int s=0;
            int e=c-1;
            while(s<e){
                int t=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=t;
                s++;
                e--;
            }
        }

    }

   public static void main(String arge[]){
       int mat[][]={{1,2,3,4},{5,6,7,8},{99,10,11,12},{13,14,15,16}};

       reverseRow(mat);

       for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat.length;j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
        }
   }
}  



/* 
Print Matrix in snake Pattern
Difficulty: EasyAccuracy: 68.08%Submissions: 73K+Points: 2
Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.


Examples :

Input: N = 3, matrix[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
Output: 45 48 54 87 89 21 70 78 15 
Explanation: Printing it in snake pattern will lead to the output as 45 48 54 87 89 21 70 78 15.
Input: N = 2, matrix[][] = [[1, 2], [3, 4]]
Output: 1 2 4 3 
Explanation: Printing it in snake pattern will give output as 1 2 4 3.
Constraints:
1 <= N <= 103
1 <= mat[i][j] <= 109

static ArrayList<Integer> snakePattern(int matrix[][])
    {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0)
            for(int j=0;j<matrix.length;j++){
                ans.add(matrix[i][j]);
            }
            
            else
            for(int j=matrix.length-1;j>=0;j--){
                ans.add(matrix[i][j]);
            }
        }
        
        return ans;
    }


*/

//-------------------------------------------------------

/* 
 Transpose of Matrix
Difficulty: EasyAccuracy: 66.5%Submissions: 104K+Points: 2
Write a program to find the transpose of a square matrix of size N*N. Transpose of a matrix is obtained by changing rows to columns and columns to rows.

Examples :

Input: N = 4, mat[][] = [[1, 1, 1, 1], [2, 2, 2, 2], [3, 3, 3, 3], [4, 4, 4, 4]]
Output: [[1, 2, 3, 4] , [1, 2, 3, 4], [1, 2, 3, 4], [1, 2, 3, 4]] 
Input: N = 2, mat[][] = [[1, 2],[9, -2]]
Output: [[1, -9], [2, -2]]

Constraints:
1 <= N <= 103
-109 <= mat[i][j] <= 109

Company Tags
MakeMyTripInfoEdgeBloomberg


public void transpose(int n,int a[][])
{
        int ans[][]=new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=a[j][i];
            }
        }
        
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=ans[i][j];
            }
        }
           
}


//method-02

public void transpose(int n,int a[][])
{
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
       
}


*/


//-------------------------------------------------------

/* 
Rotate by 90 degree
Difficulty: EasyAccuracy: 56.88%Submissions: 86K+Points: 2
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space. 

Examples:

Input: mat[][] = [[1, 2, 3],
                [4, 5, 6]
                [7, 8, 9]]
Output: Rotated Matrix:
[3, 6, 9]
[2, 5, 8]
[1, 4, 7]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: Rotated Matrix:
[2, 4]
[1, 3]
Constraints:
1 ≤ n ≤ 102
1 <= mat[i][j] <= 103

static void rotateby90(int mat[][]) { //without extra space
        int r=mat.length;
        int c=mat[0].length;
        
        
        //Traspose of the matrix 
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        
        //reverse matric colum wise
        for(int j=0;j<c;j++){
            int s=0;
            int e=r-1;
            while(s<e){
                int t=mat[s][j];
                mat[s][j]=mat[e][j];
                mat[e][j]=t;
                s++;
                e--;
            }
        }
        
    }


    //method-2 (with extra space)
     static void rotateby90(int mat[][]) {
        int r=mat.length;
        int c=mat[0].length;
        int ans[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[r-j-1][i]=mat[i][j];
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=ans[i][j];
            }
        }
        
    }



*/




//-------------------------------------------------------

/* 
Rotate a Matrix by 180 Counterclockwise
Difficulty: EasyAccuracy: 54.87%Submissions: 10K+Points: 2
Given a square matrix mat[], turn it by 180 degrees without using extra space.

Note: You must rotate the matrix in place and modify the input matrix directly.

Examples:

Input: mat = [[1, 2],
             [3, 4]]
Output: [[4, 3], 
         [2, 1]]
Input:  mat = [[1, 2, 3, 4], 
              [5, 6, 7 ,8], 
              [9, 10, 11, 12],
              [13, 14, 15, 16]]
Output: [[16, 15, 14, 13], 
         [12, 11, 10, 9], 
         [8, 7, 6, 5], 
         [4, 3, 2, 1]]
Constraints:
1 ≤ mat.size() ≤ 500

Company Tags

public void rotateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        
        //Transpose the matrix
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        
        //reverse the row
        for(int i=0;i<r;i++){
            int s=0,e=c-1;
            while(s<e){
                int t=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=t;
                s++;
                e--;
            }
        }
        
        
         //Transpose the matrix
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        
        //reverse the row
        for(int i=0;i<r;i++){
            int s=0,e=c-1;
            while(s<e){
                int t=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=t;
                s++;
                e--;
            }
        }
        
        
    }


    //Method -02 By reverse each colum and each row
    public void rotateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        
        //reverse each column
        for(int j=0;j<c;j++){
            int s=0,e=r-1;
            while(s<e){
                int t=mat[s][j];
                mat[s][j]=mat[e][j];
                mat[e][j]=t;
                s++;
                e--;
            }
        }
        
        //reverse Each row
        for(int i=0;i<r;i++){
            int s=0,e=c-1;
            while(s<e){
                int t=mat[i][s];
                mat[i][s]=mat[i][e];
                mat[i][e]=t;
                s++;
                e--;
            }
        }
        
    }


*/





//-------------------------------------------------------

/* 
 


*/




//-------------------------------------------------------

/* 
 


*/