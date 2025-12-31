import java.util.Scanner;

public class A_Next_Round {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int students= sc.nextInt();
        int rank= sc.nextInt();
        int threshold= -1;

        int score[]= new int[students];
        for(int i=0; i<students; i++)
        {
            score[i]= sc.nextInt();
            rank--;
            if(rank==0)
                threshold= score[i];
        }

        int count=0;
        for(int i=0; i<students; i++)
        {
            if(score[i]>0 && score[i]>=threshold)
                count++;
            else 
                break;
        }
        System.out.println(count);
    }
}