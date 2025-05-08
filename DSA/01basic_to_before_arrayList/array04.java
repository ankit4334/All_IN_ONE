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
        int  a[]=new int[3];
        int[]  b=new int[3];
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