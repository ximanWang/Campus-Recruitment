package day02;

import java.util.Scanner;

/**
 * 编写一个程序，输入一个班某门课程成绩，
 * 统计及格人数、不及格人数平均分。
 * 设计一个异常类，当输入的成绩小0分或大于100分时，
 * 抛出异常，程序将捕捉这个异常，并作出相应处理。
 * @author tarena
 *
 */
public class Exerxise04 {
	public static void main(String[] args) {
		System.out.println("请输入班级人数：");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] scores = new int[num];
		Test t = new Test();
		System.out.println("请输入"+ num +"个人的成绩：");
		for(int i=0; i<scores.length; i++){
			try{
				int score = in.nextInt();
				t.inPutScore(score);
			}catch(ScoreException e){
				System.out.println("成绩输入有误，请重输：");
				--i;
			}
		}
		System.out.println("及格人数：" + t.n);
		System.out.println("不及格人数：" + t.m);
	}
}
