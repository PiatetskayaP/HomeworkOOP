package com.bigmir.piatetskaya.polina;

public class Circle extends Shape {
	private Point a;
	private Point b;

	public Circle() {
		super();
	}

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public double getPerimetr() {
		double perimetr = 2 * Math.PI * Point.length(a, b);
		return perimetr;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(getPerimetr(), 2);
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}

}
