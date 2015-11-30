package day07;

import java.util.Arrays;

public class Demo09 {
	public static void sort(int[] ary){
		//经典插入排序
		int i,j,k;
		for(i=0; i<ary.length;i++){
			k = ary[i];
			for(j=i-1; j>=0 && ary[j]>k; j--){
				ary[j+1] = ary[j];
			}
			ary[j+1] = k;
		}
	} 
	public static void main(String[] args) {
		int[] ary = {2,4,6,4,8,1,3};
		Demo09.sort(ary);
		System.out.println(Arrays.toString(ary));
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
	}

}
