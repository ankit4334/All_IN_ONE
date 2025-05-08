//in this page we are going to learn 2-d matrix.

/* 
##->Spirally traversing a matrix

Given a matrix of size r*c. Traverse the matrix in spiral form.

Example 1:

Input:
r = 4, c = 4
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12},
           {13, 14, 15,16}}
Output: 
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Explanation:

Example 2:

Input:
r = 3, c = 4  
matrix[][] = {{1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}}
Output: 
1 2 3 4 8 12 11 10 9 5 6 7
Explanation:
Applying same technique as shown above, 
output for the 2nd testcase will be 
1 2 3 4 8 12 11 10 9 5 6 7.

Your Task:
You dont need to read input or print anything. Complete the function spirallyTraverse() that takes matrix, r and c as input parameters and returns a list of integers denoting the spiral traversal of matrix. 

Expected Time Complexity: O(r*c)
Expected Auxiliary Space: O(r*c), for returning the answer only.

Constraints:
1 <= r, c <= 100
0 <= matrixi <= 100

Company Tags
PaytmFlipkartMorgan StanleyMicrosoftOYO RoomsSnapdealD-E-ShawMakeMyTripOracleMAQ SoftwareAdobenearbuyNagarroBrowserStackSalesforce




class Solution
{   
    public: 
    //Function to return a list of integers denoting spiral traversal of matrix.
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
      vector<int> v;
      int rs=0;
      int cs=0;
      int re=r-1;
      int ce=c-1;
      int count=0;
      int t=r*c;
      
      while(count<t){
          for(int i=cs; count<t && i<=ce;i++){
              v.push_back(matrix[rs][i]);
              count++;
          }
          rs++;
          
          
          
          for(int i=rs; count<t && i<=re;i++){
              v.push_back(matrix[i][ce]);
              count++;
          }
          ce--;
          
          
          
          
          
          
          for(int i=ce; count<t && i>=cs;i--){
              v.push_back(matrix[re][i]);
              count++;
          }
          re--;
          
          
          
          
          for(int i=re; count<t && i>=rs;i--){
              v.push_back(matrix[i][cs]);
              count++;
          }
          cs++;
          
          
          
         }
         
         return v;
    }
};



*/














/* 
2.Search a 2D Matrix
Solved
Medium
Topics
Companies
You are given an m x n integer matrix matrix with the following two properties:

Each row is sorted in non-decreasing order.
The first integer of each row is greater than the last integer of the previous row.
Given an integer target, return true if target is in matrix or false otherwise.

You must write a solution in O(log(m * n)) time complexity.

 

Example 1:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
Example 2:


Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
Output: false


class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        
        
        
//         int n=matrix.size();
//         int m=matrix[0].size();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }
//         return false;
        
        
        
        
        //method 2
        
        int row=matrix.size();
        int col=matrix[0].size();
        int rowindex=0;
        int colindex=col-1;
        
        while(rowindex<row && colindex>=0){
            int ele=matrix[rowindex][colindex];
            if(ele==target){
                return 1;
            }
            else if(ele<target){
                rowindex++;
            }
            else{
                colindex--;
            }
        }
        return 0;
    }
};

*/

















/* 
3Row with max 1s
MediumAccuracy: 33.09%Submissions: 236K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a boolean 2D array of n x m dimensions, consisting of only 1's and 0's, where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:

Input: 
N = 4 , M = 4
Arr[][] = {{0, 1, 1, 1},
           {0, 0, 1, 1},
           {1, 1, 1, 1},
           {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based
indexing).

Example 2:

Input: 
N = 2, M = 2
Arr[][] = {{0, 0}, {1, 1}}
Output: 1
Explanation: Row 1 contains 2 1's (0-based
indexing).

Your Task:  
You don't need to read input or print anything. Your task is to complete the function rowWithMax1s() which takes the array of booleans arr[][], n and m as input parameters and returns the 0-based index of the first row that has the most number of 1s. If no such row exists, return -1.
 

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)


Constraints:
1 ≤ N, M ≤ 103
0 ≤ Arr[i][j] ≤ 1 

 

Company Tags





class Solution{
public:
	int rowWithMax1s(vector<vector<int> > arr, int n, int m) {
	   
	   int ma=0;
	   int x=-1;
	   for(int i=0;i<n;i++){
	       int c=0;
	       for(int j=0;j<m;j++){
	           if(arr[i][j]==1){
	               c++;
	            }
	       }
	      if(c>ma){
	          ma=c;
	          x=i;
            }
	    }
	   return x;
	   
	}

};
*/












