package day10;
/**
 * 抽象类
 * 1) 代表逻辑上的抽象概念
 * 语法
 * 2) 使用abstract 声明类
 * 3) 抽象类不能直接实例化(不能使用new创建对象)
 * 4) 抽象类可以保护抽象方法，使用abstract声明的方法
 *    抽象的方法不能有方法体
 * 5) 抽象类只能被继承，在具体的子类中必须实行全部抽象方法
 * 6) 抽象类可以定义变量，引用具体子类实例(对象)
 */
public class Demo12 {
	public static void main(String[] args) {
		Shape s = new circle(3,4,5);
		s.down();System.out.println(s.contains(3, 4));
	}

}
abstract class Shape{
	int x;
	int y;
	public abstract boolean contains(int x, int y);
	public void down(){
		y++;
	}
}
class circle extends Shape{
	int r;
	public circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public boolean contains(int x, int y){
		int a = this.x - x;
		int b = this.y - y;
		return Math.sqrt(a*a + b*b)<=r;
	}
}