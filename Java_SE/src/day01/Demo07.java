package day01;
/**
 * 实现 字符数组内容转为小写算法
 * X-x = 'A' - 'a'
 * => X = x + ('A' - 'a')
 * => x = X - ('A' - 'a')
 */
import java.util.Arrays;

public class Demo07 {
	public static void main(String[] args) {
		char[] chs = {'H','e','l','l','o',',','W','o','r','l','d','!'};
		char[] chs1 = Arrays.copyOf(chs, chs.length);
		for(int i=0; i<chs1.length; i++){
			if(chs1[i] >= 'A' && chs1[i] <='Z'){
				chs1[i] = (char)(chs1[i] - ('A' - 'a'));
			}
		}
		System.out.println(chs);
		System.out.println(chs1);
		//String API 在返回值与原有字符串不同时候往往是新的对象
		String str = "Hello World!";
		String s = str.toLowerCase();
		System.out.println(s);
		
		String ss = "Hello World";
		String sss = ss.toUpperCase();
		System.out.println(sss);
	}
}
