
public class Solution {
	public static int editDistance(String str, String str1){		
	
    int dp[][]=new int[str.length()+1][str1.length()+1];
        
        for(int i = 0 ; i <= str.length() ; i++)
        {
            for(int j = 0 ; j <= str1.length() ; j++)
            {
                if(i==0)
                    dp[i][j] = j;
                
                else if(j==0)
                    dp[i][j] = i;
                    
                else if (str.charAt(i-1) == str1.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                    
                else 
                {
                    dp[i][j] = (dp[i-1][j]<dp[i][j-1]?(dp[i-1][j]<dp[i-1][j-1]?dp[i-1][j]:dp[i-1][j-1]):(dp[i][j-1]<dp[i-1][j-1]?dp[i][j-1]:dp[i-1][j-1]))+1;
                }
            }
        }
       
        return dp[str.length()][str1.length()];
		
	}
}
