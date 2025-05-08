

/*
->What is the concept of access specifiers when should we use these?
Ans:-In OOPs language, access specifiers are reserved keyword that is used to set the accessibility of the classes, methods and other members of the class.


//Access Modifires        within class       within package           OUTSIDEPACKAGE BY SUBCLASS ONLY         OUTSIDE PACKAGE
//01Private               Y                   N                       N                                       N
//02default               Y                   Y                       N                                       N
//03Protected             Y                   Y                       Y                                       N
//04public                Y                   Y                       Y                                       N
*/





/* 
 //Oops has 4 major pillor
 01.Encapsulation->Encapsulation is defind as the wrapping up of 
 data and method under a single unit. it aslo implements data hiding.




 02.Inheritance->inheritance is when properties and method
 of base class are passed on to a derived class;





 03.Abtraction->Hiding all the unceccessary details and showing only 
 the imprtant part to the user
 ->there are two type in java 
 ******
 -01.Abstract  Classes ->kise phi class ko abstrack banane ke
 liye uske  aage abstract class likh dete hai.
 
 ->lie->abstract class{

 }

 ->properties of abstract
 01.Cannot create an instance or object of abstract class.
 02.Can have abstract/nonabstract method.
 03.Can have constructors.





 ******
 -02.Interfaces



 04.Polymorphism->Poly means many and morphism means form(like diffrent constructor)
 ->Two type of polymorphism
 -01Compile Time polymorphism 
  .method overloding->multiple funciton with the same name but diffrent parametes
 -02Run Time Polymorphism 
  .method Overriding->parent and child classes both contain the same funciton with a diffrent defination.



*/


/* 

public class Opps08 {
    public static void main(String args[]){

        Pen p1=new Pen(); //created  a pen onject called pa
        p1.setColor("Blue");
        p1.setTip(10);

        System.out.println(p1.color);
        System.out.println(p1.tip);


        System.out.println(p1.getColor());
        System.out.println(p1.getTip());




        //backAccount object
        BankAccount myAcc=new BankAccount();
        myAcc.username="ankit";
        myAcc.setPassword("Ankit@123");


    }
}






//create class bankaccount
class BankAccount{
    public String username;
    private String password;


    public void setPassword(String pwd){
        this.password=pwd;
    }

}










class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }


    String getColor(){
        return color;
    }


    int getTip(){
        return tip;
    }

    

}
*/


















/*
 Constructors->Constructor is a special method which is invked automatically at the 
 time of object  cration.

 ->properties of Constructors
 01.Constructors have the same name as calss or structure.
 02.Constructors don't have a return type.(Not even void)
 03.Constructors are only called  once,at object creation.
 04.Memory allocation happens when constructor is called.



 ->Type of constructor in java
 01.Non-parameterized 
 02.Parameterized
 03.Copy Constructor->java me khud se banani padti hai,c++ allready bna tha




 ->Destructors->java ke ander garbage collector hota hai jo memory
  variable array ho gye jiska koi kam nahi autometicaly java me delete ho 
  jate hai. esme destructors ka funtion nahi likhana padta hai

  ->jabki c++ me likhan padta tha
 */














/* 
 public class Opps08 {
    public static void main(String args[]){
    
    Student s1=new Student("ankit");
    System.out.println(s1.getName());



    

    }
}

//create class bankaccount
class Student{
    String name;
    int  rollNo;

    //Parameterized Constructor
    Student(String name){
    this.name=name;
    
    }

    String getName(){
        return name;
    }


    //Non-parameterized
    Student(){
    //System.out.println("this is Non-parameterized ");
    }

}
*/








/* 
//Copy Constructor
import java.util.*;

import javax.management.remote.SubjectDelegationPermission;
public class Opps08 {
    public static void main(String args[]){
    
    Student s1=new Student();
    s1.name="ankit";
    s1.rollNo=1234;
    s1.password="ankit@123";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=80;

    Student s2=new Student(s1);
    s2.password="xyz";
    s1.marks[2]=500;


     System.out.println(s2.name);

   for(int i=0;i<3;i++){
    System.out.println(s2.marks[i]);
   }
 }
}


class Student{
    String name;
    int  rollNo;
    String password;
    int marks[];


    //shallow copy constructor me change ho ja rha tha ouput agar ham dubara  marks update kathe the tab
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.rollNo=s1.rollNo;
    //     this.marks=s1.marks;
    // }


    //deep copy constructor
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.rollNo=s1.rollNo;
        for(int i=0;i<3;i++){
            this.marks[i]=s1.marks[i];
        }
    }

    //default constructor
    Student(){
        marks=new int[3];
        System.out.println("constructor called...");
    }

    //Constructor
    Student(String name){
    marks=new int[3];
    this.name=name;
        
    }

    Student(int rollNo){
    marks=new int[3];
    this.rollNo=rollNo;
        
    }

    String getName(){
        return name;
    }

}



*/




















