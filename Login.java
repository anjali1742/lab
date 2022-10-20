//using throws ,throw keyword
import java.util.Scanner;
class InvalidLoginException extends Exception//custom exception
{
	public InvalidLoginException(String s)//parameter constructor
	{
		super(s);
	}
}
class Login
{	
	static String uname;
	 static int pwd;
	void input()
	{
		Scanner sc=new Scanner(System.in);//get the input
		System.out.println("enter user name:");
	   uname=sc.nextLine();
	  System.out.println("enter password:");
	   pwd=sc.nextInt();
	}
	
	 static void output(String x,int y)throws InvalidLoginException//throws invlid login excepton
	{
		 
	  	if(x!="anudip"&& y!=2576)
			throw new InvalidLoginException("invalid login");//throw invalid login
			else
						System.out.println("valid login");//valid login

       
	}
	
    public static void main(String[] args)throws InvalidLoginException
	{
       Login l=new Login();//object cretaion
	  l.input();
	  output(uname,pwd);
       
	}
	
}
