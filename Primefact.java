import java.util.*;
class Primefact
{
public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int i,n;
      System.out.println("enter the value of n");
      n=sc.nextInt();
	for(i=2;i<n;i++)
	{
	while(n%i==0)
	{
	System.out.println(i+" ");
         n=n/i;
        }   
     }
   if(n>2)
    System.out.println(n);
  }
}