//01.bubble sort

// Worst and Average Case Time Complexity: O(n^2) ; Worst case occurs when the array is sorted in opposite direction

// Best Case Time Complexity: O(n) ; Best case occurs when the given array is already sorted

// Space Complexity: O(1)

// In-Place Sorting Algorithm: Yes

// Stable Sorting Algorithm: Yes


/* 
public class sorting07 {
    public static void main(String arge[]){
        

    
        //01.bubble sort

        int a[]={5,4,1,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }



        //print the array

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }





    }
}

*/







/*
     
Properties of Selection Sort

Time Complexity: O(n^2) ; There is no best or worst case time complexity for selection sort, because in any case it will search the minimum element linearly for all n-1 traversals.

Space Complexity: O(1)

In-Place Sorting Algorithm: Yes

Stable Sorting Algorithm: Depends on implementation

Advantages

The total number of swaps in the selection sort algorithm will never exceed O(n). Therefore it will be useful in the problems where we want to minimize the number of swaps while sorting.
It is an In-Place sorting algorithm that does not require any extra space. 
*/


/* 
//02.selection sort
public class sorting07 {
    public static void main(String arge[]){
        int a[]={5,4,1,3,2};


        for(int i=0;i<a.length-1;i++){
            int m=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[m]){
                    m=j;
                }
            }
            
            int t=a[m];
            a[m]=a[i];
            a[i]=t;
        }



        //print the array

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

}
}



//geekForgeeks



class Solution
{
	int  select(int arr[], int i)
	{
	    int m=i;
	    
	    for(int j=i+1;j<arr.length;j++){
	        if(arr[m]>arr[j]){
	            m=j;
	        }
	        
	    }
        return m;
	}
	
	void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n-1;i++){
	        int m=select(arr,i);
	        int t=arr[m];
	        arr[m]=arr[i];
	        arr[i]=t;
	        
	    }
	}
}

*/








/*

//03.insertion sort
//TC=worst and avg=O(n^2)  || best=O(n);
public class sorting07 {
    public static void main(String arge[]){
        int a[]={5,4,1,3,2};


        for(int i=1;i<a.length;i++){
            int curr=a[i];
            int pre=i-1;

            //finding out the correct pos to inset
            while(pre>=0 && a[pre]>curr){
                a[pre+1]=a[pre];
                pre--;
            }
            //insertion
            a[pre+1]=curr;      
        }



        //print the array

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

}
}

 */









/*

//inbuilt sort in java
//inbuilt ke leye ->import java.util.Arrays;  libreriy add karna padta hai
//or import java.util.*;

//import java.util.Arrays;
import java.util.*;
public class sorting07 {
    public static void main(String arge[]){
        int a[]={5,4,1,3,2};
        
        //sort function is->Arrays.sort(arr);
        //Tc=O(nLogn);

        // Arrays.sort(a);

        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }





        //kisi particular index ko sort kar sakte hai like 2-5 tak
        //Arrays.sort(arr,start index,end index);
           

        Arrays.sort(a,2,5);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        
}
}

*/
 









/*


//sortint decresing order me sort karne ke liye
//import java.util.Collections  package import karna padta hai



//import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class sorting07 {
    public static void main(String arge[]){
        Integer a[]={5,4,1,3,2}; //reverse order ke liye Integer lete hai warna red line aata hai
        
        //sort in reverseOrder
        //method->Arrays.sort(arr,Collections.reverseOrder());


        //particular index  ko reverse ke liye
        //method->Arrays.sort(arr,si,ei,Collections.reverseOrder());

        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        
}
}


 */









/*
//counting Sort->esko waha use kiya jata hai jha number  
//bade nahi hote hai like marks=1-100;

//import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class sorting07 {
    public static void main(String arge[]){
        int  a[]={5,4,1,3,2}; 

        //counting sort
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);

        }

        int count[]=new int[largest+1];
        for(int i=0;i<a.length;i++){
            count[a[i]]++;
        }


        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }


        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        
}
}

*/
















/* 
//mergeSort using divide and conquer approch:-
//TC=O(nlogn)(for  best and worst both)  ans SC=O(N);
import java.util.*;
public class sorting07 {

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }

        int mid=si+(ei-si)/2;
        mergeSort(a, si, mid);
        mergeSort(a, mid+1, ei);
        merge(a,si,mid,ei);

    }


    public static void merge(int a[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;    //itereator for left part
        int j=mid+1; //iterator for right part
        int k=0;     //iterator for temp arr
        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;k++;
            }
            else{
                temp[k]=a[j];
                j++;k++;
            }
        }

        while(i<=mid){
            temp[k++]=a[i++];
        }

        while(j<=ei){
            temp[k++]=a[j++];
        }

        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            a[i]=temp[k];
        }

    }


    public static void main(String arge[]){
        int a[]={6,3,9,5,2,8,-5};
        mergeSort(a, 0,a.length-1);
        printArr(a);
        
}
}
*/



















//Quick sort underStanding ans analyse time coplexity
//using Pivot and partion
//Tc=O(nlogn)(for best ans average case)
//Tc=O(n^2) ->for worst case
//Sc=O(1)
import java.util.*;
public class sorting07 {

    public static void printArr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }

        //last element
        int pIdx=partition(a,si,ei);
        quickSort(a, si, pIdx-1);   //left 
        quickSort(a, pIdx+1, ei);  //right
    }




    public static int partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1;   //to make place for ele smaller than pivot

        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){ 
                i++;
                //swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;

        return i;

    }


    public static void main(String arge[]){
        int a[]={6,3,9,5,2,8,-5};
        quickSort(a, 0,a.length-1);
        printArr(a);
        
}
}