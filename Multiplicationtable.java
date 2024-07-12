import java.util.*;
class Multiplicationtable
{
public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int i,n;
      System.out.println("enter the value of n");
      n=sc.nextInt();
	for(i=1;i<=10;i++)
	{
	 System.out.println(n+ " x " +i+ " = " +(n*i));
	}
    }   
}  
