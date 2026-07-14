import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        while(cases-- > 0)
        {
            int n= sc.nextInt();
            long arr[]= new long[n];
            for(int i=0; i<n; i++)
            {
                arr[i]= sc.nextInt();
            }
 
            boolean broke= false;
            for(int i=0; i<n-1; i++)
            {
                long diff= arr[i] - (i+1);
                arr[i]= i+1;
                arr[i+1]+= diff;
 
                if(arr[i]>=arr[i+1] || diff<0)
                {
                    broke= true;
                    System.out.println("NO");;
                    break;
                }
            }
            if(!broke)
                System.out.println("YES");
        }
    }
}