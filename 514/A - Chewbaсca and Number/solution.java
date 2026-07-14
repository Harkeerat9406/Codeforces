import java.util.Scanner;
/**
 * AChewbaсcaAndNumber
 */
public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n= sc.nextLong();
        long m= n, num=0, pow10= 1;
 
        while(m>0)
        {
            long dig= m%10;
            m/=10;
 
            if(dig < 9-dig || m==0 && dig==9)
            {
                num= num+ dig*(pow10);
            }
            else
            {
                num+= (9-dig)*(pow10);
            }
            pow10*= 10;
        }
        System.out.println(num);
    }
}