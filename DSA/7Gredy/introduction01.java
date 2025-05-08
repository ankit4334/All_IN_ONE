/*
 Introduction to Greedy->greedy algorithms is the problem solving technique where we make the locally optimum choice at each stage and hope the achieve a global  optimum.
 ->optimization->min,max
 ->find using sorting
 ->no fixed rule like mergesort,quick sort
 ->not realive

 ->pros                      cons
 1.simple and easy           A lot of time,global
 2.good enough tc            Optimum is not achieved


*/



/*
Question01.You are given n activities with their start and end times. slelect the maximum number of activities that
can be performed by a single person,assuming that a person can only work on a single activity at a time. Activites are sorted 
according to end time.


start=[10,12,20]
end=[20,25,30]

ans=2(AO & A2)


->approch:-
1.end time basic sort
2.non-overlapping (disjoint)
 start time>=last chossen time
 
*/


/*
//if end array is sorted
import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    
    //end time basis sorted

    int maxAct=0;

    ArrayList<Integer> ans=new ArrayList<>();

    //1st activity
    maxAct=1;
    ans.add(0);
    

    int lastEnd=end[0];
    for(int i=1;i<end.length;i++){
        if(start[i]>=lastEnd){
            maxAct++;
            ans.add(i);
            lastEnd=end[i];
        }
    }
     
    System.out.println("max activities = " + maxAct);
    for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i)+" ");
    }
    System.out.println();
    
    }
}
*/







/* 
//02.if end is not sorted then 
import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};
    //sorting
    int activities[][]=new int[start.length][3];
    for(int i=0;i<start.length;i++){
        activities[i][0]=i;
        activities[i][1]=start[i];
        activities[i][2]=end[i];
    }

    //lambda function -> shortform
    Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));  //sort the end array using this function


    //end time basis sorted

    int maxAct=0;

    ArrayList<Integer> ans=new ArrayList<>();

    //1st activity
    maxAct=1;
    ans.add(activities[0][0]);
    

    int lastEnd=activities[0][2];
    for(int i=1;i<end.length;i++){
        if(activities[i][1]>=lastEnd){
            maxAct++;
            ans.add(activities[i][0]);
            lastEnd=activities[i][2];
        }
    }
     
    System.out.println("max activities = " + maxAct);
    for(int i=0;i<ans.size();i++){
        System.out.println("A"+ans.get(i)+" ");
    }
    System.out.println();
    
    }
}
*/




//Fractional Knapsack
/*
 Given the weights ans value of N item,put these item in a knapsack of 
 capcity W to get the maximum total value int the knapsack.
 value=[60,100,120]
 weight=[10,20,30]
 w=50
  let ratio of(v/w)=[6,5,4]  after that sort ratio above method 
 ans=240



import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    int val[]={60,100,120};
    int weight[]={10,20,30};
    int W=50;
    //sorting
    double ratio[][]=new double[val.length][2];
    //0th col=>indx; 1st col=>ratio
    for(int i=0;i<val.length;i++){
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
    }

    //lambda function -> shortform
    Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));  //sort the end array using this function

    int capcity=W;
    int finalVal=0;
    for(int i=ratio.length-1;i>=0;i--){
        int idx=(int)ratio[i][0];
        if(capcity>=weight[idx]){  //include full item
            finalVal+=val[idx];
            capcity-=weight[idx];
        }
        else{
            //include fractional item
            finalVal+=(ratio[i][1]*capcity);
            capcity=0;
            break;
        }
    }

    System.out.println("final value = "+finalVal);
    



    }
}


*/









/*
//Min Absoulute Diffrence Pairs
Given two arrays A and B of equal length n. pair each element of array
A to an element in array B, such that sum S of absolute differences of
all the pairs is minimum .

A=[1,2,3];
B=[2,1,3];

ans=0;
 



import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    int A[]={1,2,3};
    int B[]={2,1,3};
    Arrays.sort(A);
    Arrays.sort(B);

    int minDiff=0;
    for(int i=0;i<A.length;i++){ //both length are same
        minDiff+=Math.abs(A[i]-B[i]);

    }
    System.out.println("min absolute diff = "+minDiff);
    }
}

*/















/*
->Max length chain of pairs 
You are given n pairs of numbers.in every pair the first number is always 
smaller thean the second number. A pair(c,d) can come after pair(a,b) if 
b<c.Find the longest chain which can be formed from a given set of pairs.

pairs=
(5,24)
(39,60)
(5,28)
(27,40)   
(50,90)

ans=3

 



import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
    Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

    int chaiLen=1;
    int chainEnd=pairs[0][1]; //last selected pair end //chair end

    for(int i=1;i<pairs.length;i++){
        if(pairs[i][0]>chainEnd){
            chaiLen++;
            chainEnd=pairs[i][1];
        }
    }

    System.out.println("max length of chain = "+ chaiLen);

    }
}



*/


















