import java.util.*;
public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	    String n= sc.nextLine();
		
		String temp="";
		for(int i=n.length()-1;i>=0;i--)
		{
			temp=temp+n.charAt(i);
		}
		if(temp.equalsIgnoreCase(n))
		System.out.println("Palindrome String");
		else
			System.out.println("String is not Palindrome");
		
	}

}
