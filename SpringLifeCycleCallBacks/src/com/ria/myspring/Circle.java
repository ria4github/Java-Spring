package com.ria.myspring;

public class Circle implements Shape {
	
	private Point center;
	

	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("Center : ("+center.getX()+","+center.getY()+")");
		
	}

}
