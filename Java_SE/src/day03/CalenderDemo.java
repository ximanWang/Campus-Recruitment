package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 日历类Canlendar
 * set()  get()  getTime() getInstance()
 * getActualMaximum()
 */
public class CalenderDemo {
	public static void main(String[] args) {
		//创建Calendar实例
		Calendar calendar = Calendar.getInstance();
		//创建格利高里历法实现的日期类
		//calendar = new GregorianCalendar();
		
		//创建出来的Calendar实例描述的是当前系统时间
		System.out.println(calendar);
		/**
		 * 将Calendar描述的时间转换为一个用Date方式描述的对象
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		
		long now = System.currentTimeMillis();
		//设置时间为1985-05-01
		calendar.set(Calendar.YEAR, 2014);
		//月从0开始，0代表1月
		calendar.set(Calendar.MONTH, 7);//8月
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		date = calendar.getTime();
		long start = date.getTime();
		double t = (now-start)/(1000l*60*60*24);
		System.out.println(t);
		/**
		 *  星期中 1：星期天
		 *         2：星期一
		 *         ...
		 */
		//获取Calendar所描述的时间对应的星期
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		System.out.println(day);
		/**
		 * 获取给定时间单位允许的最大值
		 * 下面的例子获取的就是这一年中最大的天
		 * 可以统计这一年总共有多少天使用
		 */
		int sum = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(sum);
	}
}
