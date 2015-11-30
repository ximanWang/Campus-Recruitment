package day06;

public abstract class Shape {
	public void area(){
		System.out.println("我的面积是：" + getArea());
	}
	public abstract double getArea();
}
