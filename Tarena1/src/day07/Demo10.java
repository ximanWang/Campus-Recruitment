package day07;

import java.util.Arrays;

public class Demo10 {

	/**
	 * 冒泡排序
	 */
	public static void main(String[] args) { 
		int[] ary = {3,4,6,5,2,7,8,6};
		Demo10.sort(ary);
		System.out.println(Arrays.toString(ary));

	}
	public static void sort(int[] ary){
		int i,j; 
		for(i=0; i<ary.length-1; i++){
			for(j=0; j<ary.length-i-1; j++){
				if(ary[j] > ary[j+1]){
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
	}

}
