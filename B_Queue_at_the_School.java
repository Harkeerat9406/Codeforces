import java.util.Scanner;

public class B_Queue_at_the_School {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int t= sc.nextInt();

        StringBuilder sb= new StringBuilder(sc.next());
        
        for(int j=0; j<t; j++)
        {
            for(int i=0; i<n-1;)
            {
                if(sb.charAt(i)=='B' && sb.charAt(i+1)=='G')
                {
                    sb.replace(i, i+1, "G");
                    sb.replace(i+1, i+2, "B");
                    i+=2;
                    continue;
                }
                i++;
            }
        }
        System.out.println(sb.toString());
        
    }
}