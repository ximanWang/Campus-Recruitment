package day05;

import java.util.Scanner;

/**
 * 验证用户输入
 * 
 */
public class Demo02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int score = -1;
		for (; score < 0 || score > 100;) {
			System.out.println("请输入分数：");
			score = in.nextInt();
		}
		System.out.println("分数：" + score);
		
		int score1 = -1;
		while(score1 < 0 || score1 > 100){
			System.out.println("请输入分数1：");
			score1 = in.nextInt();
		}
	}

}
