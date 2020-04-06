import java.util.Scanner;
public class exc3
{
static void setdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first no");
int n1=sc.nextInt();
System.out.println("enter second  no");
int n2=sc.nextInt();
int num=n1/n2;
System.out.print(   num  );
}
static void showresult()
{
try
{
System.out.println("=    result" );
}

catch(ArithmeticException e)
{
System.out.println("can't divide a no by zero");
}

}
public static void main(String args[])
{
try
{
setdata();
showresult();
}
catch(ArithmeticException e)
{
System.out.println("can't divide a no by zero");
}
try
{
int num= Integer.parseInt ("abc") ; 
 System.out.println(num); 
}
catch(NumberFormatException e)
 { 
 System.out.println("Number format exception"); 
}

}
}

