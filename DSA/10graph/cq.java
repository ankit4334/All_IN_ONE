/* 
 Find the minimum number of edges in a path of a graph
Consider a directed graph whose vertices are numbered from 1 to n. There is an edge from a vertex i to a vertex j iff either j = i + 1 or j = 3i. The task is to find the minimum number of edges in a path in G from vertex 1 to vertex n.

Input Format:

The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
Each test case contains a single line of input which contains an integer, n.
Output Format:

Print the number of edges in the shortest path from 1 to n.
Sample Input

1
9
Sample Output

2
Explanation:

The below given graph is formed



The minimum number of edges from vertex 1 to vertex 9 is 2.




class Result{
  static int number_of_edges(int n){
   int c=0;
   while(n>1){
     if(n%3==0){
       n=n/3;
     }
     else{
       n--;
     }
     c++;
   }
    return c;
  }
}

-----------------------------------------------------------------
Find path in a directed graph
Given a directed graph and two vertices(say source and destination vertex), check whether there exists some path from the given source vertex to the destination vertex or not. If it exists then print “YES”, else print “NO”.

Input Format:

First line contains two space separated integers V, E denoting the number of vertices and edges in the graph.
Following E lines contain two space separated integers u, v denoting a directed edge from u to v.
Last line contains two space separated integers src, dest denoting the source and destination vertex respectively.
Constraints:

1 <= V <= 100
0 <= E < 10000
0 <= u, v, src, dest < 100
Output Format:

Print “YES” if a path exists from the given source vertex to the destination vertex, else print “NO”.
Sample Input 1

5 4  // V E
1 0  // directed edge from u to v
0 2
3 0
4 3
1 3  // source destination
Sample Output 1

NO
Explanation 1



No path exists, from the given source vertex to the destination vertex

 Sample Input 2

5 4  // V E
1 0
0 2
2 3
4 3
1 3
Sample Output 2

YES
Explanation 2



There is a path, from the given source vertex to the destination vertex





import java.util.Scanner;
import java.util.ArrayList;
// Other imports go here
// Do NOT change the class name
class Main{
  static ArrayList<ArrayList<Integer>> graph;
   static boolean visited[];
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int V=sc.nextInt();
      int E=sc.nextInt();
      graph=new ArrayList<>();
      for(int i=0;i<V;i++){
        graph.add(new ArrayList<>());
      }
      for(int i=0;i<E;i++){
        int u=sc.nextInt();
        int v=sc.nextInt();
        graph.get(u).add(v);
      }
      int src=sc.nextInt();
      int dest=sc.nextInt();
      visited=new boolean[V];
      if(hasPath(src,dest)){
        System.out.print("YES");
      }else{
        System.out.print("NO");
      }
        // Write your code here
    }
  static boolean hasPath(int src,int dest){
    if(src==dest){
      return true;
    }
    visited[src]=true;
    for(int neighbour:graph.get(src)){
      if(!visited[neighbour]&&hasPath(neighbour,dest)){
        return true;
      }
    }
    return false;
  }
}


-----------------------------------------------------------------
Number of Islands
Given a m x n binary matrix in which 1 represents ‘land’ and 0 represents ‘water’, find the number of islands.

An island is surrounded by water(0s) and is formed by connecting adjacent lands(1s) horizontally or vertically. You may assume all four edges of the given matrix are all surrounded by water.

Input Format:

First line contains two space separated integers m, n that denotes the number of rows and columns in the matrix respectively.
Each of the next m lines contain n space-separated integers representing the matrix.
Constraints:

1 <= m, n <= 150
Output Format:

Print the number of islands.
Sample Input

4 4
1 0 1 0
1 1 0 0
0 0 0 1
1 1 1 1
Sample Output

3
Explanation:

First island consists of following cells : (0, 0), (1, 0), (1,1)
Second island consists of following cells : (0, 2)
Third island consists of following cells : (2, 3), (3, 0), (3, 1), (3, 2), (3, 3)



class Result {
  static void solve(int i,int j,int m,int n,int mat[][]){
    if(i>=0 && i<m && j>=0 && j<n && mat[i][j]==1){
      mat[i][j]=0;
      solve(i+1,j,m,n,mat);
      solve(i-1,j,m,n,mat);
      solve(i,j+1,m,n,mat);
      solve(i,j-1,m,n,mat);
    }
  }
  static int countIslands(int mat[][], int m, int n){
    int c=0;
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        if(mat[i][j]==1){
          solve(i,j,m,n,mat);
          c++;
        }
      }
    }
    return c;
  }   
}

-----------------------------------------------------------------
Depth First Traversal of Graph
Graphs can be traversed popularly in following two ways: Depth First Traversal (DFT) and Breadth First Traversal (BFT). Traversing Graphs can be little bit more tricky than traversing tree because of possibilities of a cycle in graph. So, you need to to write the function for doing a depth first traversal over the given graph.

Input Format:

First line contains an integer V i.e. number of nodes.
Second line contains an integer E i.e. number of edges.
Next E lines contains two integers each v1, v2 denoting the edge from v1 to v2.
Last line of input contains an integer denoting the starting vertex for DFT.
Output Format:

Print the vertex labels starting from given vertex separated by space.
Sample Input

4
5
0 1
0 2
1 2
2 0
2 3
2
Sample Output

2 0 1 3


oid DFSUtil(int v, boolean visited[]) 
{ 
  visited[v]=true;
  System.out.print(v+" ");
  for(int u:adjVertices.get(v)){
    if(!visited[u]){
      DFSUtil(u,visited);
    }
  }
} 
void DFS(int v) 
{ 
  boolean visited[]=new boolean[100];
  DFSUtil(v,visited);
}





-----------------------------------------------------------------
Breadth First Traversal of Graph
Graphs can be traversed popularly in following two ways: Depth First Traversal (DFT) and Breadth First Traversal (BFT). Traversing Graphs can be little bit more tricky than traversing tree because of possibilities of a cycle in graph. So, you need to to write the function for doing a breadth first traversal over the given graph.

Input Format:

First line contains an integer V i.e. number of nodes.
Second line contains an integer E i.e. number of edges.
Next E lines contains two integers each v1, v2 denoting the edge from v1 to v2.
Last line of input contains an integer denoting the starting vertex for BFT.
Output Format:

Print the vertex labels starting from given vertex separated by space.
Sample Input

4
5
0 1
0 2
1 2
2 0
2 3
2
Sample Output

2 0 3 1





void BFS(int v) 
{ 
  boolean vis[]=new boolean[100];
  Queue<Integer> q=new LinkedList<>();
  q.add(v);
  while(!q.isEmpty()){
    int curr=q.remove();
    if(!vis[curr]){
      System.out.print(curr+" ");
      vis[curr]=true;
      for(int u:adjVertices.get(curr)){
        if(!vis[u]){
          q.add(u);
        }
      }
    }
  }
}


-----------------------------------------------------------------
Find the cycle in undirected graph
Given a un-directed graph find out if there is a cycle in it or not.

Note: The given graph may or may not be connected.

Example 1: The following graph contains a cycle



Example 2: The following graph does not contain a cycle



Input Format

The first line contains the Number of vertices, V.
The second line contains the Number of edges, E.
Then E lines follow , containing 2 numbers,x & y, seperated by space denoting an edge from vertex x to y.
Output Format

Print Yes or No depending on graph has cycle or not.
Sample Input

5	// Vertices
5	// Edges
0 1	// Edge from v1 to v2
0 2
1 2
0 3
3 4
Sample Output

Yes 
Explanation:

The graph is having a cycle from vertices 0, 1 and 2




import java.util.*;
// Add other imports if you want to
// Do NOT change the class name
class Main{
  static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
  static boolean visited[];
    public static void main(String[] args)
    {
        // Write your code here
      Scanner sc=new Scanner(System.in);
      int V=sc.nextInt();
      int E=sc.nextInt();
      for(int i=0;i<V;i++){
        graph.add(new ArrayList<>());
      }
      for(int i=0;i<E;i++){
         int u=sc.nextInt();
        int v=sc.nextInt();
        graph.get(u).add(v);
        graph.get(v).add(u);
      }
      visited=new boolean[V];
      if(isCyclic(visited)){
        System.out.print("Yes");
      }
      else{
        System.out.print("No");
      }
    }
  static boolean isCyclic(boolean visited[]){
    for(int i=0;i<visited.length;i++){
       if(!visited[i] && DFS(i,-1,visited)){
         return true;
       }
    }
    return false;
  }
  static boolean DFS(int vertex,int parent,boolean visited[]){
    visited[vertex]=true;
     for(int neigh:graph.get(vertex)){
       if(!visited[neigh] ){
         if(DFS(neigh,vertex,visited)){
         return true;
       }
       }
       else if(neigh!=parent){
         return true;
       }
     }
    return false;
  }
}



-----------------------------------------------------------------










-----------------------------------------------------------------





*/