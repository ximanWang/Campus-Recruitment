package day10;
/**
 * Java 的二维数组
 * 1) Java本质上没有二维数组，Java的二维数组是元素数组的数组
 *   也就是元素是数组的一维数组
 * 2) 
 */
public class Demo11 {
	public static void main(String[] args) {
		int[][] ary = {{3,4,5},{4,5},{4,5,6}};
		System.out.println(ary[1][1]);
		//System.out.println(ary.length);
		//System.out.println(ary[1].length);
		//System.out.println(ary[0].length);
		
		Cell[][] wall = new Cell[20][10];
		Cell[] line = wall[19];
		System.out.println(wall.length);
		System.out.println(line.length);
	}
}
