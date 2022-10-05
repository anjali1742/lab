import java.util.Scanner;

public class Student
{
    private String name;
    private int id;
    private int m1;
    private int m2;
    private int m3;
    private int maximum;
    private double average;

    public Student(String n, int a, int s1, 
    int s2, int s3) {
        name = n;
        id = a;
        m1 = s1;
        m2 = s2;
        m3 = s3;
    }

    public Student() {
        name = "";
        id = 0;
        m1 = 0;
        m2 = 0;
        m3 = 0;
        maximum = 0;
        average = 0;
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = in.nextLine();
        System.out.print("Enter id: ");
        id = in.nextInt();
        System.out.print("Enter Subject 1 Marks: ");
        m1 = in.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        m2 = in.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        m3 = in.nextInt();
    }

    public void compute() {
        if (m1 > m2 && m1 > m3)
            maximum = m1;
        else if (m2 > m1 && m2 > m3)
            maximum = m2;
        else
            maximum = m3;

        average = (m1 + m2 + m3) / 3.0;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Subject 1 Marks: " + m1);
        System.out.println("Subject 2 Marks: " + m2);
        System.out.println("Subject 3 Marks: " + m3);
        System.out.println("Maximum Marks: " + maximum);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String args[]) {
        Student obj = new Student();
        obj.accept();
        obj.compute();
        obj.display();
    }
}
