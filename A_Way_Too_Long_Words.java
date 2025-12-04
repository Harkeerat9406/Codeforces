import java.util.*;
public class A_Way_Too_Long_Words
{ 
    public static void Word_check(String st)
    {
        int len= st.length();
        if(st.length()<=10)
        System.out.println(st);
        
        else
        {
            String sub= st.substring(1, len-1);
            System.out.println(""+st.charAt(0)+sub.length()+st.charAt(len-1)); 
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++)
        {
            String st= sc.next();
            Word_check(st);
        }
        sc.close();
    }
    
    
}