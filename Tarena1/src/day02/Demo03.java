package day02;

public class Demo03 {

	/**
	 * 直接量：就是直接写出的数字
	 * int i＝5；
	 * 中i是变量，而5是直接量（直接写出的数）
	 * 0xffff;
	 * Java中整数字面量（直接量）默认都是整数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		//i = 200049034903;编译错误，直接量超出int范围了
		//long l = 20000000000;编译错误，直接量超出int范围了
		long l = 2000000000L;//以L后缀的是long类型的字面量
		long now = System.currentTimeMillis();
		System.out.println(now);
		long year = now/1000/60/60/24/365 + 1970;
		System.out.println(year);
		long max = 0x7fffffffffffffffL;//时间耗尽的时刻！
		year = max/1000/60/60/24/365 + 1970;
		System.out.println(year);

	}

}
