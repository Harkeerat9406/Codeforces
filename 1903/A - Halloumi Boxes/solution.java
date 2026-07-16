import java.util.*;
public class Main {
 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
 
        while(cases-- >0)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int arr[]= new int[n];
            boolean sorted= true;
 
            for(int i=0; i<n; i++)
            {
                arr[i]= sc.nextInt();
                if(i>0)
                {
                    if(arr[i]<arr[i-1])
                        sorted= false;
                }
            }
 
            if(k>=2 || (k==1 && sorted))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}