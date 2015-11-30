package day12;

import java.util.Scanner;

/**
 * 验证用户输入
 * for( ;语句; )
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double score;
		System.out.println("请输入成绩：");
		score = in.nextDouble();
		for(;score<0 || score>100;){
			System.out.println("成绩不合法，请再次输入成绩：");
			score = in.nextDouble();
		}
		System.out.println("成绩为："+score);
	}
}
