package day04;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int num=2; num<100; num++){
			boolean isPrime = true;
			for(int i=2; i<num/2; i++){
				if(num%i==0){
					isPrime = false;
				}
			}
			if(isPrime){
				System.out.println(num+"是质！");
			}
		}
		
		numNext:for(int num=2; num<100; num++){
			for(int i=2; i<num/2; i++){
				if(num%i==0){
					continue numNext;
				}
			}
			System.out.println(num+"是质数！");
		}
		
		int sum = 0;
		for(int i=1; i<=10; i+=2){
			sum +=i;
			System.out.println(i);
		}
		System.out.println(sum);
		
		int sum1 = 1;
		for(int i=1; i<=5; i++){
			sum1*=i;
		}
		System.out.println(sum1);
		
		double sum2=0;
		for(long i=1; i<=100000000; i+=4){
			sum2 = 1d/i-1d/(i+2);
		}
		double pi = 4*sum2;
		System.out.println(pi);
	}
}
