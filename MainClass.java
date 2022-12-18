package Mcq;
import java.util.*;
public class MainClass 
{
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter ur rollno");
	  int rollno=sc.nextInt();
	  System.out.println("Enter ur name");
	  String name=sc.next();
	  
	  
	  Students1 student=new Students1();
	  student.setRollno(rollno);
	  student.setName(name);
	  
	  
	  Question qn=new Question();
	  System.out.println("which you want choose");
	  System.out.println("1 GK Question / 2 Maths Question");
	  int suboption=sc.nextInt();
	  
	  
	  if(suboption==2)
	  {
		  Questions.mathsQuestions();
		  Questions.gkQuestions();
		  
		  
	  }
	  
	  else
	  {
		  Questions.gkQuestions();
		  Questions.mathsQuestions();
		   
	  }
	  System.out.println("Success");
	  System.out.println("Maths marks:" +Questions.student.getMathsMarks());
	  System.out.println("GK marks:" +Questions.student.getGkMarks());
	  
	  if((Questions.student.getMathsMarks()+Questions.student.getGkMarks())>10)
	  {
		  System.out.println("congrats");
	  }
	  else
	  {
		  System.out.println("To improve yourself");
	  }
	  
	  System.out.println("Do you want key paper?1/0");
	  int option=sc.nextInt();
	  if(option==1)
	  {
		  Questions.printKeyPaper();
	  }
  }
  
}
