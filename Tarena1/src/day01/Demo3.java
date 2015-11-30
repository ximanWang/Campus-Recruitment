package day01;

import java.util.*;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated me4747thod stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = scanner.nextInt();
		if(age < 0){
			System.out.println("输入不合法，请重新!");
			age = scanner.nextInt();
		}
		else if(age >= 0 && age < 10)
			System.out.println("你是个小孩");
		else if(age >=10 && age <20)
			System.out.println("你是个青少年");
		else if(age >= 20 && age < 30)
			System.out.println("你是个青年");
		else if(age >= 30 && age <50)
			System.out.println("你是个壮年");
		else if(age >= 50 && age <60)
			System.out.println("你是个大爷");
		else if(age >= 60 && age <90)
			System.out.println("你是个老大爷");
		else if(age >= 90 && age <120)
			System.out.println("你是个太老爷");
		else
			System.out.println("你是个妖怪");}
   
}
