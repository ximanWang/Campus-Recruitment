package day02;
public class Demo01 {

	/**
	 * Java 的变量
	 */
	public static void main(String[] args) {
		// System.out.println(age);  编译错误  age没有声明
		// TODO Auto-generated method stub 
		int age;//变量的声明，告诉java有了变量age（年龄）
		//System.out.println(age);  编译错误 age没有初始化
		age = 18;//第一次赋值，就是初始化
		//int  age = 9; 编译错误，重复定义
		age = 9;//对age进行赋值，修改原先的值
		System.out.println(age);
		{//代码块
			int Score = 85;//  声明变量，同时初始化
			System.out.println(Score);//85
		}
		//System.out.println(Score);编译错误，没有Score变量
		int Score = 70;//可以再次定义Score，不在同一个作用域
		System.out.println(Score);//70

	}

}
