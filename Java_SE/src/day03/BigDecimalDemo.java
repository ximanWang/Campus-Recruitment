package day03;

import java.math.BigDecimal;

/**
 * 长小数
 * 可以描述更精确的小数
 * 该类不是包装类！
 * java.math.BigDecimal
 *
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal d1 = new BigDecimal("3.0");
		BigDecimal d2 = new BigDecimal("2.9");
		//d1 - d2
		BigDecimal d3 = d1.subtract(d2);//减法操作
		System.out.println(d3);
		/**
		 *加法操作：public Decimal add(Decimal d) 
		 *乘法操作：public Decimal multiply(Decimal d)
		 *除法操作：public Decimal divide(Decimal d)
		 */
		/**
		 * 除法建议选取该方法，第二个参数用于告知保存的小数位
		 * 第三个参数告知进行四舍五入
		 */
		d1.divide(d2,8,BigDecimal.ROUND_HALF_UP);//四舍五入
		BigDecimal d4 = d1.divide(d2,8,BigDecimal.ROUND_HALF_UP);
		System.out.println(d4);
	}
}
