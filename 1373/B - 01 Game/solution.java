import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        while(cases-- >0)
        {
            String s= sc.next();
            int n= s.length();
            int d0=0, d1=0;
            for(int i=0; i<n; i++)
            {
                if(s.charAt(i)=='1')
                    d1++;
                else
                    d0++;
            }
            
            int x= Math.min(d1, d0);
            if(x%2==0)
                System.out.println("NET");
            else
                System.out.println("DA");
        }
	}
}