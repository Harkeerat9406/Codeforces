import java.util.Scanner;
 
/**
 * https://codeforces.com/contest/2241/problem/D
 * DAnAlternativeWay
 */
public class DAnAlternativeWay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        while(cases-- >0)
        {
            int n= sc.nextInt();
            int a[]= new int[n];
            int b[]= new int[n];
 
            for(int i=0; i<n; i++)
            {
                a[i]= sc.nextInt();
            }
 
            for(int i=0; i<n; i++)
            {
                b[i]= sc.nextInt();
            }
 
            long prefA= 0, prefB=0;
            boolean found= false;
 
            for(int i=0; i<n; i++)
            {
                prefA+= a[i];
                prefB+= b[i];
 
                if(prefA > prefB)
                {
                    found= true;
                    System.out.println("NO");
                    break;
                }
            }
            if(!found)
                System.out.println("YES");
        }
    }
}