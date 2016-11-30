import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DifferentMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hashmap=new HashMap<Integer,String>();
		Map<Integer,String> linkedhashmap=new LinkedHashMap<Integer,String>();
		Map<Integer,String> treemap=new TreeMap<Integer,String>();
		System.out.println("Hashmap output");
		check(hashmap);
		System.out.println("LinkedHashMap output");
		check(linkedhashmap);
		System.out.println("TreeMap output");
		check(treemap);
		
		

	}
	public static void check(Map<Integer,String> map)
	{
		map.put(9, "fox");
		map.put(4, "pig");
		map.put(3, "swan");
		map.put(10, "tiger");
		map.put(12, "monkey");
		map.put(16,"crocodile");
		map.put(1, "snake");
		map.put(0, "buffalo");
		
		for(Integer mykey:map.keySet())
		{
			System.out.println(mykey+" : "+map.get(mykey));
		}
		
	}

}
