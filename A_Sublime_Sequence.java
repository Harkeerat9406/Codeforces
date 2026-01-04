import java.util.Scanner;

public class A_Sublime_Sequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        for(int i=0; i<cases; i++)
        {
            int x= sc.nextInt();
            int n= sc.nextInt();

            if(n%2==0)
                System.out.println("0");
            else
                System.out.println(x);
        }
    }
}