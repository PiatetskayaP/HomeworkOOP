package com.bigmir.piatetskaya.polina;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		super();
	}

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double getPerimetr() {
		double perimetr = Point.length(a, b) + Point.length(a, c) + Point.length(b, c);
		return perimetr;
	}

	@Override
	public double getArea() {
		double p = getPerimetr() / 2.0;
		double area = Math.sqrt(p * (p - Point.length(a, b)) * (p - Point.length(a, c)) * (p - Point.length(b, c)));
		return area;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
