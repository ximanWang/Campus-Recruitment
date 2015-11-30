package day04;

import java.util.Scanner;

/**
 * 闰年规定
 * 注：闰年的判断公式为：
 * 1.年份能被4整除，且不能被100整除的是闰年。
 * 2.年份能被400整除的是闰年。
 */
public class Demo05 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int year;	
		System.out.println("输入年份：");
		year = console.nextInt();
		if((year%4==0 && !(year%100==0)) || (year%400==0)){
			System.out.println("闰年！");
		}else{
			System.out.println("不是闰年！");
		}
	}

}
