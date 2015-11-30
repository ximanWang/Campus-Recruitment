package day02;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Date 测试
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		System.out.println(year + "," +month);
		
		date.setTime(-1000*60*60*9);//1969年最后一天
		year = date.getYear() + 1900;
		month = date.getMonth() + 1;
		System.out.println(year + "," +month);
		
		long now = System.currentTimeMillis();
		date.setTime(now + 1000L*60*60*24);
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = fmt.format(date);//最快捷的时间输出
		System.out.println(str);
		System.out.println(fmt.format(0));//Java API没有说明！
	}
}
