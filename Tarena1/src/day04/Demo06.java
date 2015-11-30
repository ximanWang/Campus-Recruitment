package day04;

import java.util.Scanner;

/**
 * 找到3个数的最大值 if-else语句 if中只有一条语句的时候可以省略｛｝
 */
public class Demo06 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner console = new Scanner(System.in);
		System.out.println("请输入3个数（a b c）:");
		a = console.nextInt();
		b = console.nextInt();
		c = console.nextInt();
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println(max);

	}

}
