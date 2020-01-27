public class solution {

	public  String solve(int n,int x,int y){
        
        
        int dp[]=new int [n+1];
	    dp[0]=1;
        dp[1]=1;
        dp[x]=1;
        dp[y]=1;
        
        for(int i=2;i<=n;i++)
        {
            int m1 = i-1; 2
            int mx = i-x; 1
            int my = i-y;  0
            
            if(i==x||i==y)
                dp[i] = 1;
            else if(i>=x&&dp[mx]%2==0) 3>=2 
                dp[i] = dp[mx]+1;
            else if(i>=y && dp[my]%2==0 )   
                dp[i] = dp[my]+1;
            else
                dp[i] = dp[m1]+1; 1+1; 
        }
        
       
        if(dp[n]%2!=0)
          return "Beerus";
        else
            return "Whis";
	}
	
}