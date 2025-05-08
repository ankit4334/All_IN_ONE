
/*
 
//HASHING IN JAVA->The hash function is a key-value mapping function. 
When two or more keys are mapped to the same value using these hashing 
methods, there exists duplicate values.;

->Types  of hashing
01.map ->
    01.hashmap 
     ->hash map me insert,search,and remove ki TC=O(1);
    02.linkedhash map-:
    ->keys are insertion ordered;


    03.Tree map


02. set ->
    01.hashmap set
    02.linkedhash set
    03.Tree set
*/


/*
//01.hashmap
import java.util.*;
public class first {
    public static void main(String arges[]){

        //create hash map
        //data store in hash map rendam
        //String and  Integer type.
        HashMap<String,Integer> hm=new HashMap<>();
       
        //hashmap operations
        hm.put("india",100);  //put use for insert the data
        hm.put("chaina",150);
        hm.put("us",50);

        System.out.println(hm);  //print the hashmap

        int population=hm.get("india"); //kesi specific key ke  value ko get kar sakte hai
        System.out.println(population);

        //kis invalid key ka value null return hota hai;
        System.out.println(hm.get("indonesia"));


        //contaisKey() ->O(l)->return true or false element  presant hai nahi; 
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("indonesia"));


        //remove()->delete the value of specific key
        System.out.println(hm.remove("chaina"));
        System.out.println(hm);

        //size()-> find the size of hashmap
        System.out.println(hm.size());



        //is empty()-> to cheak hash map is empty or not;
        System.out.println(hm.isEmpty());


         //clear()-> hash map ko khali karne  ke liye  kiya jata hai
         hm.clear();
        System.out.println(hm.isEmpty());

    }
}

*/








/*

//Iteration on HASHMAP->
import java.util.*;
public class first {
    public static void main(String arges[]){

    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("India",100);
    hm.put("Chaina",150);
    hm.put("US",50);
    hm.put("Indonesia",120);
    hm.put("Nepal",30);


    //Itetate karne ke liye set banana padta hai;
    Set<String> keys=hm.keySet();
    System.out.println(keys);

    //iterate using  foreach
    for(String k:keys){
        System.out.println("key="+k + ",value="+hm.get(k));
    }


    }
}

*/












/*

//Implementation HashMap->

import java.util.*;
public class first {

    static class HashMap<K,V>{ //k,v generic hai

    private class  Node{
            K key;
            V value;


         public Node(K key,V value){
            this.key=key;
            this.value=value;
        }
    }

    private int n; //n
    private int N;
    // private int arr[]; 
    //create linked list array;
    private LinkedList<Node> buckets[];  //N =buckests.length;

    @SuppressWarnings("unchecked")
    public HashMap(){
        
        this.N=4;
        this.buckets=new LinkedList[4];
        for(int i=0;i<4;i++){
            this.buckets[i]=new LinkedList<>();
        }

    }
    private int hashFunction(K  key){
       int hc=key.hashCode();  //hashcode->kise bhi value or key ke liye ek hashcode return kar ke de deta hai;
       return Math.abs(hc) % N; //abs()->mode jaisa kam karta hai value negative me nahi jata hai;
    }
    private int SearchInLL(K key,int bi){
        LinkedList<Node> ll=buckets[bi];
        int di=0;
        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(node.key==key){
                return di;

            }
            di++;
        }

        return -1;

    }
    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node> oldBuck[]=buckets;
        buckets=new LinkedList[N*2];
        N=2*N;
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new LinkedList<>();
        }

        //nodes -> add in bucket
        for(int i=0;i<oldBuck.length;i++){
            LinkedList<Node> ll=oldBuck[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.remove();
                put(node.key,node.value);
            }
        }
    }

    public void put(K key,V value){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);  //valid inde  or -1

        if(di!=-1){
            Node node=buckets[bi].get(di);
            node.value=value;
        }
        else{
            buckets[bi].add(new Node(key,value));
            n++;
        }
        double lambda=(double)n/N;
        if(lambda>2.0);
        rehash();
    }

    public boolean containsKey(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);  //valid inde  or -1

        if(di!=-1){
           return true;
        }
        else{
           return false;
        }
    }

    public V remove(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);  

        if(di!=-1){
            Node node=buckets[bi].remove(di);
            n--;
            return node.value;
        }
        else{
            return null;
        }
    }

    public V get(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi); 

        if(di!=-1){
            Node node=buckets[bi].get(di);
            return node.value;
        }
        else{
           return null;
        }
    }

    public ArrayList<K>  keySet(K key){
       ArrayList<K> keys=new ArrayList<>();
       for(int i=0;i<buckets.length;i++){
        LinkedList<Node> ll= buckets[i];
        for(Node node:ll){
            keys.add(node.key);
        }
       }
       return keys;

    }

    public boolean isEmpty(){
        return n==0;
    }

}
    public static void main(String arges[]){

    //Implementation-> put(),get(),containsKey(),remove(),size(); 

    HashMap<String,Integer> hm=new HashMap<>();
    hm.put("India",100);
    hm.put("Chaina",150);
    hm.put("US",50);
    hm.put("Indonesia",120);
    hm.put("Nepal",30);

//    ArrayList<String> keys =hm.keySet();
//     for(String key:keys){
//         System.out.println(key);
//     }

    System.out.println(hm.get("India"));

}

}
*/







