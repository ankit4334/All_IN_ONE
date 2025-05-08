//Connected Components->means two graph is not connected then using this method 
//cheak bfs and dfs

//01 connected compnents
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  part03{
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

        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));
        
        
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
        
        
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
        
        
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));



        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));



        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));


        graph[6].add(new Edge(5,5,1));


    }



    public static void bfs(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                bfsUtil(graph,vis);
            }
        }
    }



    public static void bfsUtil(ArrayList<Edge> graph[],boolean vis[]){  //Tc=O(n);
        Queue<Integer> q=new LinkedList<>();
        
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



    public static void dfs(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
           if(!vis[i]){
            dfsUtil(graph, i, vis);
           }
        }

    }


    public static void dfsUtil(ArrayList<Edge> graph[],int curr,boolean vis[]){
        //visit
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfsUtil(graph,e.dest,vis);
            }
        }
    }
    
    public static void main(String[] args) {

        /*
     all edge weight are 1.
        1---3
       /    |\
      0     | 5--6
      \     | /
       2----4 
        
        */
        

       /* 
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        bfs(graph);
    }
    
}
*/















/*
 * Cycle in Graphs:-
 * 01.undirected-
 ->dfs,bfs,dsu(disjoint set union)
 ->to dedect cyclye in undirected graph

 02.directed-
 ->dfs,bfs,and topological sort(hahn's algorithm)
 ->above method is use to dedect cyclye in directed graph
*/




//undirected graph
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        //[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
        
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        
        
        //graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        
        
        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));
        

        graph[4].add(new Edge(4,3));
        
    }


    //DetectCycle code using dfs 
    //TC=O(v+e)
    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectCycleUtil(graph,vis,i,-1)){
                    return true;
                    //cycle exists in one of the parts
                }
            }  
        }
        return false;

    }

    //TC=O(V+E)
    public static boolean detectCycleUtil(ArrayList<Edge> graph[],boolean vis[],int curr,int par){
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            //case 3

            if(!vis[e.dest]){
                if(detectCycleUtil(graph, vis, e.dest, curr)){
                    return true;
                }
                
            }

            //case 1;
            else if(vis[e.dest] && e.dest!=par){
                return true;
            }
            //case 2-< do nothing -> continue

        }

        return false;
    }
    public static void main(String[] args) {

        /*
     all edge weight are 1.
        1---3
       /|   | 
      0 |   |
      \ |   |
        2   4 
        
        */
        

       /* 
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
       System.out.println(detectCycle(graph));
    }
    
}


*/



 





/*
Bipartite Graph->A Bipartite graph is a graph whose vertices can be divided into 
two indepnedent sets, U and V such that every edge (u,v) either connects a vertex from U to v
or a vertex from U to U. In other words, for every edge (u,v),either u belongs to u and v to V,or u
belongs to va and v t U.We can also say that there is no edge that connects vertices fo same set.


->Condtion of Bipartite:-
01.Acyclic           true
02.Even Cycle        true
03.Odd Cycle         false

*/



/*

//Graph is bipartite or not

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        //[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,2));
        
        
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));
        
        
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        
        
        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        
    }


    //check graph isBipartile or not TC=O(V+E)
    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1; //no color
        }
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){  //BFS
                q.add(i);
                col[i]=0;  //yellow

                while(!q.isEmpty()){
                   int curr=q.remove();
                   for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);  //e.dest

                    if(col[e.dest]==-1){
                        int nextCol=col[curr]==0 ? 1 : 0;
                        col[e.dest]=nextCol;
                        q.add(e.dest);
                    }
                    else if(col[e.dest]==col[curr]){
                        return false;  //NOT BIPARTITE
                    }
                   } 
                }
            }
        }

        return true;
        
    }

    ----------------------------------------------------------------------------------
    =>Using DFS  
    class Solution {
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        int color[] = new int[adj.size()];

        for(int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        for(int i = 0; i < adj.size(); i++) {
            if(color[i] == -1) {
                color[i] = 0; // Set initial color here
                if(!solve(adj, color, i)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean solve(ArrayList<ArrayList<Integer>> adj, int color[], int curr) {
        for(int i = 0; i < adj.get(curr).size(); i++) {
            int e = adj.get(curr).get(i);
            if(color[e] == -1) {
                int nextColor = color[curr] == 0 ? 1 : 0;
                color[e] = nextColor;
                if(!solve(adj, color, e)) {
                    return false;
                }
            }
            else if(color[curr] == color[e]) {
                return false;
            }
        }
        return true;
    }
}
---------------------------------------------------------------------------


    
    public static void main(String[] args) {

        /*
        -> if graph doesn't have cycle then bidefaoult is bipartite
           0-------2
          /       /
         /      /
         1     4
          \   /
           \ /
            3  

         ans=FALSE;
        */
        

        /*
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        System.out.println(isBipartite(graph));
       
    }
    
}

*/












//Cycle Detection
//Directed Graph(DFS)
/*
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        

        graph[1].add(new Edge(1,0));
        
        graph[2].add(new Edge(2,3));
         
        graph[3].add(new Edge(3,0));
       
    }


   
    public static boolean isCycle(ArrayList<Edge> graph[]){
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(isCycleUtil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean isCycleUtil(ArrayList<Edge> graph[],int curr,boolean vis[],boolean stack[]){
        vis[curr]=true;
        stack[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){ //cycle
                return true;
            }
            if(!vis[e.dest] && isCycleUtil(graph,e.dest,vis,stack)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }
    
    public static void main(String[] args) {
        /*
        1------0\
               | \
               |  3
               | / 
                2
          ans=true cycle is presant;
        */
       /* 
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        System.out.println(isCycle(graph));
       
    }
    
}

 */














//Topological Sortig:-
/*
Topological Sortig:-Directed Acyclic Graph(DAG) is a directed graph with no cycles.

Topological sorting is used only for DAGs(not for non-DAGs)

it is a linear order of vertices such that every directed edge u ->v,
the vetex u comes before v in the order.

->topological sorting:-
*dependency

Action 1-boil water
Action 2-add masala
Action 3-add maggie
Action 4-serve maggie

        1--->\2
        \       \>
         \>3----->4
        
 sort:-1 2 3 4 or 1 3 2 4
}
        

*/

//topological sort Using Dfs

/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        

        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
         
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
       
    }

    //O(V+E)=TC
    public static void topSort(ArrayList<Edge> graph []){
        boolean vis[]=new boolean[graph.length];
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topSortUtil(graph,i,vis,s);   //modified dfs
            }
        }

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph [],int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topSortUtil(graph,e.dest,vis,s);
            }
        }
        s.push(curr);

    }

    public static void main(String[] args) {
        
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
       topSort(graph);
       
    }
    
}




