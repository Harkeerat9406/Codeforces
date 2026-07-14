import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        while(cases-- >0)
        {
            int n= sc.nextInt();
            String s= sc.next();
            int longest=0, curr=0;
 
            for(int i=0; i<n; i++)
            {
                if(s.charAt(i)=='*')
                {
                    longest= Math.max(longest, curr);
                    curr=0;
                }
                else
                    curr++;
            }
            longest= Math.max(longest, curr);
            System.out.println((longest+2-1)/2);
        }
    }
}