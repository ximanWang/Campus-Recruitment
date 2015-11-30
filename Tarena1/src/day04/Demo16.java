package day04;

public class Demo16 {

	/**
	 *判断一个数num是否是质数
	 *i从2到num/2逐一比较i是否是num的约数（整数）
	 *如果找到任何一个约数，这个数就不是质数。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime = true;
		int num = 24;
		for(int i=2; i<=num/2; i++){
			if(num%i==0){//如果整除i就是num约数
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println("是质数");
		}else{
			System.out.println("不是质数");
		}
	}

}
