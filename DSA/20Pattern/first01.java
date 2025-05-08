//Pattern Pringting Understanding......

/* 
//01
5
* * * * *

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
    }
}
 
*/

//-----------------------------------------------------------------------------


/* 

5
* * * * * 
* * * * * 
* * * * * 
* * * * *
* * * * *

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 
*/



//-----------------------------------------------------------------------------

/* 
5
* 
* *
* * *
* * * *
* * * * *


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

*/

//-----------------------------------------------------------------------------


/* 

5
* * * * * 
* * * *
* * *
* *
*


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
 
*/

//-----------------------------------------------------------------------------



/* 

5
    *
   **
  ***
 ****
*****

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){


            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
 
*/


//-----------------------------------------------------------------------------
/* 
5
*****
 ****
  ***
   **
    *


    import java.util.Scanner;
    public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){


            for(int k=1;k<i;k++){
                System.out.print(" ");
            }

            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
 
*/

//-----------------------------------------------------------------------------
/* 
5
* * * * * 
*       *
*       *
*       *
* * * * *


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
        System.out.println();
        }

    }
}
*/


//-----------------------------------------------------------------------------

/* 

5
    *
   ***
  *****
 *******
*********

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}
 
*/


//-----------------------------------------------------------------------------


/* 

5
*********
 *******
  *****
   ***
    *


    
import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}
 
*/


//-----------------------------------------------------------------------------




/* 

5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        for(int i=n;i>=1;i--){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
}
 
*/

//-----------------------------------------------------------------------------



/* 

5
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *

    import java.util.Scanner;
    public class first01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            
            System.out.println();
        }

        for(int i=n;i>=1;i--){


            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            
            System.out.println();
        }

    }
}
 
*/
//-----------------------------------------------------------------------------




/* 
5
    1
   121
  12321
 1234321
123454321


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {


            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j<=i)
                System.out.print(j);
                else
                System.out.print(2*i-j);
            }

            System.out.println();
        }

    }
}






//both correct are correct


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            
            for(int j=i-1;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}

 
*/



//-----------------------------------------------------------------------------




/* 

5
**********
****  ****
***    ***
**      **
*        *


import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

        System.out.println();
        }

    }
}
*/



//-----------------------------------------------------------------------------




/* 

5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

        System.out.println();
        }

        for (int i=n; i>=1; i--) {
            
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

            for(int k=1;k<=2*i-2;k++){
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){
                System.out.print("*");
            }

        System.out.println();
        }

    }
}

 
*/



//-----------------------------------------------------------------------------




/* 

5
*        
**
***
****  
*****
****
***
**
*

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}

 
*/

//-----------------------------------------------------------------------------



/* 

5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
        }

        for (int i=n-1; i>=1; i--) {
            
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            for(int k=1;k<=(n-i)*2;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
        }

    }
}
 
*/
//-----------------------------------------------------------------------------


//Node:-Importance of space in pattern Quesstion...............

/* 

5
    * 
   * *
  * * *
 * * * *
* * * * *
 import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {

            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    
    }
}
*/

//-----------------------------------------------------------------------------



/* 
 
*/

//-----------------------------------------------------------------------------








import java.util.Scanner;
public class first01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {

            for(int k=1;k<=n-i;k++){
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    
    }
}






/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/


//-----------------------------------------------------------------------------


/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/

//-----------------------------------------------------------------------------



/* 
 
*/
//-----------------------------------------------------------------------------




/* 
 
*/
//-----------------------------------------------------------------------------



