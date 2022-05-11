import java.util.Scanner;  
public class PerfectSquare 
{   
  
static boolean PerfectSquare(double number)    
{   

double sqrt=Math.sqrt(number);   
  
return ((sqrt - Math.floor(sqrt)) == 0);   
}   
  
  
public static void main(String[] args)    
{   
System.out.print("Enter any number: ");  
  
Scanner sc=new Scanner(System.in);  
 
double number=sc.nextDouble();   
 
if (PerfectSquare(number))   
System.out.print("Yes, number is perfect square.");   
else  
System.out.print("No, number is not perfect square.");   
  }   
}   
