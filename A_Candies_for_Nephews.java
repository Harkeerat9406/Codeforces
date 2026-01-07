import java.util.Scanner;

public class A_Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int rem= n%3;
            int extra= (3-rem)%3;
            System.out.println(extra);
        }
    }
}