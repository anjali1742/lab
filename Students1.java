package Mcq;
import java.util.*;
public class Students1 
{
   private int rollno;
   private String name;
   private int GkMarks;
   private int  mathsMarks;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getGkMarks() {
	return GkMarks;
}
public void setGkMarks(int gkMarks) {
	this.GkMarks = gkMarks;
}
public int getMathsMarks() {
	return mathsMarks;
}
public void setMathsMarks(int mathsMarks) {
	this.mathsMarks = mathsMarks;
}
}

 class Options
{
	 LinkedHashMap<Character,String> options=new LinkedHashMap<Character,String>();
}
 
 class Test1
{
	 LinkedHashMap<Question,Options> subject=new LinkedHashMap<Question,Options>();
}
 
 class Test2
{
	 LinkedHashMap<Question,Options> subject=new LinkedHashMap<Question,Options>();
}
	