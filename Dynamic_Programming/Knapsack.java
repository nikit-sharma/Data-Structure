
public class Solution {
	
	
	
	public static int knapsack(int[] weight,int value[],int capacity){

        int n = weight.length;
        int dp[] = new int[capacity+1];
        
        java.util.Arrays.fill(dp, 0);
        
        for ( int i = 0 ; i < n ; i++ )
        {
            for( int j = capacity ; j >= weight[i] ; j--)
            {
                dp[j] = Math.max(dp[j], value[i]+ dp[j - weight[i]]);
            }
        }
        
        
		return dp[capacity];
	}
	
}
