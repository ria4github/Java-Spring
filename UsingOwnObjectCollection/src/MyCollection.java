import java.util.LinkedHashMap;
import java.util.Map;

class Person
	{
		private int uniqueid;
		private String name;
		Person(int id,String nm)
		{
			uniqueid=id;
			name=nm;
		}
		public int getUniqueid() {
			return uniqueid;
		}
		public void setUniqueid(int uniqueid) {
			this.uniqueid = uniqueid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + uniqueid;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (uniqueid != other.uniqueid)
				return false;
			return true;
		}
		
		
		
	}
public class MyCollection {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person P1=new Person(1,"Ria");
		Person P2=new Person(2,"Rahul");
		Person P3=new Person(3,"Rohan");
		Person P4=new Person(2,"Rahul");
		Map<Person,Integer> linkedhashmap=new LinkedHashMap<Person,Integer>();
		linkedhashmap.put(P1,1);
		linkedhashmap.put(P2,2);
		linkedhashmap.put(P3,3);
		linkedhashmap.put(P4,2);
		for(Person p:linkedhashmap.keySet())
		{
			System.out.println(p.getName()+" : "+p.getUniqueid()+":---Valie--->"+linkedhashmap.get(p));
		}
		
		
		


	}

}
