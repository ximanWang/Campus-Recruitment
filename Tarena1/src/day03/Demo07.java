package day03;

public class Demo07 {
	/**
	 * 运算符
	 * 数学运算规则
	 *  1）同种类型参与运算（可能会自动类型转换），返回同种类型
	 *  2）小于32位的数据按照32位int计算
	 *  3）要注意避免超范围溢出问题
	 *  4）整数除法是整数
	 */
	public static void main(String[] args) {
	// 要避免超范围计算的溢出问题
		int max = Integer.MAX_VALUE;
		int i = max + 1;//发生超范围溢出现象
		System.out.println(i);//min
    //1)同种类型参与运算
		int a = 5;
		long b = 5;
		//int c = a+b;//编译错误，long不能转换为int
		
		long l = max + 1;
		System.out.println(l);
		
		long x = (long)max + 1;
		System.out.println(x);
		
	//2)小于32位（byte short char）的数据类型按照32位int计算
		byte b1 = 5;
		byte b2 = 6;
		//byte b3 = b1 + b2;//编译错误：int不能转换为byte
		int y = b1+b2;
		//int字面量（字面量表达式）在不超过范围的情况下可以给byte类型变量赋值。
		byte b3 = 5+6;
		byte b4 = 11;//int字面量给byte变量赋值 
		//byte b5 = 5+126;//编译错误！超过范围了
	//4)整数除法是整数
		int a1 = 5;
		int a2 = 2;
		int a3 = a1/a2;
		System.out.println(a3);//2
		
		double d1 = 5;
		double d2 = 2;
		double d3 = d1/d2;
		System.out.println(d3);//2.5
		
		double price = 55.8888;
		System.out.println(price*(80/100));//0.0
		System.out.println(price*(80d/100));
		System.out.println(price*(80.0/100));
		
		
	}

}
