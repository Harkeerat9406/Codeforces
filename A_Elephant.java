import java.util.Scanner;

public class A_Elephant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int moves=0; 

        for(int i=5; i>=1; i--)
        {
            moves+= n/i;
            n%=i;
        }
        System.out.println(moves);
    }
}