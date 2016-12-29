package com.shape;

public class Square implements Polygon{
	private float side;

	public Square(float side){
		this.side = side;
	}

	public void calcArea(){
		System.out.println(side*side);
	}

	public void calcPeri(){
		System.out.println(side*4);
	}
}