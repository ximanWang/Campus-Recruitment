package day04;

public class Demo15 {

	/**
	 * continue语句用于在循环中，用于结束本次循环
	 * 而开始下一次循环
	 * break在嵌套循环结构中，break用于退出所在循环体；
	 * 如果要退出外层的循环体，需要使用标号的方式。
	 * for(...){
	 *     for(...){
	 *     break;
	 *     }
	 *   }
	 * outer:for(...){
	 *          for(...){
	 *             break outer;
	 *             }
	 *          }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<=10; i++){
			if(i==5)continue;
			System.out.println(i);
		}
		for(int i=0; i<=10; i++){
			if(i==5)break;
			System.out.println(i);
		}
	}

}
