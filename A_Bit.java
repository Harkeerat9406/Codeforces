import java.util.Scanner;

public class A_Bit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ops= sc.nextInt();
        int x=0;
        for(int i=0; i<ops; i++)
        {
            String operation= sc.next();
            if(operation.equals("X++") || operation.equals("++X"))
                x++;
            else
                x--;
        }
        System.out.println(x);
    }
}