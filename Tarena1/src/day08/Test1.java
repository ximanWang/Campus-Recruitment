package day08;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args){
		String[] balls = generate();
		System.out.println(Arrays.toString(balls));
	}
	public static String[] generate(){
		String[] pool = {"01","02","03","04","05","06","07","08","09","10"};
		String[] balls = new String[6];
		boolean[] used = new boolean[pool.length];
		Random random = new Random();
		int index = 0;
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
		balls[balls.length-1] = pool[random.nextInt(3)];
		return balls;
	}

}