*/














/*
 ->Topological Sort using BFS(kan's algorithms)
 ->Fact:-A DAG has at least one veted with in-degree 0 and one vertex with 
 out-degree 0.
*/


/* 
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));
        

        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
         
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
       
    }

    //O(V+E)=TC
    public static void topSort(ArrayList<Edge> graph []){
        int indeg[]=new int[graph.length];
        calcIngeg(graph, indeg);
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr=q.remove();
            System.out.print(curr+" ");   //topological sort print

            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;

                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void calcIngeg(ArrayList<Edge> graph [],int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                Edge e=graph[v].get(j);
                indeg[e.dest]++;
            }
        }

    }

    public static void main(String[] args) {
        
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
       topSort(graph);
       
    }
    
}


*/














//All paths from source to destination(target) Directed graph
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class  part03{
    static class Edge{
        int src;
        int dest;
        

        Edge(int src,int dest){
            this.dest=dest;
            this.src=src;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,3));

        graph[2].add(new Edge(2,3));
        

        graph[3].add(new Edge(3,1));
        
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
         
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
       
    }

  //Exponential time complexity
  public static void printAllPath(ArrayList<Edge> graph [],int src,int dest,String path){
        if(src==dest){
            System.out.println(path+dest);
            return;
        }

        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllPath(graph, e.dest, dest, path+src);
        }

    }

    public static void main(String[] args) {
        
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creatGraph(graph);
        int src=5,dest=1;
       printAllPath(graph,src,dest,"");
       
    }
    
}








