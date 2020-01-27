
public class Solution {
	
	public static int minCount(int n) {
	
        
        int dp[]=new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        
        int res = n;
        
        for(int i=4;i<=n;i++)
        {  
           int min = Integer.MAX_VALUE;   
           for(int j = 1 ; j*j<=i;j++)
           {
               int temp = 1 + dp[i-(j*j)];
               
               min = temp < min ? temp : min;
           }
            
           dp[i] = min;
        }
        return dp[n] ;
	}

	
}
