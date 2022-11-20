4.create student.txt files and store into emp table

sql query

create database employee

use employee

create table emp2(filename varchar(20),fileinfo longtext)

select * from emp2

jdbc program

package first;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FileEx {

	public static void main(String[] args) throws SQLException,ClassNotFoundException, FileNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "admin");
		PreparedStatement stmt=con.prepareStatement("insert into emp2 values(?,?)");
		File f=new File("e:\\Students.txt");
		FileReader fr=new FileReader(f);
		stmt.setString(1, "Student");
		stmt.setCharacterStream(2, fr,(int)f.length());
		int i=stmt.executeUpdate();
		System.out.println(i+"row inserted");
		con.close();


	}

}




this is my student.txt file

student details


1 Anjali 472 computer science
2 Siva 390 chemistry
3 abc 350 science
4 sundar 490 maths