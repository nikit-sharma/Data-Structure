
public class Solution {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		
     
        int row=input.length; //row
        int col=input[0].length; //col
        
        int dp[][]=new int[row][col];
        
       // last row without last cell 
     for(int i=0;i<col;i++)
     {
         if(input[row-1][i]==1)
         {
             dp[row-1][i]=0;
         }
         else
             dp[row-1][i]=1;
     }
        
        // last col without last cell
        
        for(int i=0;i<row;i++)
        {
            if(input[i][col-1]==1)
            {
                dp[i][col-1]=0;
            }
            else
                dp[i][col-1]=1;
        }
        
        //last cell
        
     if(input[row-1][col-1]==1)
     {
         dp[row-1][col-1]=0;
     }
        else
           dp[row-1][col-1]=1;
        
        //rest of the matrix
        
        
        for(int i=row-2;i>=0;i--)
        {
            for(int j=col-2;j>=0;j--)
            {
                if(input[i][j]==0)
                {    
                int left=dp[i][j+1];
                int diag=dp[i+1][j+1];
                int down=dp[i+1][j];
                
                dp[i][j]=(left<diag?(left<down?left:down):(diag<down?diag:down))+1;
                }
                else
                    dp[i][j]=0;
                
            }
        }
        
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(dp[i][j]>max)
                    max=dp[i][j];
            }
        }
        
        return max;
        
        
        
        
	}

	
}