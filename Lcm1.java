import java.util.*;
class Lcm1
{
public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int a,b,c,largest,lcm=0,i;
      System.out.println("enter the value of a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
       largest=(a<b && a>c)?a:b;
	for(i=1;i<=largest;i++)
       {
	if(largest%a==0 && largest%b==0)
	lcm=largest;
	  break;
	}
	largest++;
       
    }
}