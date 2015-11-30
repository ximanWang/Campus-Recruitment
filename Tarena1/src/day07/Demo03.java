package day07;

import java.util.Random;
import java.util.Scanner;

/**
 * 字母猜测游戏
 * 
 * 业务规则描述：猜测“随机生成”的字符序列(5个)，
 * 根据“用户输入”的字符序列“检查”是否猜测成功
 * 功能分析设计
 *   1) 随机生成(generate)
 *      生成n个不重复的大写字母
 *   2) 用户输入input
 *   3) 检查(check)用户输入
 *      int[] check(char[] answer, char[] input)
 *   4) 提示猜中情况
 *      void show(int count, int[] result)
 *   5) main方法完成猜测流程控制
 *      1)生成答案
 *      2)等待输入
 *      3)检查答案
 *      4)统计回答数量
 *      5)检查结果，返回(2)
 *      
 * 业务数据分析：
 *   1) char[] answer 被猜测字母序列
 *   2) char[] input 用户输入的字符序列
 *   3) int count 猜测次数
 *   4) int[] result = {字符匹配数量，匹配成功位置}
 */

public class Demo03 {
	public static void main(String[] args){
		char[] answer, input;
		int[] result;
		int count = 0;
		System.out.println("欢迎！");
		answer = generate(5);
		System.out.println(answer);
		while(true){
			input = userInput();
			count++;
			result = check(answer, input);
			show(count,result);
			if(result[0]==5 && result[1]==5){
				break;
			}
		}
	}
	public static char[] generate(int n){
		//经典的去除重复的算法
		char[] chs = {'A','B','C','D','E','F','G','H','I'};
		boolean[] used = new boolean[chs.length];//默认初始值是false
		int i;
		char[] answer = new char[n];
		int index = 0;
		Random random = new Random();
		do{
			i = random.nextInt(chs.length);//[0,chs,length)
			if(used[i]){
				continue;
			}
			answer[index++] = chs[i];
			used[i] = true;
		}while(index != n);
		return answer;
	}
    public static char[] userInput(){
    	Scanner in = new Scanner(System.in);
    	char[] input = {};
    	do{    		
    		System.out.println("请猜测字符：");
    		String str = in.nextLine();
    		input = str.toCharArray();//字符串转换到字符数组
    		//“ABCDE” -> ['A','B','C','D','E']
    	}while(input.length != 5);
		return input;
	}
    public static int[] check(char[] answer, char[] input){
    	int[] result = {0,0};
    	for(int i=0; i<=4; i++){
    		for(int j=0; j<=4; j++){
    			if(answer[i] == input[j]){
    				result[0]++;
    				if(i == j){
    					result[1]++;
    				}
    			}
    		}
    	}
		return result;
	}
    public static void show(int count, int[] result){
		if(result[0]==5 && result[1]==5){
			System.out.println("经过"+count+"次努力，猜对了！");
		}else{			
			System.out.println("猜了"+count+"次,匹配字符"+
					result[0]+"个，匹配位置"+result[1]+"个，继续努力！");
		}
	}

}
