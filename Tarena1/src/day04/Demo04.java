package day04;

import java.util.Scanner;

/**
 * 计算3个数据中最大的 条件语句
 * 已知：a  b  c 
 *       max
 *          max
 */

public class Demo04 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner console = new Scanner(System.in);
		System.out.println("输入3个数（a b c）:");
		a = console.nextInt();
		b = console.nextInt();
		c = console.nextInt();
		
		int max;
		max = a>b ? a : b;
		max = max>c ? max : c;
		System.out.println("最大数是："+max);
	}

}
