package day04;

public class Demo02 {

	/**
	 * 赋值表达式
	 * 赋值表达式的值是赋值的结果
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println(a=8);
		System.out.println(a);
		int b;
		b = (a = 9);//将a＝9表达式结果赋值给b
		System.out.println(a + "," +b);//9,9
		a = 1;
		a = a+2;//简化为a+=2复合赋值运算！
		a+=2;//5
		System.out.println(a);//5
		a*=2;
		System.out.println(a);//10
		System.out.println(a*=2);//20
		
		int num = 562912;
		while(num!=0){
			int last = num%10;
			System.out.println(last);
			num/=10;//num = num/10
		}
	}

}
