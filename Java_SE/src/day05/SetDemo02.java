package day05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 利用set集合不重复特性，生成20个1~100之间不重复随机数
 * @author tarena
 *
 */
public class SetDemo02 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		int sum = 0;
		while(set.size()<20){
			set.add(r.nextInt(100));
			sum++;
		}
		System.out.println(set);
		System.out.println(sum);
	}
}
