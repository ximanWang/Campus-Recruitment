package day03;

public class Demo01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(~6+1);//-6
		//"6"-> 00000000 00000000 00000000 00000110
		// ~    11111111 11111111 11111111 11111001
		// +1   11111111 11111111 11111111 11111010
		//      11111111 11111111 11111111 11111010 -> "-6"
		System.out.println(~-6+1);//6
		
		int a = 0x7fffffff;
		int b = 0x7ffffff0;
		System.out.println(a-b);//15
		
		float fa = a;//发生精度损失！int值很大临近边界的时候
		float fb = b;
		System.out.println(fa-fb);//0.0
        
		double da = a;//不发生精度损失，double精度够用
		double db = b;
		System.out.println(da-db);//15.0
	}

}
