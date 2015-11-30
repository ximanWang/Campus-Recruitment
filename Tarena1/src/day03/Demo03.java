package day03;

public class Demo03 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 20013;
		//c 是 char 变量，20013 是 int 类型字面量
		//不能进行超范围赋值！int字面量在不超过char范围情况下
		//可以给char变量赋值
		//字面量相加，Java按照一个整数处理
		//c = -1;//编译错误，超范围
		c = 65535;
		//c = 65536;
		c = 'A' + 1;//66
		c = 'A' + 65000;//字面量相加结果不超范围没有问题
		//c = 'A' + 65550;//超范围
		int a = 1;//定义一个变量a
		//c = a;//int 类型变量不能直接赋值给char变量
		
		

	}

}
