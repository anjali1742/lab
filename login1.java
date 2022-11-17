//airline ticketing
package airline;//package and package name

import java.lang.*;//import the needed packages
import java.util.Scanner.*;
import java.util.*;
class InvalidUserException extends Exception//create user defined exception
{
	public void InvalidUserException()//non param constructor
	{
	}
}

public class Login1
{
	 public void validate()throws InvalidUserException
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter id:");
	    int id=sc.nextInt();//input from the keyboard
	     System.out.println("Enter password:");
	      String password=sc.next();
		
			
		if(id!=12 && password!="regi")//check the condion
			throw new InvalidUserException();//throw invaliduserException
		
		else
			System.out.println("Enter to Book Flight");//enter to book flight
		
		
		
		
	}
public static void main(String[] args)throws InvalidUserException
{
	
	Login1 l=new Login1();//object creation
	
    l.validate();//method calling
	
	
	
}
}