//What is an Exception.
/*
 ->Exception->Exceptions in java are any abnormal,unexpected event
 or extraordinary conditions that may occure at runtime.


 ->Exceiption handiling->java exception handling is used to
 handle error conditions in a program systematically by taking 
 the necessary action.


 ->agar try block me error nahi hoga ho cacth block nahi chalega lekin finaly chalega

 ->try block me jha error mil gya waha  se aage process nahi hoga.
*/

/* 
public class Exception09 {
    public static void main(String args[]){
        System.out.println("Started...");
       try{
         int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        System.out.println("we are got two number..");
        int result=n1/n2;
        System.out.println("Division is "+result);

       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("n2 can not be 0 !!");
        System.out.println(e.getMessage());
       }
       
       //java provide multiple catch for one try block
       catch(NumberFormatException e){
        System.out.println("Invalid Numbers");
        System.out.println(e.getMessage());
       }

       //only Exception hanld all type of exception where e is object
       catch(Exception e){
        System.out.println("error");
        System.out.println(e.getMessage());
       }

       finally{//always chalta hai 
        System.out.println("i am in finally block");
        System.out.println("closing all the resources");
       }
       

    }
}
*/












/* 

//How to create custom exception....
public class Exception09 {
    public static void main(String args[]){
         System.out.println("Started...");
       try{
         int n1=Integer.parseInt(args[0]);
        int n2=Integer.parseInt(args[1]);
        System.out.println("we are got two number..");
        int result=n1/n2;
        System.out.println("Division is "+result);
        if(n2<10){
            throw new AgeInvalidException("my is invalid");
        }

       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("n2 can not be 0 !!");
        System.out.println(e.getMessage());
       }


        AgeInvalidException e=new AgeInvalidException();
        
       

    }
}

class AgeInvalidException extends Exception{
    AgeInvalidException(){
        super("age is invalid !");
    }

    AgeInvalidException(String message){

        super(message);;
    }
}

*/





















/*
//Program of exception handling
public class Exception09 {
    public static void main(String args[]){

        //without try block
    //   String str="ankit";
    //   int a=Integer.parseInt(str);
    //   System.out.println(a);
        




    //after try block;

    String str="ankit";
    
    try{
       int a=Integer.parseInt(str);
       System.out.println(a);
       System.out.println("string NumbwerFormteException");
    }
    catch(Exception e){
        System.out.println(e);

    }
    
       

    }
}


 */













/*

 //program
 public class Exception09 {
    public static void main(String args[]){

    try{
        System.out.println("ankit kumar");
        int a=20,b=0,c;

        //if b=0 then output is 
        c=a/b;
        System.out.println(c);
        System.out.println("rock is bad man");

    }
    catch(ArithmeticException e){
         System.out.println("can't devid by zero");
    }

    finally{

        System.out.println("this is finaly block");

    }

    System.out.println("all proced  end");

    }
}
*/







/*
//program
 public class Exception09 {
    public static void main(String args[]){

    try{
        System.out.println("ankit kumar");
        int a=20,b=0,c;

        //if b=0 then output is 
        c=a/b;
        System.out.println(c);
        System.out.println("rock is bad man");

    }
    catch(NullPointerException e){  //here diffrent exception ko handle kar rhe hai
         System.out.println("can't devid by zero");
    }

    finally{

        System.out.println("this is finaly block");

    }

    System.out.println("all proced  end");

    }
}
*/







/*

public class Exception09 {
    public static void main(String args[]){

    try{
        System.out.println("ankit kumar");
        int a=20,b=0,c;

        //if b=0 then output is 
        c=a/b;
        System.out.println(c);
        System.out.println("rock is bad man");

    }
    catch(ArithmeticException e){
        int x=20,y=0,z;
         z=x/y;
         System.out.println(z);
         System.out.println("can't devid by zero");
    }

    finally{

        System.out.println("this is finaly block");

    }

    System.out.println("all proced  end");

    }
}
 */












/* 

 public class Exception09 {
    public static void main(String args[]){

    try{
        System.out.println("ankit kumar");
        int a=20,b=0,c;

        //if b=0 then output is 
        c=a/b;
        System.out.println(c);
        System.out.println("rock is bad man");

    }
    catch(ArithmeticException e){
        int x=20,y=0,z;
         z=x/y;
         System.out.println(z);
         System.out.println("can't devid by zero");
    }

    finally{

        int a=20,b=0,c;

        //if b=0 then output is 
        c=a/b;
        System.out.println(c);
        System.out.println("this is finaly block");

    }

    System.out.println("all proced  end");

    }
}

*/
















/*
//multiple try and catch block in java

public class Exception09 {
    public static void main(String args[]){

    try{
        
        int a=20,b=0,c;
        c=a/b;
    }
    catch(ArithmeticException e){
         System.out.println("can't devid by zero");
    }


    try{
        
        int  arr[]={1,2,3,3,4,5,6};
        System.out.println(arr[8]);
    }
    catch(ArrayIndexOutOfBoundsException e){
         System.out.println("size of array is less not  found element");
    }


    //above there are two try block dono try block indepentent hai agar phle me error hoga to phla handle arega otherwise dusrawala apne



    }
}

 */








/*
//what  will be output of following code
 public class Exception09 {
    public static void main(String args[]){

        int divisor =0;
        int dividend = 11;
     
        try
        {
            int result=dividend/divisor;
            System.out.println("The result is "+result);
        }
        catch(Exception e)
        {
            System.out.println("An exception occured");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Division by zero");
        }
        finally
        {
            System.out.println("We are done!");
        }

    }
}

 */




















//throw understanding?

 public class Exception09 {
    public static void main(String args[]){

        

    }
}