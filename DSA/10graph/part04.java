//Dijkstra's Algorithm

/*
->Dijkstra's Algorithm:-
shortest paths from the source to all vertices (weighted graph)
*/

/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
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

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        
        
        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));
        
        
        graph[2].add(new Edge(2,4,3));
        
        graph[3].add(new Edge(3,5,1));
        
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

    }

    public static void bfs(ArrayList<Edge> graph[]){  //Tc=O(n);
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        
        q.add(0);  //source=0

        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){ //visit curr
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path;  //path based sorting for my pairs
        }

    }
    


    //Tc=O(v+ElogV) using priority queue
    public static void diskstra(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];  //dist[i]  ->src to i
        for(int i=0;i<graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;  //+infinity
            }
        }

        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        //loop
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.n]){
                vis[curr.n]=true;

                //neighbours
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u]+wt<dist[v]){ //update distance of src to v;
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        //print all source to vertices shortest dist
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

        System.out.println();
    }
    public static void main(String[] args) {

        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        int src=0;
        diskstra(graph, src);
    }
    
}

*/












/*
 //Bellman Ford Algorithm->Shortest path from the source to all vertices(nagative edges)
 ->doesn't work for Negative weight cycles

*/
/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
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

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        
        
        graph[1].add(new Edge(1,2,-4));
        
        
        graph[2].add(new Edge(2,3,2));
        
        graph[3].add(new Edge(3,4,4));
        
        graph[4].add(new Edge(4,1,-1));
        

    }
    
   //total TC=O(V*E)
    public static void bellmanFord(ArrayList<Edge> graph[],int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int V=graph.length;
        //algo O(V)

        for(int i=0;i<V-1;i++){
            //edges -o(E)
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);

                    //u,v,wt
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    //relaxation 
                    if(dist[u]!=Integer.MAX_VALUE && dist[u] + wt <dist[v]){
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }

        //print
        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {

        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        int src=0;
        bellmanFord(graph, src);
    }
    
}
*/










/* 
 ->Minimus Spanning Tree(MST):-
 A minimum spanning tree or minimust weight spanning tree is a subset of the 
 edges of a connected, edge0weigted undirected graph that connects all the 
 vertices together,without any cycles and with the minimum possible total 
 edge weight.


 ->now we learn Prim's Algorithm
 using MST set
*/
//prim's algorithms
/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
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

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
        
        
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,3,40));
        
        
        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));
        
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));
        
        

    }

    public static void bfs(ArrayList<Edge> graph[]){  //Tc=O(n);
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        
        q.add(0);  //source=0

        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){ //visit curr
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v,int cost){
            this.v=v;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;  //cost based sorting for my pairs
        }

    }
    


    
    public static void prims(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));

        int finalCost=0; //MST Cost/total min Weight

        //loop
        while (!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalCost+=curr.cost;

                //neighbours
                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair(e.dest,e.wt));
                
                }
            }
        }
        System.out.println("final(min) cost of MST = "+ finalCost);
    }
    public static void main(String[] args) {

        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        prims(graph);
    }
    
}

*/










/*
 ->Cheapest Flights within K stops:-
 There are n cities connected by some number of flights.You are given an 
 array flights where flights[i]=from to price indicates that there is flight.

 ->You are also given three integers src,dst and k,return the cheapest price from 
 src to dst with at most k stops.
 ifther is no such rout,return -1;

 ->all values are positive.

     1
    /|   flights=[[0,1,100],[1,2,100],[0,2,500]]
   / |   src=0,dst=2,k=1
 0   |   ans=200.
  \  |
   \ 2
*/

/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
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

    public static void creatGraph(int flights[][],ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int i=0;i<flights.length;i++){
            int src=flights[i][0];
            int dest=flights[i][1];
            int wt=flights[i][2];

            Edge e=new Edge(src, dest, wt);
            graph[src].add(e);
        }

    }

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v,int c,int s){
            this.v=v;
            this.cost=c;
            this.stops=s;
        }

    
        
    }

    public static int cheapestFlight(int n,int flights[][],int src,int dest,int k){
        
        ArrayList<Edge> graph[]=new ArrayList[n];
        creatGraph(flights,graph);

        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                int u=e.src;
                int v=e.dest;
                int wt=e.wt;

                if(curr.cost+wt < dist[v] && curr.stops <=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        //dist[dest]

        if(dist[dest]==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return dist[dest];
        }


    }
    public static void main(String[] args) {

    int n=4;
    int flights[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
    int src=0,des=3,k=1;
    

    }
}
*/












/*
 * Connectring Cities with Minimum Cost:-
 * find the minimum cost for fonnecting all cities on the map.
 * cities[][]={{0,1,2,3,4},
 * {1,0,5,0,7},
 * {2,5,0,6,0},
 * {3,0,6,0,0},
 * {4,7,0,0,0}}
 * 
 * ans=10
*/

/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
    static class Edge implements Comparable<Edge>{
        
        int dest;
        int cost;

        Edge(int dest,int cost){
            this.dest=dest;
            this.cost=cost;
        }
        @Override
        public int compareTo(Edge e2){
            return this.cost-e2.cost;  //ascending order
        }
    }

    //prim's algorighm time complexity.
    public static int connectCities(int cities[][]){
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        boolean vis[]=new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost=0;

        while(!pq.isEmpty()){
            Edge curr=pq.remove();
            if(!vis[curr.dest]){
                vis[curr.dest]=true;
                finalCost+=curr.cost;

                for(int i=0;i<cities[curr.dest].length;i++){
                    if(cities[curr.dest][i]!=0){
                        pq.add(new Edge(i, cities[curr.dest][i]));
                    }
                }
            }
            
        }

        return finalCost;

    }

    public static void main(String[] args) {
    
        int cities[][]={{0,1,2,3,4},
                    {1,0,5,0,7},
                    {2,5,0,6,0},
                    {3,0,6,0,0},
                    {4,7,0,0,0}};
    
        System.out.println(connectCities(cities));
    }
}
*/
















