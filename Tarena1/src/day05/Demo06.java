package day05;

public class Demo06 {

	/**
	 *   数组的语法
	 * 1) 数组变量的声明
	 * 2) 数组的创建(内存分配)
	 * 3) 数组元素的访问(读写)
	 */
	public static void main(String[] args) {
	// 1)数组变量声明
		//类型[] 变量名； 声明数组类型变量，类型可以是基本类型/引用类型
		int[] ary;//声明了“int 类型数组” 变量
		String[] players;//声明了“String 类型数组” 变量
		//System.out.println(ary[0]);//编译错误
		ary = null;//必须先要初始化
		//System.out.println(ary[0]);//没有编译错误，运行异常
		//空指针异常，发生的原因：变量值是NULL，在访问成员的时候
		//发生空指针异常，成员：属性，方法，元素
		//如上代码执行结果：A.编译错误 B.运行异常 C.null D.0
		int ary1[];//是用于兼容C的语法，Java基本不使用！
    //2)如何创建数组：有3中方式
		//new 运算符，用于分配数组内存空间，按照数组长连续分配
		//空间，数组的元素“自动初始化”有默认值0
		//new 运算返回值是数组的内存首地址，赋值给数组变量
		//数组变量 ＝ new 类型[长度]
		ary = new int[4];
		System.out.println(ary[0]);//0
		//直接给数组元素进行初始化
		ary = new int[]{4,5,6};
		//数组静态初始化：可以看作是直接给出元素的简化版！
		//静态初始化只能用于声明变量直接初始化！
		int[] ary3 = {5,6,7};
		//ary3 = {6,7,8};//编译错误！数组静态初始化不能用于赋值！
		//三种方式区别：
		//1) 如果只是知道长度，不知道具体元素，或者长度很大，
		//   采用new int[length]
		//2) 已经知道元素，数量不多，使用new int[]{}
		//3) 是2)在声明变量时候使用的简化版
		
		//数组元素的自动初始化为“零”值
		// 0 0.0 \u0000 false null
		// 字符 \u0000 是C语言的字符串结束符号
		byte[] buf = new byte[1024]; // 1kbyte = 1024byte
		System.out.println(buf[0]);//0
		
		char[] chs = new char[5];
		System.out.println((int)chs[0]);//0
		
		String[] cards = new String[4];
		System.out.println(cards[0]);//null
		
		boolean[] bln = new boolean[8];
		System.out.println(bln[0]);//false
		
	// 3) 数组元素的访问(读写)
		//3.1) 使用[]运算，读写数组元素
		//3.2) 使用.length 属性获取数组长度
		//3.3) 数组下标范围 0~length-1, 最后元素length-1
		//3.4) 超范围访问数组，有运行异常！
		ary = new int[]{5,6,7};
		System.out.println(ary[0]);//5
		System.out.println(ary[1]);//6	
		System.out.println(ary[2]);//7
		//System.out.println(ary[3]);//运行异常，数组越界！
		System.out.println(ary.length);//3
		ary[0]++;//写数组元素
		System.out.println(ary[0]);//6
		}
}















