package datastructure;

public class Merge_sort {
	void merge(int a[], int beg, int mid, int end)
	{
		int i,j,k;
		int n=mid - beg+1;
		int n1=end-mid;
		
		int Larray[]= new int[n];
		int Rarray[]=new int[n1];
		
		for (i = 0; i < n; i++)    
		    Larray[i] = a[beg + i];    
		    for (j = 0; j < n1; j++)    
		    Rarray[j] = a[mid + 1 + j];   
		    
		    
		    i=0;j=0; k=beg;
		    
		    while (i < n && j < n1)    
		    {    
		        if(Larray[i] <= Rarray[j])    
		        {    
		            a[k] = Larray[i];    
		            i++;    
		        }    
		        else    
		        {    
		            a[k] = Rarray[j];    
		            j++;    
		        }    
		        k++;    
		    }    
		    while (i<n)    
		    {    
		        a[k] = Larray[i];    
		        i++;    
		        k++;    
		    }    
		      
		    while (j<n1)    
		    {    
		        a[k] = Rarray[j];    
		        j++;    
		        k++;    
		    }    
		}    
		  
	
	void mergeSort(int a[], int beg, int end)  
	{  
	    if (beg < end)   
	    {  
	        int mid = (beg + end) / 2;  
	        mergeSort(a, beg, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, beg, mid, end);  
	    }  
	}  
	void printArray(int a[], int z)  
	{  
	    int i;  
	    for (i = 0; i < z; i++)  
	        System.out.print(a[i] + " ");  
	} 
	
	

public static void main(String[] args) {
	
	int a[] = { 11, 30, 24, 7, 31, 16, 39, 41 }; 
	int z = a.length; 
	Merge_sort m1 = new Merge_sort();
	System.out.println("Before sorting:"); 
	m1.printArray(a, z);
	m1.mergeSort(a, 0, z - 1);
	System.out.println("");
	System.out.println("After sorting:"); 
	m1.printArray(a, z);
	System.out.println("");  
		     
		}  

	}


