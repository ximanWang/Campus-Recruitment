package day05;
/**
 * 菲波纳且
 * 数列
 * f(n)/f(n+1)=0.618
 * 
 * 计算 第n项
 */

import java.util.Arrays;

public class TestRubbits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rubbits = new int[20];
		rubbits[0] = 1;
		rubbits[1] = 1;
		for(int i=2; i<rubbits.length; i++){
			rubbits[i] = rubbits[i-1] + rubbits[i-2];
		}
		System.out.println(Arrays.toString(rubbits));

	}

}
