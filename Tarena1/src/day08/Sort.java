package day08;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] ary = {2,6,9,5,7,4,3,7,2,1};
		for(int i=0; i<ary.length-1; i++){
			for(int j=0; j<ary.length-i-1; j++){
				if(ary[j] > ary[j+1]){
					int temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ary));
	}
}
