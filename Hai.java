//wrp on 'this' keywprd constructor chaining
class Hai
{
int a,b;
Hai()//no param
{
	this(10);//param ctr
System.out.println("no param ctr");
}
Hai(int x)//param ctr (ctr chaining)
{
	this(10,20);//2 para ctr
a=x;
System.out.println("a");
}
Hai(int x,int y)//param 2 ctr
{
a=x;
b=y;
System.out.println(a+""+b);
}
public static void main(String[] args)
{
Hai h2=new Hai();//param
}
}