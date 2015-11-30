package day02;

public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 188;//java会将10进制“234”转化为二进制赋值到i的内存中。在计算机内部，只有二进制数据
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(~-6));
		i = 0xfffffff;
		System.out.println(i);
		int max = 0x7fffffff;
		int min = 0x80000000;
		System.out.println(Integer.toBinaryString(-28));
		System.out.println(Integer.toBinaryString(max));
		System.out.println(max);
		System.out.println(min);
	}

}
