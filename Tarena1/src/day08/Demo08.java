package day08;

public class Demo08 {

	/**
	 * 在同一个包中，不能声明同名的类
	 * 构造器(构造方法)：创建和初始化对象的方法(初始化)
	 *  1) 构造方法在类中声明(定义)
	 *  2) 构造方法的方法名与类名一致
	 *  3) 构造器不能声明返回值
	 *  4) 使用new运算调用构造器创建对象
	 *  5) Java根据构造器参数识别不同的构造器。
	 *  
	 * 构造方法与方法的比较
	 * 1) 语法
	 *   构造方法：方法名一定与类名一样，不能定义返回值
	 *     使用new运算调用构造方法
	 *     
	 *   方法：一般与类名不同，一定定义返回值(没有返回值使用void调用)使用引用调用方法
	 *   
	 * 2) 功能
	 *  构造方法用于创建对象初始化属性的。如：创建格子对象
	 *  方法是对象的行为功能 如：格子下落功能。
	 * 
	 * 简单说：构造器用于创建对象，方法是的对象的行为。
	 */
	public static void main(String[] args) {
		Cell1 c1 = new Cell1(3,4);
		Cell1 c2 = new Cell1(3,5);
		c1.drop();
		System.out.println(c1.row);
	}

}
//class Cell;//编译错误
class Cell1{
	public Cell1(int row, int col){
		//row = row;//不能区别 方法参数row和实例变量row
		this.row = row;
		this.col = col;//不能省略this，才能区别方法参数和实例变量
	}
	int row; 
	int col;
	public void drop(){
		row++;
	}
}