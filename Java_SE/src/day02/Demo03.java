package day02;

import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) {
		String str = "5, tom, 5, tom@tom.com, 119";
		//split 劈开，按照正则匹配到的位置劈开
		String[] data = str.split(",\\s?");
		System.out.println(Arrays.toString(data));
		//replaceAll() 替换所有匹配的字符串
		String s = str.replaceAll(",\\s?", "|");
		System.out.println(s);
		char[] chs = s.toCharArray();
		System.out.println(Arrays.toString(chs));
		// new String(chs,0,5)将字符数组中0位置开始连续5个字符创建为新字符串
		String ss = new String(chs, 0, 5);
		System.out.println(ss);
	}
}
