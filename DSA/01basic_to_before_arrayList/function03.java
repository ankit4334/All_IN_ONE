/* 
//function in java:-A Java function is a block of code designed to perform a specific task, 
encapsulated within a class or interface.

import java.util.*;
public class function03{
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }



    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    printMyName(name);

        
    }
}
*/


















/* 

//function add two number
import java.util.*;
public class function03{
    public static int addTwoNumber(int a,int b){
        
        return a+b;
    }
    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int  a=sc.nextInt();
    int  b=sc.nextInt();

    System.out.println(addTwoNumber(a,b));

        
    }
}

*/








/* 

//Binomial Coefficient

//function add two number
import java.util.*;
public class function03{
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    //Binomial coeffient(ncr=n!/r!(n-r)!)

    public static int binoCoff(int n,int r){
          int a=fact(n);
          int b=fact(r);
          int c=fact(n-r);
          int ans=a/b*c;
          return ans;
    
    }
    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    int  r=sc.nextInt();
    

    System.out.println(binoCoff(n,r));

        
    }
}
*/














/*
//prime number
import java.util.*;
public class function03{
    public static boolean primeNo(int n){
        if(n==2)
        return true;

            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        
        return true;
        
        
    }
    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    

    System.out.println(primeNo(n));

        
    }
}

 */








 /*
//print the prime in the range

import java.util.*;
public class function03{
    public static void primeRange(int a,int b){

        for(int i=a;i<=b;i++){
        int f=0;
        if(i==0 || i==1){
            continue;
        }

        for(int j=2;j<i;j++){
            if(i%j==0){
                f=1;
            }
        }
        
        if(f==1){
            System.out.println(i+"number is not prime");
        }
        else{
            System.out.println(i+"number is prime");
        }

        }
    }
    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int  a=sc.nextInt();
    int b=sc.nextInt();
    primeRange(a,b);

        
    }
}

 */













 //question->Convert from Decimal to Binary
 
import java.util.*;
public class function03{
    public static int deciToBinary(int n){
        
        int s=0;
        int i=1;
        while(n!=0){
          int k=n%2;
          s=s+k*i;  //or s=s+(k*(int)Math.pow(10,i))
          i=i*10;
          n=n/2;

        }

        return s;
        
    }
    public static void main(String arge[]){
    Scanner sc=new Scanner(System.in);
    int  n=sc.nextInt();
    

    System.out.println(deciToBinary(n));

        
    }
}