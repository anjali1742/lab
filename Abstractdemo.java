//wrp on abstract class hirerchical inheritance
abstract class Shape
{
Shape()
{
System.out.println("abstract ctr");
}
void draw()
{
System.out.println("non abstract method");
}
}
class Circle extends Shape
{
void draw2()//method implementation
{
System.out.println("circle draw");
}
}
class Rectangle extends Shape
{
void draw3()
{
System.out.println("rectangle draw");
}
}
public class Abstractdemo
{
public static void main(String[] args)
{

//TODO Auto-generated method stub  

Circle c=new Circle();//base ctr
Rectangle r=new Rectangle();
c.draw();
c.draw2();
r.draw();
r.draw3();
}
}