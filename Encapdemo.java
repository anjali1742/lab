//wrp on Encapsualtion
class Encapsulation
{
	private int sid;//members
	private String sname;
	public void setSid(int sid)//setter
	{
		this.sid=sid;
	}
	public void setSname(String y)//setter
	{
		sname=y;
	}
	public int getSid()//getter
	{
		return sid;
	}
	public String getSname()//getter
	{
		return sname;
	}
	
}
public class Encapdemo
{
	public static void main(String[] args)
	{
		Encapsulation e=new Encapsulation();
		e.setSid(10);
		e.setSname("anjali");
		System.out.println(e.getSid());
		System.out.println(e.getSname());
	}
}