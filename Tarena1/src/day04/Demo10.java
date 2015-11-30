package day04;

public class Demo10 {

	/**
	 * for循环
	 * 1)经典的for常用于计次循环。
	 * 2)for循环可以代替其他的循环结构。
	 * 
	 * 经典的for循环使用
	 *   for(初始化表达式(1);循环条件boolean(2);递增表达式(3);){
	 *     循环体(4)
	 *   }
	 * 流程：
	 *   (1)->[(2)->true->(3)->(4)]->[(2)->true->(3)->(4)]
	 *   ->(2)->false->(5)->end
	 * (1)只执行一次！
	 * (2)->(3)->(4)流程反复循环执行
	 * (2)->false->结束循环流程
	 */
	public static void main(String[] args) {
		//经典案例：实现10以内的奇数和 1+3+5+7+9
		int sum = 0;
		for(int i=2; i<10; i+=2){
			sum += i;
		}
		System.out.println(sum);
	}

}
