import java.util.Scanner;
public class A_Legs
{
    public static void count(int n)
    {
        int cows= n/4;
        int remaining= n%4;
        int chicken= remaining/2;
        System.out.println(cows+chicken);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            count(n);
        }
        sc.close();
    }
}