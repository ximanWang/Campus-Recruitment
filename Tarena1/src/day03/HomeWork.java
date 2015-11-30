package day03;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner console = new Scanner(System.in);
		int n = random.nextInt(10);
		//System.out.println(n);
		System.out.println("请猜数字：");
		int m = console.nextInt();

		int i;
		if(m==n){
			System.out.println("恭喜你，猜对了！");
			return;
		}
		for(i=4; i>0; i--){
			if(m == n){
				System.out.println("恭喜你，猜对了！");
				return;
			}
			else if(m>n){
				System.out.println("猜大了，你还有"+i+"次机会");				
			}
			else if(m<n){
				System.out.println("猜小了，你还有"+i+"次机会");
			}	
			m = console.nextInt();
		}
		if(i==0){
			if(m==n){
				System.out.println("恭喜你，猜对了！");
			}
			else{
				System.out.println("机会用尽,你没有猜对！");
			}
		}
	}

}
