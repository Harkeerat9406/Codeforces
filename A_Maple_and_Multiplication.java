import java.util.Scanner;

public class A_Maple_and_Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a==b)
                System.out.println("0");
            else if(a%b==0 || b%a==0)
                System.out.println("1");
            else
                System.out.println("2");
        }
    }
}