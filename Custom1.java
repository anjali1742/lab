//wrp to demo user defined exception
class InvalidAgeException extends Exception
{
	public InvalidAgeException()//default ctr
	{

	}
}
class Custom1
{
static void check(int age) throws InvalidAgeException
{
if(age<18)
	throw new InvalidAgeException();
else
	System.out.println("valid age");
}
public static void main(String[] args) throws InvalidAgeException
{
	Custom1 c1= new Custom1();	
	check(17);
}
}