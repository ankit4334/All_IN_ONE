/********THREADS AND WRPPERS IN JAVA*******

->multiThreading->it is a process to execute multipe threds at the same time wihtout 
dependencey of other threds  calles multithreading.


->Thread->thread is pre-defined class which is available in java.long package.
                    thread is a basic unit of cpu and it is well known of 
          independent execution.


->there are two type of create and define a thread
1.By extending thred class
2.By implementing runable class
*/


/*
//01.extending thread class
class A extends Thread{
    @Override
    public void run(){
        try{

            for(int i=1;i<=5;i++){
            System.out.println("ankit");
            Thread.sleep(1000);
        }

        }
        catch(InterruptedException e){

        }
        
    }

}

public class MultiThreading10 {
    public static void main(String args[]) throws InterruptedException{

        A a=new A();
        a.start();



        for(int i=1;i<=5;i++){
            System.out.println("rock ");
            Thread.sleep(1000);
        }

    }
}

*/









/* 

//2.By implementing runnable class
class A implements Runnable{
    @Override
    public void run(){
       

            for(int i=1;i<=5;i++){
            System.out.println("my child thread");
            
        }
    }
        

}

public class MultiThreading10 {
    public static void main(String args[]) throws InterruptedException{

        A a=new A();
        Thread t=new Thread(a); //here thread object bhi banayege because runnable class program run nahi kra sakta hai
        t.start();
         
        for(int i=1;i<=5;i++){
            System.out.println("Main thread");
            
        }

    }
}

*/









/* Thread Schedular */
//multiple  thread in a file
class A extends Thread{
    public void run(){
              
        String n=Thread.currentThread().getName();
        for(int i=1;i<=3;i++){
            System.out.println(n);
        }

        }
    
}

public class MultiThreading10 {
    public static void main(String args[]) throws InterruptedException{

        A t1=new A();
        A t2=new A();
        A t3=new A();
        
        t1.setName("thread 1");
        t2.setName("thread 2");
        t3.setName("thread 3");


        t1.start();
        t2.start();
        t3.start();
    }
}