//Inheritance topic

/*
 ->Types of inheritance in java
 ->there are four types in java
 01.single level inheritance
 ->example         Animal
                    |
                    derived class
 

 02.multilevel inheritance
 ->example         Animal
                    |
                    derived class
                    |
                    derived class


 03.hiertarchial Inheritance
   ->example       Animal
                   |   |
       derived class   derived class
                    


 04.Hybrid in heritance
 ->example       Animal
                   |   |
       derived class   derived class
                          |
                          derive class so on

*/



/* 
//Example of single level inheritance
public class Opps08 {
    public static void main(String args[]){
        Fish f1=new Fish();
        f1.breathe();;
        f1.eat();
        f1.Swim();
    
    
 }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("brathes");

    }
}


//derived class
//here extends->means Fish class Animal class ki sari properties le
//rahi hai
class Fish extends Animal{
    void Swim(){
        System.out.println("swims in water");
    }

}
*/








/* 
//02.multilevel inheritance example
public class Opps08 {
    public static void main(String args[]){
        Dog f1=new Dog();
        f1.breathe();;
        f1.eat();
        f1.Swim();
        f1.Barking();
    
    
 }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("brathes");

    }
}



class Mammal extends Animal{
    void Swim(){
        System.out.println("swims in water");
    }

}

class Dog extends Mammal{
    void Barking(){
        System.out.println("dog is barking");
    }
}
*/














/* 
//03.Hirachial inheritance example
public class Opps08 {
    public static void main(String args[]){
        Dog f1=new Dog();
        f1.breathe();;
        f1.eat();
        //f1.walking();
        f1.Barking();
    
    
 }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("brathes");

    }
}



class Mammal extends Animal{
    void Walk(){
        System.out.println("mammal is walking");
    }

}

class Dog extends Animal{
    void Barking(){
        System.out.println("dog is barking");
    }
}

*/

















/*

//04.Hybrid inheritance example
public class Opps08 {
    public static void main(String args[]){
        Tiger f1=new Tiger();
        f1.breathe();;
        f1.eat();
        f1.Walk();
        //f1.Barking();
        f1.Tiger();;
    
    
 }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("brathes");

    }
}



class Mammal extends Animal{
    void Walk(){
        System.out.println("mammal is walking");
    }

}


class Tiger extends Mammal{
    void Tiger(){
        System.out.println("tiger is king of forest");
    }
}

class Dog extends Animal{
    void Barking(){
        System.out.println("dog is barking");
    }
}

*/

 





/*
 04.Polymorphism->Poly means many and morphism means form(like diffrent constructor)
 ->Two type of polymorphism
 -01Compile Time polymorphism->(static poly..)(we can perform compile time polymorhpism in java by method overloading)
  .method overloding->multiple funciton with the same name but diffrent parametes
 -02Run Time Polymorphism->(dynamic poly..)(we can perform run time polymorhpism in java by method overriding)
  .method Overriding->parent and child classes both contain the same funciton with a diffrent defination.

*/




/* 
//Polymorphism
//01.compile time polymorphism
public class Opps08 {
    public static void main(String args[]){

        
    Calculator cal=new Calculator();
    System.out.println(cal.sum(1,2));
    System.out.println(cal.sum((float)1.5,(float)2.5));
    System.out.println(cal.sum(1,2,4));
    
 }
}


class Calculator{
    int sum(int a,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }
}


*/











/* 

//Polymorphism
//02.Run Time Polymorphism 
public class Opps08 {
    public static void main(String args[]){

        
    Deer d=new Deer();
    d.eat();

    
 }
}


class Animal{
   void eat(){
    System.out.println("eats anyting");
   }
}


class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}


*/










//---------------------------------------------------------
//Packages in  java

/* 
Packages->package is a group of similar types of classes,
intreface and sub-packages.

*/


/* 
//import java.util.* is type of packages
import java.util.*;
public class Opps08 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    System.out.println(a);

        
 }
}
*/








