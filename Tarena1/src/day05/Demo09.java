package day05;
/**
 * 方法 就是函数
 *  1) 业务层面是软件的功能
 *  2) 本质上是数据操作算法
 *  
 *  he.love(her)
 *  f = function 功能！
 *  y = f(x)
 *  函数:计算两个点的距离
 *  y = f(x1,y1,x2,y2)
 *  
 *  java的函数定义：
 *  1) 在类中定义方法
 *  2) 方法一定定义返回值，如果没有返回值使用void
 *  3) 如果方法有返回值，必须使用return语句
 *  4) 方法可以有参数，参数是方法计算的前提条件。
 */
public class Demo09 {
	public static void main(String[] args) {
		double y = f(3,4,6,8);//函数调用
		System.out.println(y);
	}
	public static double f(int x1, int y1, int x2, int y2){
		int a = y1-y2;
		int b = x1-x2;
		double c = Math.sqrt(a*a + b*b);
		return c;
	}//方法体。函数体。函数的计算过程,算法

}
