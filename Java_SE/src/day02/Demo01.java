package day02;

import org.apache.commons.lang3.StringUtils;
public class Demo01 {
	public static void main(String[] args) {
		String num = "5000";
		String str = StringUtils.leftPad(num, 9, "中");
		System.out.println(str);
	}
}
