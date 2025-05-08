//Hash_map_set;


/* 
->1.HashSet->store data  in unorder manner;
//Iteration on HashSet
a.using iterators 

b.using Enhanced for loop


import java.util.*;
public class second {
   
    public static void main(String arges[]){

       HashSet<String> cities=new HashSet<>();
       cities.add("delhi");
       cities.add("Mumbai");
       cities.add("kolkata");
       cities.add("Noida");

       Iterator it=cities.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }

       System.out.println();
       //or Enhacance for loop
       for(String city:cities){
        System.out.println(city);
       }

    }
}
*/







/*

//2.Linked HashSet->Ordered printing using double linked list;
import java.util.*;
public class second {
   
    public static void main(String arges[]){

       HashSet<String> cities=new HashSet<>();
       cities.add("delhi");
       cities.add("Mumbai");
       cities.add("kolkata");
       cities.add("Noida");
       System.out.println(cities);

       
       LinkedHashSet<String> lhs=new LinkedHashSet<>();
       lhs.add("delhi");
       lhs.add("Mumbai");
       lhs.add("kolkata");
       lhs.add("Noida");
       System.out.println(lhs);


    }
}

 */









/* 
//3.TreeSet->sorted in ascending order
//NULL values are Not allowed
//implemention using red black tree;
//Tc->insert,remove,etc=O(logn);
import java.util.*;
public class second {
   
    public static void main(String arges[]){
       //hashset      
       HashSet<String> cities=new HashSet<>();
       cities.add("delhi");
       cities.add("Mumbai");
       cities.add("kolkata");
       cities.add("Noida");
       System.out.println(cities);

       //linkedhashset
       LinkedHashSet<String> lhs=new LinkedHashSet<>();
       lhs.add("delhi");
       lhs.add("Mumbai");
       lhs.add("kolkata");
       lhs.add("Noida");
       System.out.println(lhs);



       //treeset
       TreeSet<String> ts=new TreeSet<>();
       ts.add("delhi");
       ts.add("Mumbai");
       ts.add("kolkata");
       ts.add("Noida");
       System.out.println(ts);  


    }
}

*/








/*
//Q.1->Count distinct(unique) Elements
//input->num={4,3,2,5,6,7,3,4,2,1};
//output->7

import java.util.*;
public class second {
   
    public static void main(String arges[]){
       int num[]={4,3,2,5,6,7,3,4,2,1};  
       HashSet<Integer> s=new HashSet<>();
       for(int i=0;i<num.length;i++){
        s.add(num[i]);
       }

       System.out.println("Size of array is:"+s.size());

       
       
    }
}
*/






/* 
//Q.2->Union and intersection of 2 arrays;
//input->arr1={7,3,9} && arr2={6,3,9,2,9,4};
//output union->6(7,3,9,6,2,4) && intersection=2(3,9)

import java.util.*; 
public class second {
   
    public static void main(String arges[]){
       int arr1[]={7,3,9};
       int arr2[]={6,3,9,2,9,4};

       HashSet<Integer> s=new HashSet<>();
       for(int i=0;i<arr1.length;i++){
        s.add(arr1[i]);
       }

       //union
       for(int i=0;i<arr2.length;i++){
        s.add(arr2[i]);
       }
        
       for(Integer i:s){
        System.out.print(i+" ");
       }
       System.out.println("Size of array is:"+s.size());



       //intersection
       s.clear();
       for(int i=0;i<arr1.length;i++){
        s.add(arr1[i]);
       }
       
       int count=0;
       for(int i=0;i<arr2.length;i++){
        if(s.contains(arr2[i])){
            count++;
            s.remove(arr2[i]);
        }
       }

       System.out.println("interseciton = "+count);


       
       
    }
}

*/







/*

//Q.3->find itinerary(journey) from tickets
//input->chennai->bengaluru  mumbai->delhi  goa->chennai  delhi->goa;
//output->Mumbai->delhi->goa->chennai->benaglure;

import java.util.*; 
public class second {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();

        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;  //starting point 
            }
        }

        return null;
    }
   
    public static void main(String arges[]){
       HashMap<String,String> tickets=new HashMap<>();
       tickets.put("Chennai","Bengaluru");
       tickets.put("Mumbai","Delhi");
       tickets.put("Goa","Chennai");
       tickets.put("Delhi","Goa");

       String start=getStart(tickets);
       System.out.print(start);
       for(String key:tickets.keySet()){
        System.out.print(" -> "+ tickets.get(start));
        start=tickets.get(start);
       }

       System.out.println();

    }
}


*/








/* 

//Q.4->Largest subarray with 0 sum
//input->arr[]={15,-2,2,-8,1,7,10,23};
//output->5

import java.util.*; 
public class second {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap=new HashMap<>();

        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }

        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;  //starting point 
            }
        }

        return null;
    }
   
    public static void main(String arges[]){
    
       int arr[]={15,-2,2,-8,1,7,10,23};
       HashMap<Integer,Integer> map=new HashMap<>();  

       int sum=0;
       int len=0;
       for(int j=0;j<arr.length;j++){
        sum+=arr[j];
        if(map.containsKey(sum)){
            len=Math.max(len,j-map.get(sum));
        }
        else{
            map.put(sum,j);
        }
       }

       System.out.println("lergest subarray with sum as 0 =>"+len); 
       

    }
}
*/







//Q.5->Subarray sum equal to K
//input->arr[]={1,2,3};  k=3;
//output->2 (1,2)(3)

import java.util.*; 
public class second {
    public static void main(String arges[]){
    
       int arr[]={1,2,3};  
       int k=3;
       HashMap<Integer,Integer> map=new HashMap<>();  

       map.put(0,1);
       int sum=0;
       int ans=0;
       for(int j=0;j<arr.length;j++){
        sum+=arr[j];
        if(map.containsKey(sum-k)){
            ans+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum, 0)+1);
       }

       System.out.println(ans);
         
    }
}
