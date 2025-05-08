//bit manipulation in java.
/*
 Binary and=&;
 Binary or=|;
 Binary xor=^;
 Binary one's comp=~;
 Binary left Shift=<<;   //ans=a*2^b; 0r ans=5<<3==40
 Binary right shifr=>>;  //ans=a/2^b; or ans=5>>1==1;
*/



/* 
public class bitmanu06 {
    public static void main(String arge[]){
        System.out.println("and &:"+(5&4));
        System.out.println("or |:"+(5|4));
        System.out.println("xor ^:"+(5^4));
        System.out.println("com ~:"+(~5));
        System.out.println("ls <<:"+(5<<3));
        System.out.println("rh >>:"+(5>>1));
    }
}
*/




/* 

 //question->cheak if a number is odd or even
//  0=000
//  1=001
//  2=010
//  3=011
//  4=100
//  5=101

//kisi bhi number me (n&1) karne per lsb ka pta chalta hai
//like 5->101&1=001;
//here odd number ka lsb 1 hota hai or even ke liye 0 hota hai

import java.util.Scanner;

public class bitmanu06 {

    public static void oddOrEven(int n){
        if((n&1)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String arge[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        oddOrEven(n);
    }
}

*/




/* 
//question->find get ith bit

import java.util.Scanner;
public class bitmanu06 {

    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
           return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String arge[]){
        System.out.println(getIthBit(10,3));
    }
}
*/







/*
//question->find set ith bit

import java.util.Scanner;
public class bitmanu06 {
    //working n=10 0r 1010+0100=1110=14
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    public static void main(String arge[]){
        System.out.println(setIthBit(10,2));
    }
}
 */







/*
 //quesion->clear bit
 
import java.util.Scanner;
public class bitmanu06 {
    
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static void main(String arge[]){
        System.out.println(clearIthBit(10,1));
    }
}

 */





/*
//question->update ith bit
import java.util.Scanner;
public class bitmanu06 {

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n,int i,int newBit){
        if(newBit==0){
            return  clearIthBit(n, i);
        }
        else{
            return setIthBit(n,i);
        }
    }
    public static void main(String arge[]){
        System.out.println(updateIthBit(10,2,1));
    }
}

 */











 //question->cheak number is power or not
 import java.util.Scanner;
public class bitmanu06 {
    
    public static boolean isPowerOfTwo(int n){
       return (n&(n-1))==0;
    }
    public static void main(String arge[]){
        System.out.println(isPowerOfTwo(15));
        System.out.println(isPowerOfTwo(16));

    }
}

