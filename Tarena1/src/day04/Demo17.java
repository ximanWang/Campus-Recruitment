package day04;

public class Demo17 {

	/**
	 * 打印出1000以内的所有质数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 2; num <= 1000; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {// 如果整除i就是num约数
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(num + "是质数");
			}
		}

		nextNum: for (int num = 2; num < 1000; num++) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					continue nextNum;
				}
			}
			System.out.println("找到质数" + num);
		}
	}
}
