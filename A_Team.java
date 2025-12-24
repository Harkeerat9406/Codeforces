import java.util.Scanner;

public class A_Team 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int problems= sc.nextInt();
        int solved= 0;
        for(int i=0; i<problems; i++)
        {
            int sum=0;
            for(int j=0; j<3; j++)
            {
                sum+= sc.nextInt();
            }
            if(sum>=2)
                solved++;
        }
        System.out.println(solved);
    }
}