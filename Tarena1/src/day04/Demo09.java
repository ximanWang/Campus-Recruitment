package day04;

import java.util.Scanner;

public class Demo09 {

	/**
	 * switch case语句  性能十分优秀！
	 * 只能根据整数参数进行分支操作
	 * switch 开关
	 * case 情况下
	 * 根据分数来计算分数级别：优秀 良好 中等。。。
	 * if 多路嵌套 条件灵活，适应性广，性能相对于switch case差
	 * 如果是根据整数多路分支：switch case
	 * 其他情况下:if 嵌套分支
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int score = in.nextInt();//分数 百分制
		String leverl;//级别
		switch(score/10){
		case 10:
		case 9:leverl = "优秀";break;
		case 8:leverl = "良好";break;
		case 7:leverl = "中等";break;
		case 6:leverl = "及格";break;
		default: leverl = "不及格";
		}
		System.out.println(leverl);

	}

}
