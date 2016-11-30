package com.ria.myspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean {
	
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean method for Triangle");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean method for Triangle");
		
	}

	public void myDestroy()  {
		// TODO Auto-generated method stub
		System.out.println("My destroy method for Triangle");
		
	}

	public void myInit() {
		System.out.println("myInit Bean init method for Triangle");
		
	}
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw()
	{	System.out.println("Drawing Triangle");
		System.out.println("Point A :"+"("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("Point B :"+"("+pointB.getX()+","+pointB.getY()+")");
		System.out.println("Point C :"+"("+pointC.getX()+","+pointC.getY()+")");
	}

}
