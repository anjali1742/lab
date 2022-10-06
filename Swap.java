//wrp on swap of integers,double using method overloading.
class Add
{
void swap(int x,int y)
{
int t;
t=x;
x=y;
y=t;
System.out.println(x+""+y);
}
void swap(double x,double y)
{
double t;
t=x;
x=y;
y=t;
System.out.println(x+""+y)
}
public static void main(String[] args)
{
Add a=new Add();
a.swap(10,20);//integer swap
a.swap(123124242,454556667);//double swap
}
}