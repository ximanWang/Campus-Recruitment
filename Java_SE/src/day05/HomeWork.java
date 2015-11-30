package day05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 36选7
 * @author tarena
 *
 */
public class HomeWork {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		for(int i=0; i<5; i++){
			while(set.size()<7){
				set.add(r.nextInt(37));
			}
			System.out.println(set);
			set.clear();
		}
	}
}
