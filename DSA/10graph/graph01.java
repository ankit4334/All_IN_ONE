/*
Graph:-newtwork of node.

Graph:-Graph is a data structure that stores a certain of data.
It represents a network that connects multiple points to each other. 


Graph Traversal:-
Traversal over the graph means visit each and every vertex and edge at least once.

1.Depth-First Search (DFS)
DFS algorithm is a recursive algorithm that is based on the backtracking concept. 
The algorithm starts from the initial node and searches in depth until it finds the 
goal node (a node that has no child). Backtracking allows us to move in the backward 
direction on the same path from which we have traversed in the forward direction.




2.Breadth-First Search (BFS)
BFS algorithm is the most common approach to traverse over the graph. 
The traversal starts from the source node and scans its neighboring nodes 
(child of the current node). In short, traverse horizontally and visit all 
the nodes of the current layer. After that, move to the next layer and perform the same.


->Storing a graph
01.Adjacency list
02.Adjacency matrix

*/

//creating adjacency list
/* 
import java.util.*;
public class graph01 {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int src,int dest,int wt){
            this.dest=dest;
            this.src=src;
            this.wt=wt;

        }
    }
    public static void main(String[] args) {
        //
             (5)
         0-------1
                / \
            (1)/   \(3)
              /     \
              2 -----3
                 (1)
              |
           (2)|  
              |
              4
         
        //

        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];  //null->empty arraylist

        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }

        //0 -vertax
        graph[0].add(new Edge(0,1,5));


        //1 -vertax
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
 

        //2 -vertax
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));



        //3 -vertax
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));



        //4 -vertax
        graph[4].add(new Edge(4,2,2));
        
        
        //2's neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i); //src,des,wt
            System.out.println(e.dest);
        }

    }
    
}

*/









//---------------------------------------------------------------------------------------------------------------------

/* 
 Graph Createtion both method
 01.adjencency matrix
 02.adjencency list
*/




/* 
//01.adjencency matrix
//Undirected unweighted graph
/*
//input
5 6
0 1
0 2
1 2
1 3
2 4
3 4

//output
0 1 1 0 0 
1 0 1 1 0
1 1 0 0 1
0 1 0 0 1
0 0 1 1 0 

import java.util.*;
public class graph01 {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int vertax=sc.nextInt();
       int edges=sc.nextInt();

       ArrayList<ArrayList<Boolean>> adjMat=new ArrayList<>();
       for(int i=0;i<vertax;i++){
        ArrayList<Boolean> row = new ArrayList<>();
        for(int j=0;j<edges;j++){
            row.add(false);
        }
        adjMat.add(row);
       }

     
       int u,v;
       for(int i=0;i<edges;i++){
        u=sc.nextInt();
        v=sc.nextInt();
        adjMat.get(u).set(v,true);
        //directed unweighted ke liye nich jo edge add kar rhe hai use hatana hoga....

        adjMat.get(v).set(u, true);
       }

       for(int i=0;i<vertax;i++){
        
        for(int j=0;j<vertax;j++){
            // System.out.print(adjMat.get(i).get(j) +" ");
            System.out.print((adjMat.get(i).get(j) ? 1 : 0) + " ");
        }
        System.out.println();
       }

    }
    
} 
*/









/* 

//01.adjencency matrix
//Undirected weighted graph
/* 
input for weight graph
5 6
0 1 4
0 2 10
1 2 7
1 3 8
3 4 4
2 4 11

output for weight graph
0 4 10 0 0 
4 0 7 8 0
10 7 0 0 11 
0 8 0 0 4
0 0 11 4 0

import java.util.*;
public class graph01 {  //Tc=O(v^2)  and SC=O(V^2);   
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int vertax=sc.nextInt();
       int edges=sc.nextInt();

       ArrayList<ArrayList<Integer>> adjMat=new ArrayList<>();
       for(int i=0;i<vertax;i++){
        ArrayList<Integer> row = new ArrayList<>();
        for(int j=0;j<edges;j++){
            row.add(0);
        }
        adjMat.add(row);
       }

     
       int u,v,weight;
       for(int i=0;i<edges;i++){
        u=sc.nextInt();
        v=sc.nextInt();
        weight=sc.nextInt();
        adjMat.get(u).set(v,weight);
        //directed weighted ke liye nich jo edge add kar rhe hai use hatana hoga....
        adjMat.get(v).set(u, weight);
       }

       for(int i=0;i<vertax;i++){
        
        for(int j=0;j<vertax;j++){
             System.out.print(adjMat.get(i).get(j) +" ");
        }
        System.out.println();
       }

    }
    
} 
*/












//02.Creation of Graph using adjencency List;
//Undirected weighted graph
/* 
input value
5 6
0 1 2
0 2 4
1 2 1
1 3 7
2 4 3
3 4 1
output value;
0 -> 0->1(w=2) 0->2(w=4) 
1 -> 1->0(w=2) 1->2(w=1) 1->3(w=7)
2 -> 2->0(w=4) 2->1(w=1) 2->4(w=3)
3 -> 3->1(w=7) 3->4(w=1)
4 -> 4->2(w=3) 4->3(w=1)
*/

import java.security.PublicKey;
import java.util.*;
public class graph01 { //TC=O(V+2E) SC=O(V+E)    ||  Worst Case me  TC=O(v^2)  and SC=O(V^2);   

    public static class Info{
        int source;
        int desti;
        int weight;

        Info(int source,int desti,int weight){
            this.source=source;
            this.desti=desti;
            this.weight=weight;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int vertax=sc.nextInt();
        int edges=sc.nextInt();
        ArrayList<Info> adList[]=new ArrayList[vertax];
        for(int i=0;i<vertax;i++){
            adList[i]=new ArrayList<>();
        }
        
        int source,desti,weight;
        for(int i=0;i<edges;i++){
            source=sc.nextInt();
            desti=sc.nextInt();
            weight=sc.nextInt();
            adList[source].add(new Info(source, desti, weight));
            // If directed graph, do not write down line
            adList[desti].add(new Info(desti, source, weight));
        }


        //print the list
        for(int i=0;i<vertax;i++){
            System.out.print(i+" -> ");
            for(int j=0;j<adList[i].size();j++){
                Info edge=adList[i].get(j);
                System.out.print(edge.source + "->" + edge.desti + "(w=" + edge.weight +") " );
            }
            System.out.println();
        }
    }
    
} 