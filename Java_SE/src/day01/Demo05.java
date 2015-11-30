package day01;
/**
 * 字符串“对象”是不可改变的，字符串引用可以重新赋值
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		s1 = s1 + "World";//生成了新的字符串对象，原字符串对象不变
		//字符串连接底层是字符数组复制实现的！
		System.out.println(s1);
		System.out.println(s2);
	}
}
