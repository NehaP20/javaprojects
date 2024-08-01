package MKT;

import java.util.HashMap;
import java.util.Map;

public class Map_Class 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> m1=new HashMap<String, Integer>();
		m1.put("Neha", 30); //put(String key, Integer value)
		m1.put("Nitesh", 28);
		m1.put("Abhaya", 31);
		m1.put("Asang", 28);

		System.out.println(m1);
		
		Map<String, Integer> m2=new HashMap<String, Integer>();
		m2.put("Narendra", 42); // putAll(Map<extends String, extends Value>m)
		m2.put("Shital", 34);
		m2.put("Pranaya", 10);
		m2.put("Shanaya",05);
		m2.putAll(m1);
		System.out.println(m2);
		
		Map<Integer, Float> m3= new HashMap<Integer, Float>();
		m3.put(42, 42.235f); 
		m3.put(11,34.5f);
		m3.put(10,12.35f);
		m3.put(15,325.5f);
		m3.putIfAbsent(10,12.35f);
		System.out.println(m3.containsKey(m3));
		System.out.println(m3);
		
	}

}
