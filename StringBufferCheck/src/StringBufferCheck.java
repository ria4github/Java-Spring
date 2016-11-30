
public class StringBufferCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer mystr=new StringBuffer("Ria");
		//append
		mystr.append("Guha");
		System.out.println(mystr);
		//insert
		mystr.insert(1, "Inserted");
		System.out.println(mystr);
		//replace
		mystr.replace(0, 2, "Bi");
		System.out.println(mystr);
		mystr.reverse();
		System.out.println(mystr);
		System.out.println(mystr.substring(0,3));
		
		
		

	}

}
