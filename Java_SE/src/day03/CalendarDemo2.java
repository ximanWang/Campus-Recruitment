package day03;

import java.util.Calendar;

/**
 * 使用Calendar计算时间
 * 需求：
 *   想得知一个月后今天是星期几
 *   add()方法
 */
public class CalendarDemo2 {
	public static void main(String[] args){
		/**
		 * 实现步骤：
		 *  1.创建Calendar实例，用于描述当前系统时间
		 *  2.对这个时间累加一个月，变成一个月后的今天
		 *  3.获取这个时间所对应的星期，满足需求
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("星期"+(week==1?7:week-1));
		
		/**
		 * 计算今天距离10.1放假还有几天
		 * 计算离明年你过生日还有多少天
		 */
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH, 9);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		long end = calendar.getTimeInMillis();
		long now = System.currentTimeMillis();
		double t= (end - now)/(1000l*60*60*24);
		System.out.println(t);
		
	}
}