/* 

//2.LinkedHashMap->keys are insertion ordered
import java.util.*;
public class first {
    public static void main(String arges[]){

    LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
    hm.put("India",100);
    hm.put("Chaina",150);
    hm.put("US",50);
    hm.put("Indonesia",120);
    hm.put("Nepal",30);

   System.out.println(hm);


    }
}

*/





/* 
//3.Tree Map-:key are sorted;
//put ,get remove are O(logn);
//Implement by red black tree;
//linkedHashmap implement by doubly linked list;
import java.util.*;
public class first {
    public static void main(String arges[]){

    TreeMap<String,Integer> tm=new TreeMap<>();
    tm.put("India",100);
    tm.put("Chaina",150);
    tm.put("US",50);
    tm.put("Indonesia",120);
    tm.put("Nepal",30);

   System.out.println(tm);


    }
}

*/






/* 
//Q-:majority Element
->Given an integer array of size n,find all element that appear more tha [n/3]times;
input-{1,3,2,5,1,3,1,5,1}
output-1

input-{1,2}
output-1,2
*/
/* 
import java.util.*;
public class first {
    public static void main(String arges[]){
    
    int arr[]={1,3,2,5,1,3,1,5,1};
    //int arr[]={1,2};

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<arr.length;i++){
        // if(map.containsKey(arr[i])){
        //     map.put(arr[i],map.get(arr[i])+1);

        // }
        // else{
        //     map.put(arr[i],1);
        // }

     //above or
     map.put(arr[i],map.getOrDefault(arr[i],0)+1);

    }
 
    

    // Set<Integer> keySet=map.keySet();
    // for(Integer key:keySet){
    //     if(map.get(key)>arr.length/3){
    //         System.out.println(key);
    //     }
    // }

    //above or
    for(Integer key:map.keySet()){
        if(map.get(key)>arr.length/3){
            System.out.println(key);
        }
    }

   


    }
}


*/




/*
Question:-Valid Anagram
->Given two string s and t, return true if t is an anagram of s,and false otherwise;

Anagram:-An anagram is a word or phrase formed by rearranging the  letter of a different word or phrase, typically using all the original letters exactly once.
*/
/* 
import java.util.*;
public class first {

    public static boolean isAnangram(String s,String t){


        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }

        }

        return map.isEmpty();
    }
    public static void main(String arges[]){

        String s="race";
        String t="care";
        System.out.println(isAnangram(s, t));

    }
}

*/
