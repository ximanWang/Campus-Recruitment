package day10;
/**
 * 静态方法
 * 两个点的距离计算
 * 1) 静态方法是属于类的方法，用类名调用。
 *  静态方法经常用于与当前对象无关的代码
 * 2) 静态方法中没有隐含变量this 不能访问当前对象
 */
public class Demo04 {
	public static void main(String[] args) {
		Point p1 = new Point(0,0);
		Point p2 = new Point(3,4);
		System.out.println(p1.distance(p2));
		System.out.println(Point.distance(p1, p2));
	}
}
class Point{
	int x;
	int y;
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	/** 当前点(this)到另外(x,y)的距离*/
	public double distance(Point other){
		int a = this.x - other.x;
		int b = this.y - other.y;
		return Math.sqrt(a*a + b*b);
	}
	/** 计算p1 p2间的距离 */
	public static double distance(Point p1, Point p2){
		int a = p1.x - p2.x;
		int b = p1.y - p2.y;
		return Math.sqrt(a*a + b*b);
	}
}