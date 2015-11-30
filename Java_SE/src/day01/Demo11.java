package day01;

import java.util.Arrays;

/**
 * 文字的编码方法
 * getBytes()
 * GBK:英文1个byte 中文2个byte
 * utf-8:英文1个byte 中文3个byte
 */
public class Demo11 {
	public static void main(String[] args) throws Exception {
		String str = "ABC中国";
		byte[] bytes = str.getBytes("gbk");
		System.out.println(Arrays.toString(bytes));
		bytes = str.getBytes("gbk");
		System.out.println(Arrays.toString(bytes));
		
		String s = new String(bytes,"gbk");
		System.out.println(s);
		s = new String(bytes,"utf-8");
		System.out.println(s);
	}
}
