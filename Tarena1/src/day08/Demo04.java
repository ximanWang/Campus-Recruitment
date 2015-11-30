package day08;

public class Demo04 {

	/**
	 * 位运算
	 *    n = 11111111 11111111 11111111 11111010
	 * n<<1 =  1111111 11111111 11111111 111110100      
	 * 
	 * 移位运算的数学意义(就是移动小数点运算！)
	 *   12538.小数点向右移动一次
	 *   125380.就是原数字乘以 基数(10)!
	 *   如故小数点看作不动，数字向左移动！
	 *   
	 * 同理 得：
	 *   二进制数字左移动n次，数学上是原数字乘以n次 基数2
	 *   -6 << 1 = -12
	 */
	public static void main(String[] args) {
		int n = 0xfffffffa;
		int m = n << 1;//左移后面添0
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		m = n >> 1;//右移前面添1
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		
		System.out.println("逻辑右移，高位补0");
		m = n>>>1;//逻辑右移  高位补0
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		
		System.out.println("数学右移，整数补0负数补1(高位有什么补什么) ");
		m = n>>1;//数学右移，整数补0负数补1 
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		
		// r = 45   0~255
		// g = 128  0~255
		// b = 51   0~255
		// hex color = 2d8033
        //三个颜色分量合并为1个彩色数值		
		int r = 45; //00000000 00000000 00000000 00101101
		int g = 128;//00000000 00000000 00000000 01000000
		int b = 51; //00000000 00000000 00000000 00010011
		                                         //45      128      51
		int color = (r<<16)+(g<<8)+b; //00000000 00101101 01000000 00010011
		System.out.println(Integer.toBinaryString(color));
		System.out.println(Integer.toHexString(color));
		
		int d1 = 192;
		int d2 = 168;
		int d3 = 10;
		int d4 = 100;
		int color1 = (d1<<24)+(d2<<16)+(d3<<8)+d4;
		System.out.println(Integer.toBinaryString(color1));
		
		n = 0xfffffffa;
		System.out.println(n);
		m = n<<1;
		System.out.println(m);
		
		n = 7;
		m = n<<2;
		System.out.println(m);
		m = n>>1;//数学右移
		System.out.println(m);
		m = n>>>1;//逻辑右移
		System.out.println(m);//不满足数学规则
		
		int color2 = (r<<16)|(g<<8)|b;
		System.out.println(Integer.toBinaryString(color2));
		System.out.println(Integer.toHexString(color2));
		
		byte x = -6;
		int i = x;//
		// x = 
		// i = 11111111 11111111 11111111 11111010
		System.out.println(Integer.toHexString(i));
		System.out.println(Integer.toHexString(x));
		//正确输出byte的16进制形式
		System.out.println(Integer.toHexString(x & 0xff));
		
	    color = 0x5280f0;
	    //color 00000000 01010010 10000000 11110000 
	    //mask  00000000 00000000 00000000 11111111
	    // &--------------------------------------------------
	    //blue  00000000 00000000 00000000 11110000
	    int blue = color & 0xff;
	    int green = (color>>>8) & 0xff;
	    int red = (color>>>16) & 0xff;
	    System.out.println("blue:"+Integer.toBinaryString(blue)+" green:"+Integer.toBinaryString(green)+" red:"+Integer.toBinaryString(red));
	    
	    //经典的面试题：如何快速实现一个整数 * 8 (2的整数倍)
	    int n1 = 9;
	    int y = n1<<3;
	    System.out.println(y);
	    
	}

}
