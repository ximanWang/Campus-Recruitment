package day04;

public class Demo13 {

	/**
	 * 求圆周率：4*((1/1-1/3)+(1/5-1/7)+(1/9-1/11)...)
	 * 
	 * pi = 4*(sum+=(1/i-1/(i+2)))
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(long i=1; i<100000000; i+=4){
			sum+=1d/i-1d/(i+2);
		}
		double pi = 4*sum;
		System.out.println(pi);

	}

}
