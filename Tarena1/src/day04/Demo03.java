package day04;
/**
 * + 是java中 唯一 的“重载”的运算符，数学加法和字符串连接
 * 重载：名称一样不同的功能。
 * + 是重载的运算符：数学加，字符串连接，两种功能。
 */
public class Demo03 {
	public static void main(String[] args) {
		System.out.println('1'+1);//50
		System.out.println("1"+1);//"11"
		
		System.out.println(1+2+3+"abc");
		System.out.println('1'+'2'+'3'+"abc");
		System.out.println("1"+"2"+"3"+"abc");
		
		int a = 1;
		int b = 2;
		System.out.println(a+","+b);
		System.out.println(a+','+b);
	}

}
