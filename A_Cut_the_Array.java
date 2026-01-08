import java.util.Scanner;

public class A_Cut_the_Array {
    public static void findLimits(int arr[], int n)
    {
        long total= 0;
        for(int i=0; i<n; i++)
        {
            total+= arr[i];
        }

        if(total%3!=0)
        {
            System.out.println("0 0");
            return;
        }

        long sum1=0;
        for(int l=0; l<n-2; l++)
        {
            sum1+= arr[l];
            long s1= sum1%3;
            
            long sum2= 0;
            for(int r= l+1; r<n-1; r++)
            {
                sum2+= arr[r];
                long s2= sum2%3;

                long sum3= total - sum2 - sum1;
                long s3= sum3%3;
                
                boolean equal= s1==s2 && s2==s3;
                boolean notEqual= s1!=s2 && s1!=s3 && s2!=s3;

                if(equal || notEqual)
                {
                    System.out.println((l+1)+" "+(r+1));
                    return;
                }
            }
        }
        System.out.println("0 0");
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

            findLimits(arr, n);
        }
    }
}