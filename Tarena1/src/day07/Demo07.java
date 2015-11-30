package day07;

import java.util.Arrays;

/**
 * 数组的复制
 * 
 */

public class Demo07 {
	public static void main(String[] args) {
		int[] ary1 = {5,6,7};
	    int[] ary2 = ary1;
	    ary1[0] = 10;
	    System.out.println(Arrays.toString(ary1));
	    System.out.println(Arrays.toString(ary2));
	    //复制数组  复制ary1引用的数组
	    int[] ary3 = new int[ary1.length];
		for(int i=0; i<ary1.length; i++){
			//i = 0 1 2
			ary3[i] = ary1[i];
		}
		System.out.println(Arrays.toString(ary3));
		//java提供了复制数组的API，可以简化复制，提高性能
		int[] ary4 = new int[ary1.length];
		//             源，源位置，目标，目标位置，数量
		System.arraycopy(ary1, 0, ary4, 0, ary1.length);
		//  ary1->{10,6,7}
		//         0  1 2
		//  ary4->{10,6,7}
        //         0  1 2
		System.out.println(Arrays.toString(ary4));
		//Arrays.copyOf()// 更加便捷的复制数组，java 5+
		int[] ary5 = Arrays.copyOf(ary1, 7);
	}

}
