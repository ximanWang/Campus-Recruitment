package day08;

import java.util.Arrays;
import java.util.Random;

public class Demo01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary =new int[10];
		Random random = new Random();
		for(int i=0; i<ary.length; i++){
			ary[i] = random.nextInt();
		}
		int[] ary2, ary3;
		ary2 = Arrays.copyOf(ary, ary.length);
		ary3 = Arrays.copyOf(ary, ary.length);
		long start1 = System.currentTimeMillis();
		Arrays.sort(ary);
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		long start2 = System.currentTimeMillis();
		sort(ary2);
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		long start3 = System.currentTimeMillis();
		sort1(ary3);
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);

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
	public static void sort1(int[] ary){
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
}
