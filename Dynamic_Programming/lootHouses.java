
public class Solution {
	public static int getMaxMoney(int arr[], int n){

		
        
        int dp[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                dp[i]=arr[i];            
            }
            else if(i==1)
            {
                dp[i]=arr[i]>arr[i-1]?arr[i]:arr[i-1]; 
            }
            else 
            {
                int a=arr[i]+dp[i-2];
                int b=dp[i-1];
                dp[i]=a>b?a:b;               
            }
        }
        
   return dp[n-1];     
        
        
        

	}
}
