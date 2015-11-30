package day02;

public class HomeWork {
	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	public static int sum(int x){
        int y = 0;
		if(x==1){
			System.out.println(x);
			return x;
		}
		else{
			y =  x + sum(x-1);
			System.out.println(y);
			return y;
		}		
	}
}
