package day03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * DateFormat是SimpleDateFormat的父类
 *
 */
public class DateFormatDemo {
	public static void main(String[] args){
		Date date = new Date();
		/**
		 * style 对应的常量 LONG SHORT MEDIUM
		 */
		DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.JAPAN);
		System.out.println(format.format(date));
	}
}
