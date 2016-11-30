import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class StringReverseComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}

class IntegerReverseComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}


public class MyComparator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mystringlist=new ArrayList<String>();
		List<Integer> myintegerlist=new ArrayList<Integer>();
		mystringlist.add("tiger");
		mystringlist.add("lion");
		mystringlist.add("girrafee");
		mystringlist.add("swan");
		mystringlist.add("buffalo");
		for(int i=1;i<=10;i++)
		{
			myintegerlist.add(i);
		}
		
		//Sorting stringlist in reverse order using comparator
		System.out.println("Sorting Stringlist in reverse order");
		Collections.sort(mystringlist,new StringReverseComparator());
		for(String item:mystringlist)
		{
			System.out.println(item);
		}
		//Sorting integerlist in reverse order using comparator
		System.out.println("Sorting Integerlist in reverse order");
		Collections.sort(myintegerlist,new IntegerReverseComparator());
		for(Integer item:myintegerlist)
		{
			System.out.println(item);
		}
	}

}
