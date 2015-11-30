package day03;

public class Demo08 {

	/**
	 * 取余运算
	 * 1）负数的余数是负数或0
	 * 2）正数方向，余数是周期函数
	 * 3）取余运算经常用于处理周期性现象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 2;
		int c = a % b;
		System.out.println(c);
		
		System.out.println(-4%3);
		System.out.println(-3%3);
		System.out.println(-2%3);
		System.out.println(-1%3);
		System.out.println(0%3);
		System.out.println(1%3);
		System.out.println(2%3);
		System.out.println(3%3);
		System.out.println(4%3);
		System.out.println(5%3);
		System.out.println(6%3);
		System.out.println(7%3);

	}

}
