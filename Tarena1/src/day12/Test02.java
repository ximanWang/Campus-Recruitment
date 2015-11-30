package day12;

public class Test02 {
	public static void main(String[] args) {
		for(int n=0; n<1000; n++){
			int num = n;
			int last;
			int sum = 0;
			while(num != 0){
				last = num%10;
				sum += last*last*last;
				num /= 10;
			}
			if(sum == n){				
				System.out.println(n);
			}
		}
	}

}
