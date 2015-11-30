package day03;

public class Demo06 {

	/**
	 * 数据类型转换
	 */
	public static void main(String[] args) {
		// 自动数据类型转换
		int i = -2;
	    long l = i;//数据类型转换,符号位扩展：根据符号为进行填充
	    // i = 11111111 11111111 11111111 11111110
	    // l = 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
	    System.out.println(Integer.toBinaryString(i));
	    System.out.println(l);
	    System.out.println(Long.toBinaryString(l));
	    System.out.println(Long.toBinaryString((long)(i)));//自动转换/隐含转换
	    //如何输出byte类型的二进制内容
	    byte b = -2;
	    System.out.println(Integer.toBinaryString(b));
	    System.out.println(Integer.toBinaryString((int)b & 0xff));
	    // b = 11111110
	    // int 11111111 11111111 11111111 11111110
	    // &   00000000 00000000 00000000 11111111    mask 面具 掩码  0xff：8位掩码
	    //   ---------------------------------------
	    //     00000000 00000000 00000000 11111110
	//强制类型转换：有风险：溢出风险精度和损失
	    long x = 56;
	    i = (int)x;//强制类型转换
	    System.out.println(i);
	    
	    x = 0x00000041;
	    i = (int)x;
	    System.out.println(i);//65
	    System.out.println(x);//65
	    System.out.println(Long.toBinaryString(x));
	    System.out.println(Integer.toBinaryString(i));
	    double pi = 3.1415926535897932384;
	    float f = (float)pi;
	    System.out.println(f);
	    
	    // 4舍5入
	    double price = 567.89;
	    long p = (long)(price + 0.5);
	    System.out.println(p);
	}

}
