package day05;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome!");
		String[] names = {"Bob","John","Lily"};
		int[] scores = new int[3];
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("1.输入 2.输出 3.查询 0.退出");
			String cmd = in.nextLine();
			if("0".equals(cmd)){
				break;
			}else if("1".equals(cmd)){
				for(int i=0; i<scores.length; i++){
					System.out.println(i+1+" "+names[i]+":");
					String str = in.nextLine();
					scores[i] = Integer.parseInt(str);		
				}
			}else if("2".equals(cmd)){
				for(int i=0; i<scores.length; i++){
					System.out.println(scores[i]);
				}
				
			}else if("3".equals(cmd)){
				System.out.println("请输入姓名：");
				String name = in.nextLine();
				for(int i=0; i<scores.length; i++){
					if(names[i].endsWith(name)){
						System.out.println(scores[i]);
					}
				}
			}else{
				System.out.println("输入命令不正确！");
			}
		}

	}

}
