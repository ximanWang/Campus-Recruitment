package day04;

public class Demo14 {

	/**
	 * sum = 9+99+999+9999+...+99999999..
	 * num = num*10+9
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0;
		long num = 0;
		for(int i=0; i<5; i++){
			num = num*10+9;
			sum+=num;
			//跟踪语句，跟踪软件运行期间,变量的值
			System.out.println(i+1+","+num+","+sum);
		}
		System.out.println(sum);

	}

}
