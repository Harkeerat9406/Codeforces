import java.util.Scanner;

public class A_Word_Capitalization {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        StringBuilder sb= new StringBuilder(sc.next());

        char ch= sb.charAt(0);
        if(ch>=97)
        {
            String upper= String.valueOf(Character.toTitleCase(ch));
            sb.replace(0, 1, upper);
        }
        
        System.out.println(sb);
    }
}