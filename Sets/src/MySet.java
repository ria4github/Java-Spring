import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myhashset1=new HashSet<String>();
		Set<String> myhashset2=new HashSet<String>();
		Set<String> mylinkedhashset=new LinkedHashSet<String>();
		Set<String> mytreeset=new TreeSet<String>();
		//System.out.println("Hashset output");
		//check(myhashset);
		//System.out.println("LinkedHashSet output");
		//check(mylinkedhashset);
		//System.out.println("TreeSet output");
		//check(mytreeset);
		myhashset1.add("Elephant");
		myhashset1.add("Dog");
		myhashset1.add("Cat");
		myhashset1.add("Fish");
		
		myhashset2.add("Elephant");
		myhashset2.add("Dog");
		myhashset2.add("Tiger");
		myhashset2.add("Lion");
		
		//Intersection
		
		Set<String> intersection=new HashSet<String>(myhashset1);
		intersection.retainAll(myhashset2);
		System.out.println("Intersection");
		for(String item:intersection)
		{   
			System.out.println(item);
		}
		
		//System.out.println("-----------------");
		
		//Difference
		
		Set<String> difference=new HashSet<String>(myhashset1);
		difference.removeAll(myhashset2);
		System.out.println("Difference");
		for(String item:difference)
		{   
			System.out.println(item);
		}
		
		//Union
		Set<String> union=new HashSet<String>(myhashset1);
		for(String item:myhashset2)
		{
			union.add(item);
		}
		System.out.println("Union");
		for(String item:union)
		{   
			System.out.println(item);
		}
		
		

	}
	/*public static void check(Set<String> set)
	{
		set.add("Elephant");
		set.add("Dog");
		set.add("Lion");
		set.add("Pig");
		set.add("Pig");
		set.add("Cat");
		for(String item:set)
		{
			System.out.println(item);
		}
	}*/

}
