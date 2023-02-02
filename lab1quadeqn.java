import java.util.*;
import java.lang.*;
class Krishn{
public static void main(String args[])
{
System.out.println("Enter the coefficients of the quadratic equations of the form ax^2+bx+c");
Scanner sc =new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d,r1,r2;
if (a==0)
{
System.out.println("Enter correct coefficients");
}
else
{
d=b*b-4*a*c;
if(d>0)
{
System.out.println("Real roots exist");
r1=(b+Math.sqrt(d))/2*a;
r2=(b-Math.sqrt(d))/2*a;
System.out.println("root 1 is "+r1);
System.out.println("root 2 is "+r2);
}
else if(d<0)
{
System.out.println("Real roots do not exist");
r1=b/2*a;
r2=(Math.sqrt(-d))/2*a;
System.out.println("root 1 is "+r1+"+ i" +r2);
System.out.println("root 2 is "+r1+"- i" +r2);
}
else
{
r1=r2=b/2*a;
System.out.println("root 1 is "+r1);
System.out.println("root 2 is "+r2);
}
}
}
}
