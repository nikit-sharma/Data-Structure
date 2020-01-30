public class Solution {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
         
        int c=0,nc=0;
        int pos1=-1,pos2=-1;
        
        for(int i=0;i<k;i++)
        {
            if(input[i]>input[k])
            {
                c++;
                pos1=i;
            }            
        }
        
        for(int i=k+1;i<input.length;i++)
        {
            if(input[i]>input[k])
            {
                c++;
                pos2=i;
            }
        }
        
        if(pos1!=-1)
        {
            for(int i=pos1+1;i<k;i++)
            {
                 if(input[i]==input[k])
                  nc++;         
            }
        }
       else
        {
            for(int i=pos2+1;i<input.length;i++)
            {
                 if(input[i]==input[k])
                  nc++;         
            }
           for(int i=0;i<k;i++)
           {
               if(input[i]==input[k])
                   nc++;
           }
        }
        
        return c+nc+1;
    
        
	}
}