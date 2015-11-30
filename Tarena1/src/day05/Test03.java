package day05;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int n=0; n<1000; n++){
			int num = n;
			int sum = 0;
			int last;
			while(num != 0){
				last = num % 10;
				sum += last*last*last;
				num /= 10;
			}
			if(sum == n){
				System.out.println(sum);
			}
		}
	
	}

}