/*
->Question On GRAPH____________
Covid Spread
Difficulty: MediumAccuracy: 49.95%Submissions: 18K+Points: 4Average Time: 25m
Aterp is the head nurse at a city hospital. City hospital contains R*C number of wards and the structure of a hospital is in the form of a 2-D matrix.
Given a matrix of dimension R*C where each cell in the matrix can have values 0, 1, or 2 which has the following meaning:
0: Empty ward
1: Cells have uninfected patients
2: Cells have infected patients

Input:
3 5
2 1 0 2 1
1 0 1 2 1
1 0 0 2 1 
Output:
2

class Solution {
    class Pair {
        int a;
        int b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    
    int row[] = {-1, 1, 0, 0};
    int col[] = {0, 0, -1, 1};
    
    public int helpaterp(int[][] hospital) {
        int r = hospital.length;
        int c = hospital[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (hospital[i][j] == 2) {
                    q.add(new Pair(i, j));
                }
            }
        }

        int timer = -1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            timer++;
            
            while (size-- > 0) {
                Pair p = q.remove();
                int i = p.a;
                int j = p.b;
                
                for (int k = 0; k < 4; k++) {
                    int ni = i + row[k];
                    int nj = j + col[k];
                    
                    if (ni >= 0 && ni < r && nj >= 0 && nj < c && hospital[ni][nj] == 1) {
                        hospital[ni][nj] = 2;
                        q.add(new Pair(ni, nj));
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (hospital[i][j] == 1) {
                    return -1;
                }
            }
        }

        return timer == -1 ? 0 : timer;
    }
}





-----------------------------------------------------------------------------------------------------------------------------------
Find the number of islands
Difficulty: MediumAccuracy: 42.12%Submissions: 237K+Points: 4Average Time: 20m
Given a grid of size n*m (n is the number of rows and m is the number of columns in the grid) consisting of 'W's (Water) and 'L's (Land). Find the number of islands.

Note: An island is either surrounded by water or the boundary of a grid and is formed by connecting adjacent lands horizontally or vertically or diagonally i.e., in all 8 directions.

Examples:

Input: grid[][] = [['L', 'L', 'W', 'W', 'W'], ['W', 'L', 'W', 'W', 'L'], ['L', 'W', 'W', 'L', 'L'], ['W', 'W', 'W', 'W', 'W'], ['L', 'W', 'L', 'L', 'W']]
Output: 4


//method 01 Using DFS
class Solution {
    public int countIslands(char[][] grid) {
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='L'){
                    solve(i,j,r,c,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void solve(int i,int j,int m,int n,char[][] grid){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]=='L'){
            grid[i][j]='W';
            
            solve(i+1,j,m,n,grid);
            solve(i-1,j,m,n,grid);
            solve(i,j+1,m,n,grid);
            solve(i,j-1,m,n,grid);
            
            solve(i+1,j+1,m,n,grid);
            solve(i-1,j-1,m,n,grid);
            solve(i+1,j-1,m,n,grid);
            solve(i-1,j+1,m,n,grid);
        }
    }
}


//Method -2 Using BFS
class Solution {
    class Pair {
        int a, b;
        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] col = {-1, 0, 1, -1, 1, -1, 0, 1};

    public int countIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int r = grid.length;
        int c = grid[0].length;
        int count = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 'L') {
                    count++;
                    bfs(grid, i, j, r, c);
                }
            }
        }

        return count;
    }

    private void bfs(char[][] grid, int x, int y, int r, int c) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(x, y));
        grid[x][y] = 'W'; // mark as visited

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            for (int k = 0; k < 8; k++) {
                int ni = curr.a + row[k];
                int nj = curr.b + col[k];

                if (ni >= 0 && ni < r && nj >= 0 && nj < c && grid[ni][nj] == 'L') {
                    grid[ni][nj] = 'W'; // mark visited
                    q.add(new Pair(ni, nj));
                }
            }
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------
Replace O's with X's
Difficulty: MediumAccuracy: 34.0%Submissions: 117K+Points: 4Average Time: 20m
Given a matrix mat where every element is either 'O' or 'X'. Replace all 'O' or a group of 'O' with 'X' that are surrounded by 'X'.

A 'O' (or a set of 'O') is considered to be surrounded by 'X' if there are 'X' at locations just below, just above, just left and just right of it.

Examples:

Input: mat = 
[['X', 'X', 'X', 'X'], 
['X', 'O', 'X', 'X'], 
['X', 'O', 'O', 'X'], 
['X', 'O', 'X', 'X'], 
['X', 'X', 'O', 'O']]
Output: 
[['X', 'X', 'X', 'X'], 
['X', 'X', 'X', 'X'], 
['X', 'X', 'X', 'X'], 
['X', 'X', 'X', 'X'], 
['X', 'X', 'O', 'O']]
Explanation: We only changed those 'O' that are surrounded by 'X'



class Solution {
    static char[][] fill(char mat[][]) {
       int r=mat.length;
       int c=mat[0].length;
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
                if ((i == 0 || j == 0 || i == r - 1 || j == c - 1) && mat[i][j] == 'O') {
                    dfs(mat, i, j, r, c);
                }
           }
       }
       
       for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               if(mat[i][j]=='T'){
                   mat[i][j]='O';
               }
               else{
                   mat[i][j]='X';
               }
           }
       }
       
       return mat;
    }
    
    public static void dfs(char mat[][],int i,int j,int r,int c){
        if (i < 0 || j < 0 || i >= r || j >= c || mat[i][j] != 'O') return;

        mat[i][j] = 'T'; // mark as visited

        dfs(mat, i + 1, j, r, c);
        dfs(mat, i - 1, j, r, c);
        dfs(mat, i, j + 1, r, c);
        dfs(mat, i, j - 1, r, c);
    }
}


-----------------------------------------------------------------------------------------------------------------------------------
547. Number of Provinces
Solved
Medium
Topics
Companies
There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.

 

Example 1:


Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
Output: 2

class Solution {
    public int findCircleNum(int[][] isConnected) {
         int V = isConnected.length;
        boolean[] visited = new boolean[V];
        int provinceCount = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i, V);
                provinceCount++;
            }
        }

        return provinceCount;
    }

    public void dfs(int[][] isConnected, boolean[] visited, int i, int V) {
        visited[i] = true;
        for (int j = 0; j < V; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(isConnected, visited, j, V);
            }
        }
    }

}

-----------------------------------------------------------------------------------------------------------------------------------

X Total Shapes
Difficulty: MediumAccuracy: 65.94%Submissions: 46K+Points: 4Average Time: 20m
Given  a grid of n*m consisting of O's and X's. The task is to find the number of 'X' total shapes.
Note: 'X' shape consists of one or more adjacent X's (diagonals not included).
 

Example 1:

Input: grid = {{X,O,X},{O,X,O},{X,X,X}}
Output: 3
Explanation: 
The grid is-
X O X
O X O
X X X
So, X with same colour are adjacent to each 
other vertically for horizontally (diagonals 
not included). So, there are 3 different groups 
in the given grid.

class Solution
{
    //Function to find the number of 'X' total shapes.
    public int xShape(char[][] grid)
    {
        int count=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='X'){
                    solve(i,j,r,c,grid);
                    count++;
                }
            }
        }
        return count;
    }
    
    public void solve(int i,int j,int m,int n,char[][] grid){
        if(i>=0 && i<m && j>=0 && j<n && grid[i][j]=='X'){
            grid[i][j] = 'O';
            solve(i+1,j,m,n,grid);
            solve(i-1,j,m,n,grid);
            solve(i,j+1,m,n,grid);
            solve(i,j-1,m,n,grid);
            
        }
    }
}

-----------------------------------------------------------------------------------------------------------------------------------









-----------------------------------------------------------------------------------------------------------------------------------







-----------------------------------------------------------------------------------------------------------------------------------








-----------------------------------------------------------------------------------------------------------------------------------






-----------------------------------------------------------------------------------------------------------------------------------









-----------------------------------------------------------------------------------------------------------------------------------









-----------------------------------------------------------------------------------------------------------------------------------






-----------------------------------------------------------------------------------------------------------------------------------






-----------------------------------------------------------------------------------------------------------------------------------

*/