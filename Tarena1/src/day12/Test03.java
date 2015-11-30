package day12;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		int[] ary = {4,7,2,9,4,9,6,1};
		for(int i=0; i<ary.length-1;i++){
			for(int j=0; j<ary.length-i-1; j++){
				if(ary[j]>ary[j+1]){
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ary));
	}
}
