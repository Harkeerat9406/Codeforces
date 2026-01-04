import java.util.Scanner;

public class A_Be_Positive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int arr[]= new int[n];
            int minusCount=0, zeroCount=0;
            
            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
                if(arr[j] == 0)
                    zeroCount++;
                else if(arr[j] ==-1)
                    minusCount++;
            }

            int ops= zeroCount;
            if(minusCount%2!=0)
                ops+= 2;

            System.out.println(ops);
        }
    }
}