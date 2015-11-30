package day05;
/**
 * 菲波纳且
 * 数列
 * f(n)/f(n+1)=0.618
 * 
 * 计算 第n项
 * 1) 功能：计算数列第n项
 * 2) 功能实现：n项是前两项的和 推理 从第一项加到第n项
 */

public class TestRabbits {

	public static long f(int n){
		long f1 = 1;
		long f2 = 1;
	    long fn = 1;
	    for(int i=3; i<=n; i++){
	    	fn = f1+f2;
	    	f1 = f2;
	    	f2 = fn;
	    }
	    return fn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(8));
		System.out.println((double)f(50)/f(51));

	}

}
