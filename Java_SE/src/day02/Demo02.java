package day02;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入用户名：");
		String name = in.nextLine();
		boolean pass = name.matches("^\\w{8,10}$");
		for(;;){
			System.out.println("输入：");
			name = in.nextLine();
			if(pass){
				System.out.println("成功");
				break;
			}
		}
		
		
	}
}
