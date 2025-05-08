/*

//Binary Search
#include<iostream>
using namespace std;

int BinarySearch(int arr[],int size,int key){
	int start=0;
	int end=size-1;
	
	int mid=start + (end-start)/2;
	
	while(start<=end){
		if(arr[mid]==key){
			return mid;
		}
		if(key>arr[mid]){
		start=mid+1;	
		}
		else{
		end=mid-1;	
		}
		mid=start + (end-start)/2;
	}

	return -1;
}

int main(){
	
	int even[6]={2,4,6,8,12,18};
	int odd[5]={3,8,11,14,16};
	
	int evenindex=BinarySearch(even,6,120);
	cout<<"index of 12 is ->="<<evenindex<<endl;
	
	cout<<endl;
	
	int oddindex=BinarySearch(odd,5,11);
	cout<<"index of 12 is ->="<<oddindex<<endl;
	 
	
	return 0;
}

*/


//Quesion on the binarySearch


/*
//01->using the binary search find first and last occurrece of an array

#include<iostream>
using namespace std;

int firstOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		e=mid-1;	
			
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
			e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}


int LastOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		s=mid+1;	
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
			e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}


int main(){
	
	int even[5]={1,2,3,3,5};
	cout<<"First occurrence of 3 is at index "<<firstOcc(even,5,3);
	cout<<endl;
	cout<<"last occurrence of 3 is at index "<<LastOcc(even,5,3);
	
	return 0;
}

*/


/*
//02.find the total number of occurance using binary search

#include<iostream>
using namespace std;

int firstOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		e=mid-1;	
			
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
			e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}


int LastOcc(int arr[],int n,int key){
	int s=0,e=n-1;
	int mid=s+(e-s)/2;
	int ans=-1;
	while(s<=e){
		if(arr[mid]==key){
		ans=mid;
		s=mid+1;	
			
		}
		else if(key>arr[mid]){
			s=mid+1;
		}
		else if(key<arr[mid]){
			e=mid-1;
		}
		
		mid=s+(e-s)/2;
	}
	return ans;
}


int main(){
	
	int even[5]={1,2,3,3,5};
	cout<<"First occurrence of 3 is at index "<<firstOcc(even,5,3);
	cout<<endl;
	cout<<"last occurrence of 3 is at index "<<LastOcc(even,5,3);
	cout<<endl;
	cout<<"total number of occurrence of 3 is "<<(LastOcc(even,5,3)-firstOcc(even,5,3))+1;
	
	return 0;
}


*/


/*
//03.Peak index in mountain Array

#include<iostream>
using namespace std;

int Peakindexinmountain(int arr[],int size){
	int start=0;
	int end=size-1;
	
	int mid=start + (end-start)/2;
	
	while(start<end){
		if(arr[mid]<arr[mid+1]){
			start=mid+1;
		}
	
		else{
		end=mid;	
		}
		mid=start + (end-start)/2;
		
	}
	return start;
}

int main(){
	
	int even[8]={24,69,97,98,99,109,54,33};

	
	int index=Peakindexinmountain(even,8);
	cout<<"index of 12 is ->="<<index<<endl;

	
	return 0;
}

*/


/*

//04.Get pivot element in  Array

#include<iostream>
using namespace std;

int pivotelement(int arr[],int size){
	int start=0;
	int end=size-1;
	
	int mid=start + (end-start)/2;
	
	while(start<end){
		if(arr[mid]>=arr[0]){
			start=mid+1;
		}
	
		else{
		end=mid;	
		}
		mid=start + (end-start)/2;
		
	}
	return start;
}

int main(){
	
	int even[6]={8,10,17,1,2,3};

	
	int element=pivotelement(even,6);
	cout<<"pivot element is ->="<<element<<endl;

	
	return 0;
}

*/


/*
//05.Search in rotated sorted arry
#include<iostream>
using namespace std; 


int pivotelement(int arr[],int size){
	int start=0;
	int end=size-1;
	
	int mid=start + (end-start)/2;
	
	while(start<end){
		if(arr[mid]>=arr[0]){
			start=mid+1;
		}
	
		else{
		end=mid;	
		}
		mid=start + (end-start)/2;
		
	}
	return start;
}


int BinarySearch(int arr[],int size,int key){
	int start=0;
	int end=size-1;
	
	int mid=start + (end-start)/2;
	
	while(start<=end){
		if(arr[mid]==key){
			return mid;
		}
		if(key>arr[mid]){
		start=mid+1;	
		}
		else{
		end=mid-1;	
		}
		mid=start + (end-start)/2;
		
	}
	return -1;
}

int SearchRotated(int arr[],int n,int k){
	int pivot=pivotelement(arr,n);
	if(k>=arr[pivot] && k<=arr[n-1]){
		return BinarySearch(arr,pivot,n-1,k);
	}
	else{
		return BinarySearch(arr,0,pivot,k);
	}
}

int main(){
	int arr[5]={7,6,1,2,4};
	cout<<SearchRotated(arr,5,2);
	
	return 0;
}
*/

//Q06.find the squqre root using binary search

#include<iostream>
using namespace std;
long long sqrtInteger(int n){
	int s=0;
	int e=n;
	long long int mid=s+(e-s)/2;
	
	long long int ans=-1;
	while(s<=e){
		long long int square=mid*mid;
		if(square==n)
		return mid;

		if(square<n){
			ans=mid;
			s=mid+1;
		}
		else{
			e=mid-1;
		}
		mid=s+(e-s)/2;
	}
	return ans;
}

double morePrecision(int n,int precision,int tempsol){
	double factor=1;
	double ans=tempsol;
	
	for(int i=0;i<precision;i++){
		factor=factor/10;
		for(double j=ans;j*j<n;j=j+factor){
			ans=j;
		}
	}
	return ans;
}

int main(){
	int n;
		cout<<"enter the number"<<endl;
	cin>>n;

	
	int tempsol=sqrtInteger(n);
	cout<<"Answer is "<<morePrecision(n,3,tempsol)<<endl;
	
	return 0;
}




