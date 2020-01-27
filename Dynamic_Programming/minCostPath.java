public class Solution {
    
	public static int minCostPath(int arr[][]) {
	
            
        int m=arr.length;
        int n=arr[0].length;
        
        int dp[][]=new int[m][n];
      
        
       
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i==0 && j==0)
                {
                     dp[0][0] = arr[0][0];
                }
                else if (j==0)
                    dp[i][j] = dp[i-1][j]+arr[i][j];
                else if(i==0)
                    dp[i][j]=dp[i][j-1]+arr[i][j];
                else
                {
                    int left=dp[i][j-1];
                   int diag=dp[i-1][j-1];
                    int up=dp[i-1][j];
                    
                    dp[i][j]= (left<diag?(left<up?left:up):(diag<up?diag:up)) + arr[i][j];
                    
                }
            }
        }
        return dp[m-1][n-1];
    }
}