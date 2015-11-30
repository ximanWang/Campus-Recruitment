package day05;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数字游戏 分析：有三个变量 功能实现（数据的计算，步骤） 
 * 1) 获取用户猜测数字，记录猜测次数 
 * 2) 比较是否猜中，如果猜中就结束 
 * 3)如果没有猜中，就提示比较大小
 * 4) 返回 1)
 */

public class Demo05 {
	public static void main(String[] args) {
		int num;
		int guess;
		int score;
		Random random = new Random();
		num = random.nextInt(100) + 1;
		score = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("请猜数字：");
			guess = in.nextInt();
			score++;
			if (num == guess) {
				System.out.println("猜了" + score + "次就对了，好牛！");
				break;
			}
			if (guess > num) {
				System.out.println("猜大了！");
			} else {
				System.out.println("猜小了");
			}
		}
	}

}
