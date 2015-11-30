package day06;

public class Circle extends Shape{
	final static double PI = 3.14;
	double r;
	public Circle(double r){
		this.r = r;
	}
	@Override
	public double getArea() {
		return PI * r *r;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	
}
