package day02;

import java.util.Scanner;

public class Demo05 {
	/**
	 *    s = g * t * t / 2
	 * => 2*s = g*t*t
	 * => (2*s)/g = t * t 
	 * Math.sqrt((2*s)/g) = t
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("输入距离：");
		double t;
		double g;
		double s;
		g = 9.8;
		s = console.nextDouble();
		//s = 10 * 3;
		t = Math.sqrt((2*s)/g);
		System.out.println("时间是："+t);
		
		double i = 4.29;
		double j = i - 2;
		System.out.println(j);

	}

}
