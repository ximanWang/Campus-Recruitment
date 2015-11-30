package day07;

import java.util.Random;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] answer;
		char[] input;
		int[] result = {0,0};
		int count = 0;
		System.out.println("欢迎！");
		answer = generate(5);
		System.out.println(answer);
		while(true){
			input = userInput();
			count++;
			result = check(answer,input);
			show(count,result);
			if(result[0]==5 && result[1]==5){
				break;
			}
		}
		
	}
	public static char[] generate(int n){
		char[] chs = {'A','B','C','D','E','F','G'};
		boolean[] used = new boolean[chs.length];
		int i;
		char[] answer = new char[n];
		int index = 0;
		Random random = new Random();
		do{
			i = random.nextInt(chs.length);
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
			System.out.println("请猜测：");
			String str = in.nextLine();
			input = str.toCharArray();//字符数组
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
			System.out.println("猜了"+count+"次，猜对了！");
		}else{
			System.out.println("猜了"+count+"次，字符对应"+result[0]+"个,位置对应"+result[1]+"个，继续努力！");
		}
		
	}

}
