//write emp details eid,ename sal and store in "emp.txt"
import java.io.*;
public class Employee
{
	public static void main(String[] args)throws IOException
	{
		try
		{
       FileOutputStream fout=new FileOutputStream("d:\\emp.txt");//store d folder in employee details
	   DataOutputStream dout=new DataOutputStream(fout);//data outputstrem
       String s="Employee id:";
	   byte b[]=s.getBytes();//string convert into byte array
	   dout.write(b);//data write into files
	   
	  
	   String s1="123";
	   byte b1[]=s1.getBytes();//string convert into byte array
	   dout.write(b1);
	   System.out.println();
	   
	   String s2="Employee name:";
	   byte b2[]=s2.getBytes();//string convert into byte array
	   dout.write(b2);
	  
	   String s3="Subha";
	   byte b3[]=s3.getBytes();//string convert into byte array
	   dout.write(b3);
	    System.out.println();
	   
	   
	   String s4="Employee salary:";
	   byte b4[]=s4.getBytes();//string convert into byte array
	   dout.write(b4);
	   
	   String s5="15000";
	   byte b5[]=s5.getBytes();//string convert into byte array
	   dout.write(b5);
	    System.out.println();
	   
	   
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		//fout.close();
		//dout.close();
		System.out.println("success");
	}
}