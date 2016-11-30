import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al1=new ArrayList<Integer>();
		List<Integer> ll2=new LinkedList<Integer>();
		
		doTimings("ArrayList",al1);
		doTimings("LinkedList",ll2);
	}
	public static void doTimings(String type,List<Integer> mylist)
	{
		for(int i=0;i<1E5;i++)
		{
			mylist.add(i);
		}
		long start=System.currentTimeMillis();
		
		/*Adding at end -- Arraylist is faster
				for(int i=0;i<1E5;i++)
				{
					mylist.add(i);
				}*/
		
		/*Adding at beginning -- Arraylist is slower
		for(int i=0;i<1E5;i++)
		{
			mylist.add(0,i);
		}*/
		
		long end=System.currentTimeMillis();
		System.out.println(type+" "+(end-start)+"ms");
		
		
	}

}
