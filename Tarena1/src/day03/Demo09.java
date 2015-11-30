package day03;

public class Demo09 {
	/**
	 * ++ 与 --自增（自减）运算
	 * 将变量自身增加1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		System.out.println(a);
		int b;
		b = a++;//先执行++运算，再执行=运算
		//a++运算称为后++，先取值再增加。
		//计算过程：
		// ++运算 1)先取a的值1 作为a++表达式的值1
		// ++运算 2)然后将a的值增加1，a为2
		// ＝运算 3)将表达式a++的值1赋给b为1
		System.out.println(a+","+b);//2,1
		a = 1;
		a = a++;
		System.out.println(a);
		
		a = 1;
		b = ++a;//先++再取值
		//先执行++a，然后再赋值＝
		//++运算 1)先将阿的值增加1，a为2
		//++运算 2)取a的值为2 作为++a表达式的值2
		//＝运算 2)将++a的表达式2赋值给b为2
		System.out.println(a+","+b);
		
		int i = 0;
		System.out.println(i++%3);
		System.out.println(i++%3);
		System.out.println(i++%3);
		System.out.println(i++%3);
		System.out.println(i++%3);
		System.out.println(i++%3);

	}

}
