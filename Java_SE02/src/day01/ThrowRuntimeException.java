package day01;
/**
 * 方法中抛出RuntimeException及其子类
 * 不需要在该方法声明时定义throws
 * @author tarena
 *
 */
public class ThrowRuntimeException {
	public static void main(String[] args) {
		connectionDB();
	}
	public static void connectionDB(){
		/**
		 * 方法中抛出RuntimeException及其子类时
		 * 方法声明时可以不写throws
		 * RuntimeException称之为非检查异常
		 * 就是当编译的过程中发现了这类异常的抛出时，是可以编译通过的
		 * 但是除此之外，抛出的异常类型若不写throws或捕获的话编译是不通过的
		 * 常见的RuntimeException的子类：
		 * NullPointerException
		 * ArrayIndexOutOfBoundsException
		 * NumberFormatException
		 * ClassCastException
		 */
		throw new RuntimeException("报错！");
	}
}
