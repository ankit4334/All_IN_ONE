
/*
Q.1Reverse The Array



#include <bits/stdc++.h> 
int sumOfMaxMin(int arr[], int n){
	// Write your code here.
	int max=INT_MIN;
	int min=INT_MAX;
	int sum;
	for(int i=0;i<n;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}


	for(int i=0;i<n;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
  
  return max+min;

	
}










---------------------------------------------
2.Sum Of Max And Min



#include <bits/stdc++.h> 
int sumOfMaxMin(int arr[], int n){
	// Write your code here.
	int max=INT_MIN;
	int min=INT_MAX;
	int sum;
	for(int i=0;i<n;i++){
		if(arr[i]>max){
			max=arr[i];
		}
	}


	for(int i=0;i<n;i++){
		if(arr[i]<min){
			min=arr[i];
		}
	}
  
  return max+min;

	
}


















____________________________________________
3.Kth Smallest and Largest Element

#include<bits/stdc++.h>
vector<int> kthSmallLarge(vector<int> &arr, int n, int k)
{
// Write your code here.
   vector<int> v;
   sort(arr.begin(),arr.end());
   int a=arr[k-1];
   int b=arr[n-k];
   v.push_back(a);
   v.push_back(b);
   return v;
   
}







/*
vector<int> kthSmallLarge(vector<int> &arr, int n, int k)
{
/*
 vector<int> v;

     
	for(int i=0;i<n-1;i++){
		int minindex=i;
		for(int j=i+1;n<n;j++){
			if(arr[j]<arr[minindex]){
				minindex=j;
			}
			swap(arr[i],arr[minindex]);
		}
	}
	
	
  v.push_back(arr[n-k]);
	v.push_back(arr[k-1]);
   
	
	return v;

	

*/
        

 












/*

 ____________________________________________
 4.Sort 0 1 2


 #include <bits/stdc++.h> 
void sort012(int *arr, int n)
{
   int l=0;
   int m=0;
   int h=n-1;
   while(m<=h){
      if(arr[m]==0){
         swap(arr[l],arr[m]);
         l++;
         m++;
      }
      else if(arr[m]==1){
       m++;
      }
      else{
          swap(arr[m],arr[h]);
        h--;
      }
   }

}

















_________________________________________
5.Move All Negative Numbers To


#include <bits/stdc++.h> 
vector<int> separateNegativeAndPositive(vector<int> &nums){
    // Write your code here.
    
    int i=-1;
    int j=0;
    for(j=0;j<nums.size();j++){
        if(nums[j]<0){
             i++;
            swap(nums[i],nums[j]);
            
        }
        
    }
    return nums;
}



















_________________________________________________
6.Find similarities between two or union the element
#include <bits/stdc++.h>
#include<vector>
pair<int, int> findSimilarity(vector<int> arr1, vector<int> arr2, int n,int m) {
  // Write Your Code here.


unordered_map<int,int>mp;
for(int i=0;i<n;i++){
  mp[arr1[i]]++;
}
int count=0;
for(int i=0;i<m;i++){
  if(mp.find(arr2[i])!=mp.end()){
    count++;
  }
}

int un=m+n-count;
pair<int,int>p;
p={count,un};
return p;




/*
answer is correct but test case not 
running

  
int c=0;
  for(int i=0;i<n;i++){
    for(int j=0;j<m;j++){
      if(arr1[i]==arr2[j]);
      c++;
    }
  }

 int k=m+n;
 k=k-c;

pair<int,int>v;
v={k,c};

return v;



*/









  /*
  int i=0;
  int j=0;
  vector<int> v;
  vector<int> v1;

  while(i<n && j<m){
         if(arr1[i]==arr2[j])
		 v.push_back(arr[i]);
		 v1.push_back(arr[i]);
		 i++;
		 
		 else{
              v.push_back(arr[i]);
			  v.push_back(arr[j]);
			 i++;
			 j++;
		 }
  }
  return v.size();
  return v1.size();

  */
}


























/*
___________________________________________
7.Rotate array


#include <bits/stdc++.h> 
#include <iostream>
using namespace std;

void rotate(int arr[],int n,int k){

    for(int i=k;i<n;i++){
        cout<<arr[i]<<" ";
    }

    for(int j=0;j<k;j++){
        cout<<arr[j]<<" ";
    }

}

int main() {
    //Write your code here

int n;
cin>>n;

int arr[n];
for(int i=0;i<n;i++){
    cin>>arr[i];
}
int k;
cin>>k;

rotate(arr,n,k);
    return 0;
}
























________________________________________________
8.Maximum Subarray Sum
#include <bits/stdc++.h> 
long long maxSubarraySum(int arr[], int n)
{
    /*
        Don't write main().
        Don't read input, it is passed as function argument.    
        No need to print anything.
        Taking input and printing output is handled automatically.
    */
    //kedney algori
    long long sum=0;
    long long maxi=0;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
        maxi=max(maxi,sum);
        if(sum<0)
        sum=0;
    }
    return maxi;
    


/*
     long long sum=0;
     long long m=INT_MIN;
    for(long long i=0;i<n;i++){
        for(long long j=i;j<n;j++){
              sum+=arr[j];
              if(sum>m)
              m=sum;

              if(sum<0)
              sum=0;
        }
    }
    return m;

   

}

 */







/*
____________________________________________________
9.Minimize The Difference
#include <bits/stdc++.h> 
using namespace std;

int minimizeIt(vector<int> A, int K)
{
	// Write your code here.
	int size = A.size();

	if( size == 1){
		return 0;
	}
	sort( A.begin(),A.end());

	int mini = 0; 
	int maxi = 0; 

	int ans = A[size - 1] - A[0];	
	for( int i = 1;  i < size; i++){
          if (A[i] - K < 0) {
			  continue;
          }
		  
        maxi = max(A[i-1] + K , A[size - 1] - K);
		mini = min(A[0] + K , A[i] - K);
        ans = min(ans , maxi-mini);
        }
		return ans;
	
}





















_______________________________________________________________
10.Minimum Jumps