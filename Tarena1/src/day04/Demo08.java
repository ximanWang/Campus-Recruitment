package day04;

import java.util.Scanner;

/**
 * 个人所得税计算
 */
public class Demo08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入薪水：");
		double salary = in.nextDouble();//薪水，税前薪资
		double payTax;//应税薪资
		double tax;//税金
		double income;//税后收入
		payTax = salary - 3500;
		if(payTax<=0){
			tax = 0;
		}else if(payTax <= 1500){
			tax = payTax*(3d/100);
		}else if(payTax <= 4500){
			tax = payTax*(10d/100) - 105;
		}else if(payTax <= 9000){
			tax = payTax*(25d/100) - 555;
		}else if(payTax <= 35000){
			tax = payTax*0.30 - 555;
		}else if(payTax <= 55000){
			tax = payTax*0.35 - 555;
		}else if(payTax <= 80000){
			tax = payTax*0.4 -2755;
		}else{
			tax = payTax*0.45 - 13505;
		}
		income = salary - tax;
		System.out.println(income);
	} 

}
