package day09;
/**
 * 方法的重写：“修改功能”
 * 1) 在子类中修改父类的行为，重写就是为了修改
 * 2) 语法：子类型中定义与父类型相同的方法(方法名一样，参数一样)
 * 3) 调用重写的方法时候调用具体对象的方法
 */
public class Demo07 {
	public static void main(String[] args) {
		Shape bomb = new Circle(3,4,5);
		Shape airplane = new Rect(10,10,5,6);
		int x= 12;
		int y = 12;//炮弹位置
		if(bomb.contains(x, y)){
			System.out.println("炮弹被打掉！");
		}
		if(airplane.contains(x, y)){
			System.out.println("飞机被打掉！");
		}
		bomb.move(11,11);
	}

}
class Shape{
	int x;
	int y;
	/** 判断当前图形是否包含x,y这点 */
	boolean contains(int x, int y){
		return false;
	}
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
}
/** 矩形 */
class Rect extends Shape{
	int width;
	int height;
	public Rect(int x, int y, int w, int h){
		super.x= x;//父类型的引用  跟this没啥区别
		this.y = y;
		width = w;
		height = h;
	}
	/** 方法重写，修改父类的方法 */
	boolean contains(int x, int y){
		int dx = x - this.x;
		int dy = y - this.y;
		return dx>=0 && dx<width && dy>=0 && dy<=height;
	}
}
/** 圆 */
class Circle extends Shape{
	int r;
	public Circle(int x, int y, int r){
		super.x = x;
		super.y = y;
		this.r = r;
	}
	boolean contains(int x, int y){
		int a = this.x -x;
		int b = this.y - y;
		double c = Math.sqrt(a*a + b*b);
		return c <= r;
	}
}