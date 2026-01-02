import java.util.Scanner;

public class A_Boy_or_Girl {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.next();

        int freq[]= new int[26];
        
        for(int i=0; i<name.length(); i++)
        {
            char ch= name.charAt(i);
            freq[ch-97]++;
        }

        int dist= 0;
        for(int f: freq)
        {
            if(f>=1)
                dist++;
        }
        if(dist%2==0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
        
    }
}