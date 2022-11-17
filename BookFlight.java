//book flight class
package airline2;//
import airline4.*;//import packages
import java.lang.*;
import java.util.Scanner.*;
import java.util.*;




 public class BookFlight//class name bookid
{
	
		private int bookid;//data members with private variables
		private int flightid;
		private String classtype;
		private String dateof_journey;
		private String dateof_booking;
		private int no_of_adults;
		private int no_of_childs;
		private String gender;
		private int ticketfare;
		private int customerid;
		
		void setBookid(int x)//set the bookid
		{
			bookid=x;
		}
		int getBookid()//get the bookid
		{
			return bookid;
		}
		
		void setFlightid(int x)//setflightid
		{
			flightid=x;
		}
		int getFlightid()//get the flightid
		{
			return flightid;
		}
		
		void setClasstype(String x)//set the classtype
		{

			classtype=x;
		}
		String getClasstype()//get the classtype
		{
			return classtype;
		}
		
		
		void setDateof_journey(String x)
		{
			dateof_journey=x;
		}
		String getDateof_journey()
		{
			return dateof_journey;
		}
		
		
		void setDateof_booking(String x)//set the dateof_booking
		{
			dateof_booking=x;
		}
		String getDateof_booking()//get the dateof_booking
		{
			return dateof_booking;
		}
		
		
		void setNo_of_adults(int x)//set the no_of_adults
		{
			no_of_adults=x;
		}
		int getNo_of_adults()//get the no_of_adults
		{
			return no_of_adults;
		}
		
        void setNo_of_childs(int x)//set the no_of_childs
		{
			no_of_childs=x;
		}
		int getNo_of_childs()//get the no of adults
		{
			return no_of_childs;
		}
		
        void setGender(String x)//set the gender
		{
			gender=x;
		}
		String getGender()//get the gender
		{
			return gender;
		}
		
		void setTicketfare(int x)//set the ticketfare
		{
             ticketfare=x;
		}
		int getTicketfare()//get the ticketfare
		{
			return ticketfare;
		}
		
		
		void setCustomerid(int x)//set the customerid
		{
             customerid=x;
		}
		int getCustomerid()//get the customerid
		{
			return customerid;
		}
		public String toString()
		{
			return bookid+" " +flightid+" " +classtype+" " +dateof_journey+" "+dateof_booking+" "+no_of_adults+" "+no_of_childs+" "+gender+" "+ticketfare+" "+customerid;
		}
		
		
	

	public static void main(String[] args)//throws InvalidUserException
	{
		
		
		BookFlight b=new BookFlight();//object creation
		
		
		ArrayList<BookFlight> bl=new ArrayList<BookFlight>();//arraylist class
		System.out.println("Enter the booking details:");
		b.setBookid(002);
		b.setFlightid(12);
		b.setClasstype("First class");
		b.setDateof_journey("seven days");
		b.setDateof_booking("nov seven");
		b.setNo_of_adults(5);
		b.setNo_of_childs(3);
		b.setGender("Female");
		b.setTicketfare(4500);
		b.setCustomerid(112);
		
		System.out.println("Bookid:" +b.getBookid());
		System.out.println("Flightid:" +b.getFlightid());
		System.out.println("classtype:" +b.getClasstype());
		System.out.println("dateof_journey:" +b.getDateof_journey());
		System.out.println("dateof_booking:" +b.getDateof_booking());
		System.out.println("no_of_adults:" +b.getNo_of_adults());
		System.out.println("no_of_childs:" +b.getNo_of_childs());
		System.out.println("gender:" +b.getGender());
		System.out.println("ticketfare:" +b.getTicketfare());
		System.out.println("customerid:" +b.getCustomerid());
		System.out.println();
		
		bl.add(b);//add the details in collection
		System.out.println("Strore the details in collection using arraylist:");
		ListIterator it=bl.listIterator();
		while(it.hasNext())//using hasnext() details are printed in forward direction 
		{
			System.out.println(it.next());
		}
	}
}