/*
03.Abtraction->Hiding all the unceccessary details and showing only 
 the imprtant part to the user.
 ->there are two type in java 
 ******
 -01.Abstract  Classes ->kise phi class ko abstrack banane ke
 liye uske  aage abstract class likh dete hai.
 
 ->like->abstract class{

 }

 ->properties of abstract
 01.Cannot create an instance or object of abstract class.
 02.Can have abstract/non0abstract method.
 03.Can have constructors.
 04.An abstract class must be declared with an abstract keyword.
 

 ******



 

 ******
 -02.Interfaces->Interface is a blue print of a class.
 ->use of Interfaces->
 --->multiple inheritance(5th)
 --->total abstraction(interfaces)


 ->properites of interfaces
  --->define interface like this-> Interface-implements and class-extends
  --->all method are public,abstract and without implementation
  --->used to achieve total abstraction
  --->Variables in the interface are final,puble and static.

 *******

*/












/* 
import java.util.*;
public class Opps08 {
    public static void main(String args[]){
    Horse h=new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);


    Chicken c=new Chicken();
    c.eat();
    c.walk();

    //Animal a=new  Animal();//abstract class ka oject nahi create hota hai
 }
}


abstract class Animal{
    String color;
    Animal(){
        color="brown";

    }




    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
    
}


class Horse extends Animal{

    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on  4 leg");
    }
}


class Chicken extends Animal{

    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walk on 2 leg");
    }

}

*/









/* 

import java.util.*;
public class Opps08 {
    public static void main(String args[]){
    Horse h=new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);


    Chicken c=new Chicken();
    c.eat();
    c.walk();

    Mustang m=new Mustang();
    //Animal->Horse->Mustang

 }
}


abstract class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor called");
    }

   void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
    
}


class Horse extends Animal{

    Horse(){
        System.out.println("horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on  4 leg");
    }
}


class Mustang{
    Mustang(){
        System.out.println("mustang constructor is called");
    }
}


class Chicken extends Animal{

    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walk on 2 leg");
    }

}

*/











/* 

//02.Interfaces in java
public class Opps08 {
    public static void main(String args[]){

        Queen q=new Queen();
        q.moves();
    

 }
}



interface ChessPlayer{
    void moves();
}


class Queen implements ChessPlayer{ //interface ke liye extends nahi implements likha jata hai
     public void moves(){ //public likhege taki default type ka na ho
        System.out.println("up ,down left,right,diagonalIinall 4 direction");
     }
}





class Rook implements ChessPlayer{ //interface ke liye extends nahi implements likha jata hai
     public void moves(){ //public likhege taki default type ka na ho
        System.out.println("up ,down left,right");
     }
}



class King implements ChessPlayer{ //interface ke liye extends nahi implements likha jata hai
     public void moves(){ //public likhege taki default type ka na ho
        System.out.println("up ,down left,right,diagonalb(by 1 step)");
     }
}

*/






//---------------------------------------------------------

/*
 The static variable is used to refer to the common property of all objects (that is not unique for each object), e.g.

 Static Keyword->static keyword in java is used to share the 
 same variable or method of a given class.

 ->kisko static bna sakte hai
 --->functions
 --->Blocks
 --->nested Classes
 */

 /* 

//example of static keyword
public class Opps08 {
    public static void main(String args[]){
     
    Student s1=new Student();
    s1.schoolName="JMV";
    
    Student s2=new Student();
    System.out.println(s2.schoolName);
 }
}




class Student{
    static int returnPercentage(int math,int phy,int chem){

        return (math+phy+chem)/3;

    }
    String  name;
    int rollNo;
    static String schoolName;

    void setName(String name){
        this.name=name;
    }

    String getName(){
        return name;

    }
}

*/












//Super Keyword in java.
/*
 super keyword->supe keyword is used to refer immediate parent class object.

 ->use of super keyword
 ---->to access parent's properties
 ---->to access parent's functions
 ---->to access parent's constructor
  


 */
 public class Opps08 {
    public static void main(String args[]){
     
    Horse h=new Horse();
    System.out.println(h.color);
 }
}


class Animal{
    String color;

    Animal(){
        System.out.println("animal construtor is called");
    }

}


class Horse extends Animal{

    Horse(){
        super.color="brown";
        //super();
        System.out.println("horse constructor is called");
    }
}






/* 
 What is this keyword in java?
 Ans:-The this keyword is a reference variable that refers to the current object.
*/