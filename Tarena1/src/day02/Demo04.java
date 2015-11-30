package day02;

public class Demo04 {

	/**
	 * 浮点数类型：就是Java中的小数类型（是2进制小数）
	 *   参考：IEEE－754标准
	 * 1）精度（精确度）问题
	 *    double 64位，float 32位 double的精度是float的两倍
	 *    double是常用的浮点类型
	 * 2）默认小数类型是double类型（精度问题），后缀D d F f
	 * 3）计算误差,有舍入误差现象，不能进行精确计算
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.1415926535897932384626433832D;
		float f = 3.1415926535897932384626433832f;
		System.out.println(pi);
		System.out.println(f);
		
		double d = 2.6;
		System.out.println(d - 2); 
		
		double c = Math.sin(pi);
		System.out.println(c);
		System.out.println(c==0);//false
		//判断c接近于0
		System.out.println(Math.abs(c)<0.0000000001);//true
	}
}
