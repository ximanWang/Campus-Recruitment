package day08;

import java.util.Arrays;

/**
 * 重载：名字一样，详细功能不同！
 * 
 * 1) 运算符重载(只有“+”)
 * 2) 方法重载：方法名一样，参数不同
 *  2.1)如：打车，打酱油，打牌
 *     println(‘中’)  “打印”字符
 *     println((int)'中')
 *     
 * 3) 构造器重载：构造名一样，参数不同
 */
public class Demo09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = {'A','B','C'};
		char[] chs = {'A','B','C'};
		//如下方法println()是两个不同的重载方法
		System.out.println(Arrays.toString(ary));//打印ary.toString()的结果
		System.out.println(Arrays.toString(chs));//字符数组按照字符串打印
		Cell2 c1 = new Cell2(4,5);
		c1.drop();
		c1.drop(5);
		System.out.println(c1.row);
		Cell2 c2 = new Cell2(4,5,0xcc0ff);
	}
}
class Cell2{
	int row;//属性，实例变量
	int col;
	int color;
	//重载构造器
	public Cell2(int row, int col, int color){
		this.col = col;
		this.row = row;
		this.color = color;
	}
	public Cell2(int row, int col){
		this.row = row;
		this.col = col;
	}
	public void drop(){
		row++;
	}
	public void drop(int step){
		row+=step;//下落n步(step)
	}
}
