package day07;
/**
 * 数组
 *
 */

public class Demo01 {
	public static void main(String[] args){
		int[] ary = new int[4];
		int[] ary1 = ary;
		ary[0]++;
		System.out.println(ary1[0]);//1 两个变量同一个数组
		//A.编译错误 B.运行异常 C.0 D.1
		
		int[] ary3 = null;//空，没有数组
		int[] ary4 = new int[]{};//空数组，有数组没有元素
		
		System.out.println(ary4.length);//0
		System.out.println(ary3.length);//运行异常 空指针异常
	}

}
