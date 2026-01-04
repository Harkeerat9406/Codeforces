import java.util.Scanner;

public class A_All_Lengths_Subtraction {
    public static void check(int arr[])
    {
        int l=0, r= arr.length-1;
        int need=1;

        while(l<=r)
        {
            if(need==arr[l])
            {
                need++;
                l++;
            }
            else if(need==arr[r])
            {
                need++;
                r--;
            }
            else
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int arr[]= new int[n];

            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
            }
            check(arr);
        }
    }
}