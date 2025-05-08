/* 
//loop in java
// 1.for loop 
// 2.while loop
// 3.do while loop

import java.util.*;
public class loop02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        // int c=1;
        // while(c<=range){  //while loop in java;
        //     System.out.print(c +" ");
        //     c++;
        // }
         
        //for loop in java
        // for(int i=1;i<=range;i++){
        //     for(int j=1;j<=range;j++){
        //          System.out.print("*"+" ");
        //     }
        //     System.out.println();
            
        // }


        //do while loop in java
        int c=1;
        do{
            System.out.println("hello world");
            c++;

        }while(c<=range);

    }
}


*/










/* 
//break and continew in java
import java.util.*;
public class loop02 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        


        for(int i=1;i<=range;i++){
          if(i==5){
            break;
          }
          else{
            System.out.println(i);
          }
            
        }




        for(int i=1;i<=range;i++){
          if(i==5){
            continue;
          }
          else{
            System.out.println(i);
          }
            
        }




    }
}
*/









/* 
//this topic is class topic


import java.util.*;
public class loop02 {
    public static void main(String args[]){
        
        int a[][]={{1,0,3,4},{2,4,0,9},{4,2,3,1}};
        int b[][]=new int[3][4];

        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            if(a[i][j]==0){
              b[i][j]=100;
            }
          }
        }
          

        
        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            if(b[i][j]==100){
              a[i][j]=0;
            }
          }
        }
      

        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            System.out.print(a[i][j]+" ");
          }
          System.out.println();
        }




    }
}

*/











import java.util.*;
public class loop02 {
    public static void main(String args[]){
      Scanner sc=new  Scanner(System.in);
        
        int a[][]={{1,0,3,4},{2,4,0,9},{4,2,3,1}};
        //int b[][]=new int[3][4];
         
       int row[]=new int[3];
       int col[]=new int[4];

        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            if(a[i][j]==0){
              row[i]=col[j]=0;
            }
          }
        }
          

        
        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            if(row[i]==0 || col[j]==0){
              a[i][j]=0;
            }
          }
        }
      

        for(int i=0;i<3;i++){
          for(int j=0;j<4;j++){
            System.out.print(a[i][j]+" ");
          }
          System.out.println();
        }




    }
}
