import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int cases= sc.nextInt();
		
		while(cases-- >0)
		{
		    int n= sc.nextInt();
		    Integer arr[]= new Integer[n];
		    
		    for(int i=0; i<n; i++)
		    {
		        arr[i]= sc.nextInt();
		    }
		    
		    Arrays.sort(arr, Collections.reverseOrder());
		    
		    long even=0, odd=0;
		    
		    for(int i=0; i<n; i++)
		    {
		        // Alice turn
		        if(i%2==0)
		        {
		            if(arr[i]%2==0)
		                even+= arr[i];
		            else
		                continue;
		        }		        
		        else
		        {
		            if(arr[i]%2!=0)
		                odd+= arr[i];
		            else
		                continue;
		        }
		    }
		
		if (even == odd)
                System.out.println("Tie");
            else if (even > odd)
                System.out.println("Alice");
            else
                System.out.println("Bob");
		}
	}
}