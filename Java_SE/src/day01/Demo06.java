package day01;
/**
 *  3) Java中为了提高性能，静态字符串(字面量/常量/常量连接的结果)
     在静态池中创建，尽量使用同一个对象，重用静态字符串
  == 比较引用变量值，引用变量值相等，意味着是同一个对象的引用
 */
public class Demo06 {
	public static final String S = "123ABC";
	public static final int A = 123;
	public static void main(String[] args) {
		String s1 = S;
		String s2 = "123ABC";//123ABC
		String s3 = A + "ABC";//123ABC
		String s4 = 123 + "ABC";//123ABC
		String s5 = "123" + "ABC";//123ABC
		String s6 = 1+2+3+"ABC";//6ABC
		String s7 = '1' + '2' + '3' + "ABC";//150ABC
		String s8 = "1" + '2' + '3' + "ABC";//123ABC
		String s9 = "1" + "2" + "3" + "ABC";//123ABC
		String s10 = "ABC";
		String s11 = "123" + s10;
		System.out.println(s1==s8);
		System.out.println(s11==S);
	}
}
