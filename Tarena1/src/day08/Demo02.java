package day08;

public class Demo02 {

	/**
	 * f(n) = 1+2+...+n = f(n-1)+n且f(1) = 1
	 *递归
	 * 1) 优点，解决问题简洁，只要知道第一层就可以解决全部问题
	 * 2) 要注意给出适当的结束条件
	 * 3) 不要进行太深的递归，否则会出现 栈溢出错误
	 * 4) 不要进行发散递归
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int y = f(n);
		System.out.println(y);

	}
	public static int f(int n){
		if(n == 1){//递归结束条件
			return 1;
		}
		return f(n-1)+n;
	}

}
