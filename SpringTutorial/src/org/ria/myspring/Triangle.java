package org.ria.myspring;

public class Triangle {
	private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	//Constructor Injection,will use constructor-arg tag
	
    public Triangle(String type) {
		super();
		this.type = type;
	}
    
    public Triangle(int height) {
		super();
		this.height = height;
	}
    
    public Triangle(String type,int height) {
		super();
		this.type=type;
		this.height = height;
	}


	//Setter Injection..In spring.xml ,property tag is used
	/*public void setType(String type) {
		this.type = type;
	}*/

	public void draw()
	{
		System.out.println(type+" : Triangle drawn with height :"+height);
	}

}
