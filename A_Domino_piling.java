import java.util.Scanner;

public class A_Domino_piling {
    public static void main(String[] args) {
        int m,n;

        Scanner sc= new Scanner(System.in);
        m= sc.nextInt();
        n= sc.nextInt();

        int tiles= (n*m)/2;

        System.out.println(tiles);
    }
}