/* 
 * Disoint Set DS/union find ds:-
 * Implementation(Optimized)
 * Parent+union by rank
 


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
    static int n=7;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }

    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return find(par[x]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA]=parB;
        }
        else{
            par[parB]=parA;
        }
    }

    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        
        union(2,4);
        union(3, 6);
        union(1, 4);
        System.out.println(find(3));
        System.out.println(find(4));
        union(1, 5);
    }
}
*/











/*
Kruskl's Algorithm:-
for find out MST using Greedy


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class part04 {
    static class Edge implements Comparable<Edge>{
        
        int dest;
        int src;
        int wt;

        Edge(int dest,int src,int wt){
            this.dest=dest;
            this.src=src;
            this.wt=wt;
        }
        @Override
        public int compareTo(Edge e2){
            return this.wt-e2.wt;  //ascending order
        }
    }


    static void creatGraph(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }


    static int n=4;
    static int par[]=new int[n];
    static int rank[]=new int[n];

    public static void init(){
        for(int i=0;i<n;i++){
            par[i]=i;
        }
    }

    public static int find(int x){
        if(x==par[x]){
            return x;
        }
        return par[x]=find(par[x]);
    }

    public static void union(int a,int b){
        int parA=find(a);
        int parB=find(b);

        if(rank[parA]==rank[parB]){
            par[parB]=parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA]=parB;
        }
        else{
            par[parB]=parA;
        }
    }
    //kruskalsMST code TC=
    public static void kruskalsMST(ArrayList<Edge> edges,int V){
        init();
        Collections.sort(edges);  //O(ElogE)
        int mstCost=0;
        int count=0;
        for(int i=0;count<V-1;i++){
            Edge e=edges.get(i);

            //(src,dest,wt)
            int parA=find(e.src);  //src=a;
            int parB=find(e.dest);  //dest=b;
            if(parA!=parB){
                union(e.src, e.dest);
                mstCost+=e.wt;
                count++;
            }

        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {
    int V=4;
    ArrayList<Edge> edges=new ArrayList<>();
    creatGraph(edges);
    kruskalsMST(edges, V);
    }
}

*/






/* 
Flood Fill Algorithm

Given a m x n integer grid image where image[i][j] represents the pixel value of the image. 
You are also given three integers sr, sc, and color. You should perform a flood fill on the
 image star the pixel image[sr][sel.

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally
 to the s pixel of the same color as the starting pixel, plus any pixels connected 4-directionally 
 to those pixels the same color), and so on. Replace the color of all of the aforementioned pixels with color.

image = [[1, 1, 1], [1, 1, 0],

[1, 0, 1]]

sr = 1, sc=1, color = 2


ans = [[2,2,2],[2,2,0],[2,0,1]];

*/
import java.util.*;
public class part04 {
    //(m+n)
    public void  helper(int [][]image,int sr,int sc,int color,boolean vis[][],int orgCol){
        if(sr < 0 || sc < 0 || sr >= image.length || sc>=image[0].length 
        || vis[sr][sc] || image[sr][sc]!=orgCol){
            return;
        }

        //left
        helper(image, sr, sc-1, color, vis, orgCol);

        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //up
        helper(image, sr-1, sc, color, vis, orgCol);

        //down
        helper(image, sr+1, sc, color, vis, orgCol);

    }

    public int[][] floodFill(int [][]image,int sr,int sc,int color){
        boolean vis[][]=new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }

  
    public static void main(String[] args) {
    int V=4;
    ArrayList<Edge> edges=new ArrayList<>();
    creatGraph(edges);
    kruskalsMST(edges, V);
    }
}