/*
Indian Coins ->
we are given an infinite supply of denominatios [1,2,5,10,20,50,100,500,2000].
find min no. of coins/notes to make change for a value V.

V=121;
ans=3(100+20+1);

v=590
ans=4(500+50+20+20)





import java.util.*;
public class introduction01 {
    public static void main(String[] args) {

    Integer coin[] ={1,2,5,10,20,50,100,500,2000};
    int amt=590;
    int n=coin.length;
    Arrays.sort(coin,Comparator.reverseOrder());

    //use in desending order
    ArrayList<Integer> ans=new ArrayList<>();
    int c=0;
    for(int i=0;i<n;i++){
        if(coin[i]<=amt){
            while(coin[i]<=amt){
                c++;
                ans.add(coin[i]);
                amt-=coin[i];
            }
        }
    }

    System.out.println("no of minimum coin require = "+ c);

    for(int i=0;i<ans.size();i++){
        System.out.println(ans.get(i)+" ");
    }
    System.out.println();
    
    }
}


*/




















/*

Question:-Given an array of jobs where  every job has a deadline and profit if the job
is finished before the deadline. It is also given that evey job takes a single  unit  of time, so the minumum
possible deadline for  any job is 1. Maximize the total profit if only one job can be 
scheduled  at a time.


job A=4,20
job B=1,10
job C=1,40
job D=1,30


ans=C,A

summrize:-
time=1,profit=40 c after that we can't b,d becouse time one unit is the ended.
so,now we can jon A.

max profit=40+20=60 would be answer.


approach->
1.sort the job (based on the profit)







import java.util.*;
public class introduction01 {
    static class Job{
        int deadline;
        int profit;
        int id;


        public Job(int i,int d,int p){
           id=i;
           deadline=d;
           profit=p;
        }


    }

    

    public static void main(String[] args) {

        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs=new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        //soting of an object

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        //descending order of profit

        ArrayList<Integer> seq=new ArrayList<>();

        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
            
        }


        //print seq

        System.out.println("max jobs = " + seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }
        System.out.println();
    }
}





*/




















/*
 

Question->CHOCOLA - Chocolate
We are given a bar of chocolate composed of m*n square pieces. One should break the chocolate into single squares. Parts of the chocolate may be broken along the vertical and horizontal lines as indicated by the broken lines in the picture.
A single break of a part of the chocolate along a chosen vertical or horizontal line divides that part into two smaller ones. Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on 
the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines with x1, x2, ..., xm-1 and along horizontal lines with y1, y2, ..., yn-1.
The cost of breaking the whole bar into single squares is the sum of the successive breaks. One should compute the minimal cost of breaking the whole chocolate into single squares.


For example, if we break the chocolate presented in the picture first along the horizontal lines, and next each obtained part along vertical lines then the cost of that breaking will be y1+y2+y3+4*(x1+x2+x3+x4+x5).

Task
Write a program that for each test case:

Reads the numbers x1, x2, ..., xm-1 and y1, y2, ..., yn-1
Computes the minimal cost of breaking the whole chocolate into single squares, writes the result.
Input
One integer in the first line, stating the number of test cases, followed by a blank line. There will be not more than 20 tests.

For each test case, at the first line there are two positive integers m and n separated by a single space, 2 <= m,n <= 1000. In the successive m-1 lines there are numbers x1, x2, ..., xm-1, 
one per line, 1 <= xi <= 1000. In the successive n-1 lines there are numbers y1, y2, ..., yn-1, one per line, 1 <= yi <= 1000.

The test cases will be separated by a single blank line.

Output
For each test case : write one integer - the minimal cost of breaking the whole chocolate into single squares.

Example
Input:
1

6 4
2
1
3
1
4
4
1
2

Output:
42


*/






import java.util.*;
public class introduction01 {
    public static void main(String[] args) {
    
    int n=4;
    int m=6;
    Integer costVer[] ={2,1,3,1,4};  //m-1
    Integer costHor[] ={4,1,2};  //n-1

    //reverse in decending order
    Arrays.sort(costVer,Collections.reverseOrder());
    Arrays.sort(costHor,Collections.reverseOrder());


    int h=0,v=0;
    int hp=1,vp=1;
    int cost=0;

    while(h<costHor.length && v<=costVer.length){
        if(costVer[v]<=costHor[h]){
            cost+=(costVer[v]*vp);
            hp++;
            h++;
        }
        else{
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }
    }

    while(h<costHor.length) {
        cost+=(costVer[v]*vp);
        hp++;
        h++;
    }


    while(v<costVer.length) {
        cost+=(costVer[v]*hp);
        vp++;
        v++;
    }

    System.out.println("min cost of cuts = "+ cost);
    
    }
} 