
public class Solution {
	
		
public static long staircase(int n){
		
	
    long dp[]=new long[n+1];
    
     dp[0]=1;
     dp[1]=1;
     dp[2]=2;
     
    
    for(int i=3;i<=n;i++)
    {
       long a=dp[i-3];
        long b= dp[i-2];
       long c= dp[i-1];
        
        long min= a+b+c;
        dp[i]=min;
    }
    
    return dp[n];
    
	}
	
}
