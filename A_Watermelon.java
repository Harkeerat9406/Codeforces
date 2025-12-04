import java.util.Scanner;
public class A_Watermelon
{
    public static void main(String[] args) {
        int w;
        Scanner sc= new Scanner(System.in);
        w= sc.nextInt();
        if(w<=2) return;
        if(w%2==0)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}   