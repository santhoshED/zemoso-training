package com.test;

import com.shape.*;

public class TestPackage{
	public static void main(String[] args) {
		Square sq = new Square(5);
		Rectangle rc = new Rectangle(3,4);
		sq.calcArea();
		sq.calcPeri();
		rc.calcArea();
		rc.calcPeri();
	}
}

