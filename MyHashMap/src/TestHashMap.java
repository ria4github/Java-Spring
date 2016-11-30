import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4,"Four");
        String text=map.get(4);
        System.out.println(text);
        for(Map.Entry<Integer, String> entry:map.entrySet())
        {
        	System.out.println(entry.getKey()+" : "+entry.getValue());
        }

	}

}
