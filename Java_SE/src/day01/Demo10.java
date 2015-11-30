package day01;

public class Demo10 {
	public static void main(String[] args) {
		//                0123456789012
        //String barcode = "6953220900756";
	//	char c = barcode.charAt(2);//
		//System.out.println(c);
		//int n = c - '0';
		//System.out.println(n);
		String barcode = "6953220900756";
		System.out.println(code(barcode));
	}
	/** 计算EAN-13验证码 */
	public static int code(String bar){
		//barcode = "6953220900756"
		//           1234567890123
		//           0123456789012
		//i=         0 2 4 6 8 0 2
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<12; i+=2){
			//i = 0 2 4 6 8 10
			char c = bar.charAt(i);//c='6''5''2'...
			c1 += c-'0';
			c2 += bar.charAt(i+1)-'0';
		}
		int cc = c1 + c2 * 3;
		int c = 10 - cc % 10;
		return c;
	}
}
