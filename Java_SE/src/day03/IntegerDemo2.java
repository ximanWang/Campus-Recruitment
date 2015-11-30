package day03;
/**
 * 包装类的其他作用
 * parseInt() parseDouble() ...
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		/**
		 * 包装类提供了两个常量
		 * 对应基本类型数据的最大取值和最小取值
		 */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		/**
		 * 基本类型与字符串之间的转换
		 */
		int a = 1;
		String str = "123";//String str = Integer.valueOf(a).toString()+"";
		//从字符串转换为基本类型
		int b = Integer.parseInt(str);
		System.out.println(b+a);
		
		/**
		 * 将整数转换为2进制形式的字符串
		 */
		int num = 100;
		String bStr = Integer.toBinaryString(num); 
		System.out.println(bStr);
		
		String hStr = Integer.toHexString(num);
		System.out.println(hStr);
	}
}
