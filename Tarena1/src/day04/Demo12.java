package day04;

public class Demo12 {

	/**
	 * 计算阶乘
	 * sum = 1*2*3*...*20
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long s = 1;
		for(long i=1; i<=20; i++){
			s *= i;
		}
		System.out.println(s);
		
		int x= 1;
		for(int y=1; y<=20; y++){
			x*=y;
		}
		System.out.println(x);
	}

}
