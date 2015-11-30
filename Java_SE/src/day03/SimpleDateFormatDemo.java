package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于转换日期与字符串的SimpleDateFormatDemo
 *
 */
public class SimpleDateFormatDemo {
	public static void main(String[] args) throws ParseException {
		String timeStr = "2014-7-31";
		//创建SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(timeStr);
		System.out.println(date);
	}
}
