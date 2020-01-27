
public class Solution {

	
	public static int countWaysToMakeChange(int denominations[], int value){
	
        
        int dp[] = new int[value+1];
        
        java.util.Arrays.fill(dp,0);
        
        dp[0] = 1;
        
        for(int i = 0 ; i < denominations.length ; i++)
        {
            for(int j = denominations[i] ; j <= value ; j++)
            {
                dp[j] = dp[j] + dp[j-denominations[i]];
            }
        }
        return dp[value];

	}
	
}
