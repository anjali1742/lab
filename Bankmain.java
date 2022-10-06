//method override
class Bank
{
void interest()
{
System.out.println("interest is 0%");
}
}
class Sbi extends Bank
{
void interest()
{
System.out.println("interest is 7%");
}
}
class Axis extends Bank
{
void interest()
{
System.out.println("interest is 8%");
}
}
class Icic extends Bank
{
void interest()
{
System.out.println("interest is 9%");
}
}
class Bankmain
{
public static void main(String[] args)
{
Sbi s=new Sbi();
s.interest();
Axis a=new Axis();
a.interest();
Icic i=new Icic();
i.interest();
}
}