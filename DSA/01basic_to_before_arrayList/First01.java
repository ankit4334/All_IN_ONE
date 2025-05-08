//this is lecture 1 basic of java
//use sout sort key for write println

/* 

public class First01 {
    public static void main(String[] args) {
        System.out.println(("hello World"));
        System.out.println(("hello World"));
        System.out.print(("hello World\n"));

        //println and \n ,print in new line while print funtion print inline

        System.out.print(("hello World"));
        System.out.print(("hello World"));
    }
    
}

*/












/*
public class First01 {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");

    }
    
}

 */









/* 

 //variable in java

 public class First01 {
    public static void main(String[] args) {
        String name="ankit";
        double price=20.5;
        int a=34;
        int b=50;

        System.out.println(name);
        System.out.println(price);
        System.out.println(a+b);
        

    }
    
}

*/











/*

//taking input in java;
//in java take input with help the class scanner
import java.util.*;

public class First01 {
    public static void main(String[] args) {
       //input object

       Scanner sc=new Scanner(System.in);
       String name=sc.next();
       //sc.next() print only one world
       System.out.println(name);

       Scanner sc1=new Scanner(System.in);
       String name1=sc1.nextLine();
       //sc.nextline() print all string world
       System.out.println(name1);
        

       //for int ->nextInt()
       //for float ->nextFloat()
       //for double->nextDouble();
       //for long->nextLong();
       //for short->nextShort()
       

    }
    
}


*/








/*
//sum of two number
import java.util.*;

public class First01 {
    public static void main(String[] args) {
       //input object

       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();

       int sum=a+b;
       System.out.println(sum);
    }
    
}

 */




//Star printing;
/*
 import java.util.*;

public class First01 {
    public static void main(String[] args) {
       //input object

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
       }
    }
    
}

 */






 //cheak weather a number is armstrong number or not
/*

 import java.util.*;
public class First01 {
    public static void main(String[] args) {
       //input object

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int c=0;
       while(n!=0){
        int k=n%10;
        c++;
        n/=10;
       }


        int sum=0;
        int p=n;
        while(n!=0){
        int k=n%10;
        sum=sum+pow(k,c);
        n/=10;

      }
      if(sum==p){
        System.out.println("number is armstrong number");
      }
      else{
        System.out.println("number is not armstrong number");
      }
    }
    
}

 */








 
//Pyramid printing


/*
import java.util.*;
public class First01 {
    public static void main(String[] args) {
       //input object

       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      // int space=1;
          int space=n-1;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        space--;
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
       }
       
       
    }
    
}

 */




























/*



//type conversion in java

 import java.util.*;
public class First01 {
    public static void main(String[] args) {
    
        //print correct 
    //   int a=30;
    //   long b=a;
    //   System.out.println(b);
   


    
     //it give error not possible 
    // long a=30;
    // int b=a;
    // System.out.println(b);


    //it give error because  in float value not insert in int but reverse is allow
    // Scanner sc=new Scanner(System.in);
    // int number=sc.nextFloat();
    // System.out.println(number);
 



    Scanner sc=new Scanner(System.in);
    float number=sc.nextInt();
    System.out.println(number);


    }
    
}


   */












//type casting->type casting is a process in which do conversion force fully

import java.util.*;
public class First01 {
    public static void main(String[] args) {
    
      float a=25.12f;
      int b=(int)a;
      System.out.println(b);



      char ch='a';
      char ch1='b';

      int n=ch;
      int n2=ch1;
      System.out.println(n);
      System.out.println(n2);



      //type promotion ->if(char a,char b->b-a,a-b retutn intger value ,+,-,*) is called type promotion

      char c='a';
      char d='b';
      System.out.println(c);
      System.out.println(d-c);



      
    }
    
}
 //1:26

 