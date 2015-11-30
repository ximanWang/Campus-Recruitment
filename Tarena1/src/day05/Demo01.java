package day05;

/**
 * 将输入的一个整数倒转 如：num = 2345 则结果是：5432
 */

public class Demo01 {
	public static void main(String[] args) {
		int num = 2344745;
		int sum = 0;
		int last;
		for (;;) {
			last = num % 10;
			sum = sum * 10 + last;
			num /= 10;
			if (num == 0) {
				break;
			}
		}// num=0时结束循环
		System.out.println(sum);

		int num1 = 209344;
		int sum1 = 0;
		int last1;
		for (;;) {
			last1 = num1 % 10;
			sum1 = sum1 * 10 + last1;
			num1 = num1 / 10;
			if (num1 == 0)
				break;
		}
		System.out.println(sum1);

	}

}
