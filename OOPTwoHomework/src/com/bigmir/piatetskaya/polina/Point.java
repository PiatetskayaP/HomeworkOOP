package com.bigmir.piatetskaya.polina;

public class Point {
	private double x;
	private double y;

	public Point() {
		super();
	}

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double length(Point a, Point b) {
		return Math.sqrt(Math.pow((b.getX() - a.getX()), 2.0) + Math.pow((b.getY() - a.getY()), 2.0));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
