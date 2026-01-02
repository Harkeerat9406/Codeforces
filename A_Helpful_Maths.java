import java.util.Scanner;

public class A_Helpful_Maths {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        int freq[]= new int[3];

        for(int i=0; i<s.length(); i++)
        {
            char ch= s.charAt(i);
            if(Character.isDigit(ch))
            {
                freq[ch-49]++;
            }
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0; i<freq[0]; i++)
            sb.append("1+");

        for(int i=0; i<freq[1]; i++)
            sb.append("2+");

        for(int i=0; i<freq[2]; i++)
            sb.append("3+");

        sb.deleteCharAt(sb.length()-1);

        System.out.println(sb.toString());
    }
}