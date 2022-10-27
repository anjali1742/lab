import java.util.*;
class HashLinkTree
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"priya");//add the details
		hm.put(2,"Rahul");
		hm.put(3,"ram");
		System.out.println("Initial list of elements:");
		for(Map.Entry m:hm.entrySet())//print the details using for each loop
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		hm.putIfAbsent(4,"karthick");
		System.out.println("After invoking putIfAbsent() method:");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		HashMap<Integer,String> hm1=new HashMap<Integer,String>();
		hm1.put(5,"Akash");
		hm.putAll(hm1);//insertion
		System.out.println("After Inserting some details:");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		hm.remove(3);//removing details
		System.out.println("After removing some details:");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		hm.replace(2,"Surya");//updation details
		System.out.println("After updation some details:");
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		
		
		
		
		//Linked Hash Map details
		System.out.println("Linked Hash map details:");
		LinkedHashMap<Integer,String> lm1=new LinkedHashMap<Integer,String>();
		lm1.put(11,"kavya");
		lm1.put(12,"nancy");
		for(Map.Entry m:lm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		LinkedHashMap<Integer,String>lm2=new LinkedHashMap<Integer,String>();
		lm2.put(13,"siva");//insertion
		lm1.putAll(lm2);
		System.out.println("After Inserting some details:");
		for(Map.Entry m:lm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		lm1.remove(12);//removing
		System.out.println("After removing some details:");
		for(Map.Entry m:lm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		lm1.replace(11,"shyam");//replace
		System.out.println("After updation ramya replace  to raju some details:");
		for(Map.Entry m:lm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		
		
		
		//treemap details
		
		
	    System.out.println("Tree map details:");
		TreeMap<Integer,String> tm1=new TreeMap<Integer,String>();
		tm1.put(11,"kavya");
		tm1.put(12,"nancy");
		for(Map.Entry m:tm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		TreeMap<Integer,String>tm2=new TreeMap<Integer,String>();
		tm2.put(13,"siva");//insertion
		tm1.putAll(tm2);
		System.out.println("After Inserting some details:");
		for(Map.Entry m:tm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		tm1.remove(12);//removing
		System.out.println("After removing some details:");
		for(Map.Entry m:tm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		tm1.replace(11,"shyam");//updation
		System.out.println("After updation ramya replace  to raju some details:");
		for(Map.Entry m:tm1.entrySet())
		{
			System.out.println(m.getKey()+ "  ,  " +m.getValue());
		}
		
		
		
		
	}
}