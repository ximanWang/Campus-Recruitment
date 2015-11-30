package day04;

import java.util.Scanner;

public class Demo07 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = console.nextInt();
		if(score>=90 ){
			System.out.println("A");
		}else if(score>=80){
			System.out.println("B");
		}else if(score>=70){
			System.out.println("C");
		}else if(score>=60){
			System.out.println("D");
		}else{
			System.out.println("E");
		}
		}
	}

