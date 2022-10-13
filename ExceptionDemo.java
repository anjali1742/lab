//wrp using nested try
public class ExceptionDemo
{
public static void main (String[] args)
{
try//outer try
{
	try
	{
	  String s1=null;
	  System.out.println(s1.length());
	}
	catch(NullPointerException e)
	{
	  System.out.println("null");
	}
	try
	{
	  int[] x={10,20,30};
	  System.out.println(x[4]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	  System.out.println("out of range");
	}
}
catch(Exception e)
{
System.out.println(e);
}
}
}