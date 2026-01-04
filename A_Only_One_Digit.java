import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;

public class A_Only_One_Digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int digit=10;
            int n= sc.nextInt();
            while(n!=0)
            {
                digit= Math.min(digit, n%10);
                n/=10;
            }
            System.out.println(digit);
        }
    }
}