public class Solution {

    
   public static void heapify(int arr[],int s,int e)
   {
       int largest=s;
       int lc=2*s+1;
       int rc =2*s+2;
       
       if(lc<e && arr[largest]<arr[lc])
           largest=lc;
       if(rc<e && arr[largest]<arr[rc])
           largest=rc;
       
       if(largest!=s)
       {
           int temp=arr[largest];
           arr[largest]=arr[s];
           arr[s]=temp;
           
           heapify(arr,largest,e);
       }
   }
    
    public static void heapSort(int arr[],int size)
    {
        for(int i=size/2+1;i>=0;i--)
        {
            heapify(arr,i,size);
        }
        
        for(int i=size-1;i>=0;i--)
        {
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            heapify(arr,0,i);
        }
        
    }
    
	public static int kthLargest(int arr[], int k) {
		
        heapSort(arr,arr.length);
       return arr[arr.length-k]; 
        
        
        
        
        
	}
}