/* 
 * Given an NxN matrix Mat. Sort all elements of the matrix.

Example 1:

Input:
N=4
Mat=[[10,20,30,40],
[15,25,35,45] 
[27,29,37,48] 
[32,33,39,50]]
Output:
10 15 20 25 
27 29 30 32
33 35 37 39
40 45 48 50
Explanation:
Sorting the matrix gives this result.
Example 2:

Input:
N=3
Mat=[[1,5,3],[2,8,7],[4,6,9]]
Output:
1 2 3 
4 5 6
7 8 9
Explanation:
Sorting the matrix gives this result.
Your Task:
You don't need to read input or print anything. Your task is to complete the function sortedMatrix() which takes the integer N and the matrix Mat as input parameters and returns the sorted matrix.


Expected Time Complexity:O(N2LogN)
Expected Auxillary Space:O(N2)


Constraints:
1<=N<=1000
1<=Mat[i][j]<=105

Company Tags

class Solution {
    int[][] sortedMatrix(int N, int Mat[][]) {
       ArrayList<Integer> a=new ArrayList<>();
       int m=Mat[0].length;
       for(int i=0;i<N;i++){
           for(int j=0;j<m;j++){
               a.add(Mat[i][j]);
           }
       }
       
       Collections.sort(a);
       int[][] ans=new int[N][N];
       
       int k=0;
       for(int i=0;i<N;i++){
           for(int j=0;j<m;j++){
              ans[i][j]=a.get(k);
              k++;
           }
       }
       
       return ans;
       
    }
};
*/












/* 
Kth element in Matrix
MediumAccuracy: 61.42%Submissions: 54K+Points: 4
Internship Alert
New month-> Fresh Chance to top the leaderboard and get SDE Internship! 

banner
Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

Example 1:
Input:
N = 4
mat[][] =     {{16, 28, 60, 64},
                   {22, 41, 63, 91},
                   {27, 50, 87, 93},
                   {36, 78, 87, 94 }}
K = 3
Output: 27
Explanation: 27 is the 3rd smallest element.
 

Example 2:
Input:
N = 4
mat[][] =     {{10, 20, 30, 40}
                   {15, 25, 35, 45}
                   {24, 29, 37, 48}
                   {32, 33, 39, 50}}
K = 7
Output: 30
Explanation: 30 is the 7th smallest element.


Your Task:
You don't need to read input or print anything. Complete the function kthsmallest() which takes the mat, N and K as input parameters and returns the kth smallest element in the matrix.
 

Expected Time Complexity: O(K*Log(N))
Expected Auxiliary Space: O(N)

 

Constraints:
1 <= N <= 50
1 <= mat[][] <= 10000
1 <= K <= N*N

 

Company Tags


int kthSmallest(int mat[MAX][MAX], int n, int k)
{
  
  vector<int> v;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            v.push_back(mat[i][j]);
            
        }
    }
   
   sort(v.begin(),v.end());
   return v[k-1];
  
}
*/








/* 
 48. Rotate Image
Solved
Medium
Topics
Companies
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]


class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        int a[][]=new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[j][r - i - 1] = matrix[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               matrix[i][j]=a[i][j];
            }
        }
    }
}
*/










/*
 73. Set Matrix Zeroes
Solved
Medium
Topics
Companies
Hint
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

 

Example 1:


Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:


Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int v[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                v[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<c;k++){
                        v[i][k]=0;
                    }
                }
            }
        }


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<r;k++){
                        v[k][j]=0;
                    }
                }
            }
        }


        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=v[i][j];
            }
        }

    }
}


*/











/*
 


*/











/*
 


*/