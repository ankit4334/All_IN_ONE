/* 
Malloc :- It is used to allocate single block of requested memory
calloc:- It is used to allocate multiple block pf requested memory
realloc:- It is used to reallocate the memory occupied by malloc or calloc functions
free:- It is use to free the dynamically allocated memory

malloc:-It is allocated the memory in heap area of specified size and return a pointer of type void 
syntax:- ptr=(data type*)malloc(size_in_bytes_required)
	int p=(int)malloc(sizeof(int));


Calloc:- Stand for contiguous allocation It is allocated the memory in heap area of specified size and return a pointer of type void
syntax:= ptr(data type*)calloc(n,element_size);
	int p=(int)calloc(10,sizeof(int));


OOps:-   object oriented programming is use to implements real world entities like inheritance , hiding , polymorphism e.t.c in programming

class:-class is a user define data type, which hold its own data member, member function, which can be accessed and used by creating an instance of a class. A class is like a blueprint of an object.


object:- An object is an instance of a class When we create a class no memory are allocated but when we create a object the memory are allocated.

Access modifier:- Access modifier is use to access the data in side of class or outside of class that is depends on assess modifier.
	Three type of access modifier 
		1)public
		2)protected
		3)private
		4)Default
1)public:- This public  access modifier is use to directly access the variable or functions in any ware of program use (.) operator if we declare any data or methods inside the public modifier.

2)protected:-The class member declare as a protected can be accessed by any subclass(derived class) of that class;

3)public:-The member function declare as a private can be access only in same class not access outside of a class .

4) Default:- The member function declare as a default can be asses with in a package not outside of package.

friend Function:-- A friend class can access private and protected member of other class in which it is declare as a friend.

constructors:- Constructors in c++ is a special type of method that is invoked automatically at the time of objection creation. The constructor in c++ has same name as class name.

Characteristics of constructor:-
1). The name of constructor has same as class name
2). A constructor can not declare virtual
3). Constructor can be overloaded
4). A constructor can not be inherited
5). Constructor have no return type;

There are four types of constructor 
1).Default constructor
2).Parameterized constructor
3).Copy constructor
4).Move constructor


1)Default constructor:-- The default constructor that don't take any argument. it has no parameters.it is also called zero argument constructor
Example:- className(){
}

parameterized Constructor:--The parameterized constructor that do take arguments, these arguments help initialize an object when it is created;
example:- className(parameters){
}

Copy Constructor:- A copy constructor is a member function that initializes an object using another object in same class 

Destructor:-- Destructor is an instance member function that is invoked automatically whenever object is going to be destroyed.
1.It is not possible to define more then one destructor
2.Destructor has same name as class preceded by tilled(~) operator
3.Destructor neither require any argument not return value
4.It is automatically call when object out of scope


Shallow Copy:-- 
1) It is faster
2) It store the reference of the object to the original memory address
3) It reflect changes made in copy object to original object
4) Both copy and original object point to the same memory allocation 

Deep Copy:-
1) It is slow as compare then shallow copy
2) It store the copy of object value
3) It does not reflect any changes to the copy object
4) Both copy and original object are point to different, different memory allocation 


Static data member:--
1. It is initialized to zero whenever the first object of its class is created.
2. only one copy of static data member is created and shared by all which means when we create more then one object then static data member are not create more then one static member is create one time and share our value with all the object.

3. it is use in all over the program.

Static member function:-
1. A static method is independent of any object of a class
2. A static method can be accessed without object are exist of those class
3. A static method can be accessed using class name through dot operator with method name.
4. A static method can be accessed inside a class or outside of class

This keyword:-
1. This keyword can be used to refer current class instance variables 
2. This keyword can be used to invoke current class method 
3. This keyword is used to invoke current class constructors 
4. This keyword can be used to return current class instance  from method

Runtime polymorphism and compile time polymorphism 


what is inheritance:-
Inheritance is a main pillars of oops. it is use to inherit all the property or feature of parents class to child class so that functionality of child class increases.
there are four type of inheritance 
1)Single level 2) multi level 3)Hierarchical Inheritance 4)Hybrid Inheritance (with Interfaces)

what is abstraction :- 
Abstraction are binding the data in multiple unit it is use for details hiding and it is solve the problem in design level.it is focus on what the object does instead of how does it.

what is encapsulation:-
Encapsulation is binding the data in single unit and it is use for data hiding and it solve the problem at implementation level. it is focus on object how an object does something.


Runtime :- 
1. It is also know as dynamic binding, late binding, overriding 
2. It is faster then compile time polymorphism 
3. Runtime polymorphism is flexible as all things execute in runtime 
4. Runtime polymorphism having same method name with same parameters and signature as well as same return time but association with different class.

Compile time :- 
1. It is also know as early binding, static binding and methods overloading 
2. It excitation are slow 
3. It is less flexible compare to runtime. As all things execute in compile time 
4. Compile time polymorphism share same name with different parameters and signature or different return type


what is Exception?
:- when it is happen then disturb the normal execution of program after exception.

difference between exception and error?
     exception                                    |                                                  error
1. possible to recover from exception             | 1. impossible to recover from error
2. It is cause by application  Itself             | 2. It is cause by the application runtime environment 
3. It can occur at compile time and runtime       | 3. It can only occur at runtime.
4. Exception can be either checked or unchecked   | 4. Error are of type unchecked


Type of Exception?
: There are two type of exception
	1. Unchecked
	2. Checked
checked Exception :---
	1. It is occur at compile time 
	2. Ex:- file not found exception, Sql exception, IO exception, Class not found Exception 

Unchecked Exception :--
	1. It is occur at runtime 
	2. Ex:- Array out of bound Exception, Arithmetic Exception, Divide by Zero exception, null pointer exception  

Notes:--[[try->catch->catch], [try->catch->finally], [try->finally], [try->inside [try->catch], [try->catch]catch->finally]]
** after java 7 introduce multi-catch block in their we can handle multiple exception in one catch block but not use parent exception class only use subclass of Exception 
Ex:- try{
		system.out.print(4/0);
		int a={1,3}
		system.out.print(a[3]);
	}catch(NullpointerException | ArrayIndexoutofboundException e){
		System.out.print(e)
	}
	we can not decleare like this 
	try{
		system.out.print(4/0);
		int a={1,3}
		system.out.print(a[3]);
	}catch(Exception | ArrayIndexoutofboundException e){
		System.out.print(e)
	}
	because Exception class are parent class we we want to handle all the exception then only declare Exception class no need to declare subclass Exception but if you declare subclass then no need to declare parent class.

***After java 7introduce try with resource
	in here programmer not need to declare finally block because finally (are use to closing and releasing the memory) inside the bracket () write the code for which an object is created.

***After the java 9 inside the try with resource we can write the created object and object creation done in globally.


try:- It is a keyword. It is use to declare sensitive code which may be throw exception 
catch:- It is a keyword.it is use to catch the exception which are throw by try block for one try block we can write one and more catch block.
finally:- It is a keyword. it is use to closing and releasing the memory.

throw														
1.java throw keyword is used to explicitly throw an exception		 
2.Checked Exception can not propagated using throw exception		 
3.Throw exception follow by instance					 
4.Throw is use within the method					 
5.programmer can not throw multiple exception.				 


throws
1. java throws keyword is use to declare an exception
2.checked Exception can be propagated using throw exception
3. Throws exception follow by class.
4. Throws is use with method signature
5. programmer throw multiple exception.


what is the advantages of exception handling:---
	1. Exception handling improve performance.
	2.it is use to maintain the flow of normal exception 
	3.Exception handling separates the error-handling code from normal code for easy understanding


what is spring?:--- spring is a dependency injection framework to make java application loosely coupled.
what is inversion of control (IOC):- when a class is dependent of another class that are declare inside of main class and main class are dependent on these class. when we use core java then create a object using new keyword and that is a tight couples. with the help of IOC spring create an object in dynamic at runtime that is called IOC.

what is spring boot?
:- Spring boot is a module of spring It is used to speedup the development.
Spring boot makes it is easy to create stand alone production-grade spring based applications that you can just run
it provide an easier and faster way to setup, configuration, and run both simple and web based applications
it provide convention over configuration software design style.
Advantage of spring boot:-
	1. Automatically configure third party library whenever possible
	2. It is provided embedded server such as tomcat and jetty which allows developer to test and run without having to setup a separate server.
	3. Spring boot rage with other framework and library.
	4. spring boot provided many features that are ready for production use, such as security, health check.

POM:-project object model




-----------------------------------------------------------------------react--------------------------------------------------------------------
react is open source javascript library developed by facebook that is use to build user interface components.

Why do you need react ?
:- react are basically use for declarative programming, component architecture and single page application

What is imperative programming:- you will tell computer how to do something and as a result what you want to happen will happen 

What is declarative programming:- telling the machine what you would like to happen and letting the machine figure out how to do it

what is Dom:--
Dom is Stand for document object models. it is a language natural interface that allows to program and script to dynamic access and update the content, structure and style of a document


what is virtual dom:- A virtual dom is a copy of dom and it is use to minimize the direct manipulation or updation of real dom in real world when we create a project and changes or update the ui pages in continues time then virtual dom changes in own dom and reflect in ui pages and after the final or limited time changes in real dom.

what is components:- A components is a peace of code that are reuse or join with other function to increase the property of those function.

types of components:- there are two types of components 1) class components   2) functional components

class components                                                                                             
1. In class components 	we have function name render that is 	 
use to return the react element					
								
2. In class components we are use props and set the state 								
								
3. It is  called stateful components.				 
							


functional components							
	
1. In functional components we have no render function to return element.
 2. Functional components only accept the props as an argument.
3. It is also called stateless components

what is props in react:-
Props is a special keyword in React that stands for properties and is used for passing data from one component to another.

what is state in react?
State is a built-in react object that is used to  store data or information of components. A components state we can change over time. whenever its changes . the components re render in simple meaning state are use for changes the value of object in react when ever any event are handle or changes the value of any object then we can use State and changes are show whenever component are re-render.

what is hooks?
hooks is a function that let you hook into react state and lifecycle features from functional components

why we can use hooks?
Hooks are use for all the features of class components are use in functional components like State, life cycle and  pure components e.t.c

what is UseState?
we use useState for managing the state of  components .the benefits of using useState is whenever state will be updated. react will be re-render the components without reload the page.

what is useEffect?
useEffect is a most important hooks in react.it is way to handle life cycle of the components in which it is present. useEffect allows to perform side effect function in components . it takes two arguments first is a function and second is a dependency and dependency is a optional .

What is useMemo ?
UseMemo is used to memoize the expensive computations or when developer give big calculation then useMemo store the value in cache and when developer wants same calculation then memo simply fetch the value from chache and return them

Why use React Memo?
useMemo offers servel benifits like memorization, proformance optimization, overhead, easy to integration, improve rendering efficiency

what is useContext?
useContex is part of react hooks api. it allows  component to consume state and context without need for prop drilling. which can lead to cleaned and more maintainable code

*/