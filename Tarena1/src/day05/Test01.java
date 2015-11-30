package day05;

public class Test01 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 40923240;
		int last;
		for(;;){
			last = num % 10;
			sum = sum *10+last;
			num /= 10;
			if(num == 0) break;
		}
		System.out.println(sum);
		
	}
 
}
