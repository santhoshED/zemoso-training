package com.shape;

public class Rectangle implements Polygon{
	private float length;
	private float breadth;

	public Rectangle(float length, float breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public void calcArea(){
		System.out.println(length*breadth);
	}

	public void calcPeri(){
		System.out.println(2*(length+breadth));
	}
}