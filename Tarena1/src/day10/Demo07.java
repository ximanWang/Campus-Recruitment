package day10;
/**
 * final的变量
 *  1) 只能初始化(第一次赋值),不能再修改
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		int a;
		final int b;
		a = 1;//初始化(第一次赋值)
		b = 8;
		System.out.println(b);
		a = 9;
		//b = 4;//编译错误，不能再修改
	}
	public static void test(int a, final int b){
		a = 2;
		//b = 5;//编译错误！
	}
}
