/*
 Defination of ArrayList:-
 Java ArrayList class uses a dynamic array for storing the elements. 
 It is like an array, but there is no size limit. We can add or remove 
 elements anytime. So, it is much more flexible than the traditional array. 
 It is found in the java.util package. It is like the Vector in C++.

 ArrayList->java ke ander inbuilt data structure hota hai;
 ->It is a linear structure.

 ->diffrence bet^n Array and ArrayList

 Array                          ArrayList
 1.fixed size                   1.dynamic size
 2.primitive data               2.primitive data 
 type can be stored              type can't be stored directly


*/




/*

//import karna hoge arraylist ko 
import java.util.ArrayList;
//or 
import java.util.*;  //means import all things
public class ArrayList01 {
    public static void main(String args[]){

        
        //for String | Boolean | Float type class;

        //Creating Integer type arraylist in java
        ArrayList<Integer> list=new ArrayList<>();



        //Creating String type arraylist in java
        ArrayList<String> s=new ArrayList<>();



        //Creating Boolean type arraylist in java
        ArrayList<Boolean> b=new ArrayList<>();

    }
    
}
*/












/*

import java.util.*;  //means import all things
public class ArrayList01 {
    public static void main(String args[]){

        // //Operations of array list
        // 
        //  1.Add Element     O(1)
        //  2.Get Element     O(1)
        //  3.Remove Element  O(n)
        //  4.SetElelment at index    O(n)
        //  5.Contains Element         O(n)
        // 
       




     //add opration of array list

     ArrayList<Integer> list=new ArrayList<>();

     list.add(1);
     list.add(3);  //O(1)
     list.add(9);
     list.add(5);

     //printing the arraylist
     System.out.println(list);

     list.add(4,30); 
     //index 4 per value 10 ko add kar rhe hai


     //Get opetation->ke help se kise specific index ko print kra sakte hai

     int element=list.get(3);
     System.out.println(element);


     



     //Remove->ke help se kise specific index ko delete kiya jata hai;
     list.remove(2);
     System.out.println(list);




     //set->ke help se kise index per value replce kiya jata hai
      list.set(1,10);
      System.out.println(list);





      //Contains->se pta chalta hai ki element presant hai or nahi 
      System.out.println(list.contains(10));
      //It means hamare arraylist ke ander 10 presant hai or nahi and return boolean vlu.





    }
    
}

 */
















/* 
import java.util.*;  //means import all things
public class ArrayList01 {
    public static void main(String args[]){
    

    //.size()->give the size of array list
    
     ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(3);  //O(1)
     list.add(9);
     list.add(5);
     System.out.println("size of list:"+list.size());


     //get()->get use print the array list
     for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
     }
     

    }
}

*/
















/* 
//print reverse of arraylist
import java.util.*;  
public class ArrayList01 {
    public static void main(String args[]){
    
    ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(3);  
     list.add(9);
     list.add(5);
     
     //Reverse print
     for(int i=list.size()-1;i>=0;i--){
        System.out.println(list.get(i)+" ");
     }
     


     //max element in arraylist
     int max=Integer.MIN_VALUE;
     for(int i=0;i<list.size();i++){
        if(max<list.get(i)){
            max=list.get(i);
        }

     }

     System.out.println("max element is:"+max);

    }
}
*/













/*

//Swap 2 numbers
import java.util.*;  
public class ArrayList01 {


    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }


    public static void main(String args[]){
    
     ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(3);  
     list.add(9);
     list.add(5);
     
     //index 1 and 3 ko swap karan hai
      int idx1=1,idx2=3;
      //before swaping
      System.out.println(list);


      //after swaping
      swap(list,idx1,idx2);
      System.out.println(list);

    }
}
*/











//sorting in ArrayList
/*
 ->collections->is a class 
 ->collection-> is interface

 ->here we sort using collections.
 */

 /*
 //import libray for collections
 //import jaa.util.collections;
import java.util.*;  
public class ArrayList01 {

    public static void main(String args[]){
    
     ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(3);  
     list.add(9);
     list.add(5);
     

     //it simply reverse in  ascending order
     Collections.sort(list);
     System.out.println(list);

     //for descending order
     Collections.sort(list,Collections.reverseOrder());
     System.out.println(list);

    }
}

*/













/*
 //Multi-dimenstional ArrayList
import java.util.*;  
public class ArrayList01 {

    public static void main(String args[]){
    
     ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();


     ArrayList<Integer> list=new ArrayList<>();
     list.add(1);
     list.add(3);  
     list.add(9);
     list.add(5);

     mainList.add(list);
   
     

     ArrayList<Integer> list2=new ArrayList<>();
     list2.add(5);
     list2.add(11);  
     list2.add(2);
     list2.add(17);

     mainList.add(list2);


     

     //print the multi-dimensional list
     for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();

     }

    }
}

 */














 //store the  list
 //list1->1 2 3 4 5
 //list2->2 4 6 8 10
 //list3->3 6 9 12 15

/* 
 import java.util.*;  
public class ArrayList01 {

    public static void main(String args[]){
    
     ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

     ArrayList<Integer> list1=new ArrayList<>();
     ArrayList<Integer> list2=new ArrayList<>();
     ArrayList<Integer> list3=new ArrayList<>();


     for(int i=1;i<=5;i++){
        list1.add(i*1);   
        list2.add(i*2);
        list3.add(i*3);
     }


     mainList.add(list1);
     mainList.add(list2);
     mainList.add(list3);

     //printing arraylist 
     System.out.println(mainList);

     //pringting arraylist using nested loop
     for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
     }
     

    }
}  
*/











/* 


//problem->Containser with Most Water
//intput->height=[1,8,6,2,5,4,8,3,7];
//output->49
import java.util.*;  
public class ArrayList01 {
    //brute force method->Tc=O(n^2)
    // public static int stoerWater(ArrayList<Integer> height){
    //     int maxWater=0;

    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht=Math.min(height.get(i),height.get(j));
    //             int wt=j-i;
    //             int currWater=ht*wt;
    //             maxWater=Math.max(maxWater,currWater);

    //         }
    //     }


    //     return maxWater;

    // }







    //optimise solution Tc=O(n);
    public static int stoerWater(ArrayList<Integer> height){
        int maxWater=0;

        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wt=rp-lp;
            int currWater=ht*wt;
            maxWater=Math.max(maxWater,currWater);

            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;

            }
            else{
                rp--;
            }
           
        }


        return maxWater;

    }



    public static void main(String args[]){
    
    ArrayList<Integer> height=new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);

    System.out.println(stoerWater(height));
    
   
    }
}  

*/














//Pair Sum->find if any pair in  sorted Arraylist has a target sum;
//input->list=[1,2,3,4,5,6], target=5;
//output->

import java.util.*;  
public class ArrayList01 {

    public static void main(String args[]){
    
     ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();

     ArrayList<Integer> list1=new ArrayList<>();
     ArrayList<Integer> list2=new ArrayList<>();
     ArrayList<Integer> list3=new ArrayList<>();


     for(int i=1;i<=5;i++){
        list1.add(i*1);   
        list2.add(i*2);
        list3.add(i*3);
     }


     mainList.add(list1);
     mainList.add(list2);
     mainList.add(list3);

     //printing arraylist 
     System.out.println(mainList);

     //pringting arraylist using nested loop
     for(int i=0;i<mainList.size();i++){
        ArrayList<Integer> currList=mainList.get(i);
        for(int j=0;j<currList.size();j++){
            System.out.print(currList.get(j)+" ");
        }
        System.out.println();
     }
     

    }
}  