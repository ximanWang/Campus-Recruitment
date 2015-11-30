package day08;

import java.util.Arrays;
import java.util.Random;

public class Demo05 {

	/**
	 * 去除重复算法
	 */
	public static void main(String[] args) {
		String[] balls = gen();
		System.out.println(Arrays.toString(balls));
	}
	public static String[] gen(){
		String[] pool = {"01","02","03","04","05","06","07","08","09","10","11","12",
				"13","14","15","16","17","18","19","20","21","22","23","24","25"};//球池
		boolean[] used = new boolean[pool.length];
		String[] balls = new String[6];
		int index = 0;
		Random random = new Random();
		int i;
		do{
			i = random.nextInt(pool.length);
			if(used[i]){
				continue;
			}
			balls[index++] = pool[i];
			used[i] = true;
		}while(index != balls.length);
		Arrays.sort(balls);
		balls = Arrays.copyOf(balls, balls.length+1);
		balls[balls.length-1] = pool[random.nextInt(16)];
		return balls;
	}

}
