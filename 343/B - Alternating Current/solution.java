import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Alternating_current
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
	    String s= sc.next();
	    int n= s.length();
	    Stack<Character> stack= new Stack<>();
	    
	    for(int i=0; i<n; i++)
	    {
	        char ch= s.charAt(i);
	        if(ch=='-')
	        {
	            if(!stack.isEmpty() && stack.peek() == '-')
	                stack.pop();
	            else
	                stack.push(ch);
	        }
	        else if(ch=='+')
	        {
	            if(!stack.isEmpty() && stack.peek()=='+')
	                stack.pop();
	            else 
	                stack.push(ch);
	        }
	    }
	    if(stack.size()!=0)
	        System.out.println("No");
	    else
	        System.out.println("Yes");
	    
	}
}