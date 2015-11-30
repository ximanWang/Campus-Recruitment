package day04;

import java.util.Scanner;

public class Demo01 {

	/**
	 * 条件运算符
	 *  根据查询结果数量和每页显示数量，计算显示页数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("输入查询行数：");
		int rows = console.nextInt();//查询结果数量，行数
		int size = 10;//大小，就是每个页面显示的行数
		int pages;//显示页数
		pages = rows%size==0? rows/size : rows/size+1;
		System.out.println("查询结果为："+pages+"页");
	}

}
