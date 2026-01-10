import java.util.Scanner;

public class B_Left_and_Down {
    public static long getGcd(long a, long b)
    {
        while(b!=0)
        {
            long temp=b;
            b= a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long cases= sc.nextLong();

        for(long i=0; i<cases; i++)
        {
            long a= sc.nextLong();
            long b= sc.nextLong();
            long k= sc.nextLong();

            long gcd= getGcd(a, b);
            if((a/gcd)<=k && (b/gcd)<=k)
                System.out.println("1");
            else
                System.out.println("2");
        }
    }
}
