import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void variations(int legs)
    {
        if(legs%2!=0)
        {
            System.out.println("0");
            return;
        }
        int cows= legs/4;
        System.out.println(cows+1);
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        for(int i=0; i<cases; i++)
        {
            int legs= sc.nextInt();
            variations(legs);
        }
        sc.close();
    }
}
