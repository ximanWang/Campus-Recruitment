package day04;

public class Demo11 {

	/**
	 * 累加 1+2+...+10000
	 * i = 1 2 3...10000
	 * sum += i
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=10000; i++){
			sum += i;
		}
		System.out.println(sum);

	}

}
