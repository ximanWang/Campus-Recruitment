package day01;
/**
 * Java的异常捕获机制
 * try catch
 * @author tarena
 *
 */
public class TryCatchDemo {
	public static void main(String[] args) {
		try{
			String str = "abc";
			int num = Integer.parseInt(str);
			/**
			 * 当jvm执行到str.length()时发现了str是null
			 * 这时候会创建一个NullPointerException实例
			 * 并将这次的错误信息设置到这个实例中，并抛出
			 */
			System.out.println(str.length());
			System.out.println(str.charAt(1));
			/**
			 * 捕获异常的好习惯，应该在最后一个catch中加入Exception
			 * 这样可以保证程序不会因为没有捕获一个未知的异常而中断
			 * 而捕获最大的这个Exception应该放在所有catch语句的最后
			 */
		}catch(NullPointerException e){
			System.out.println("这里有个空指针！");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("字符串下标越界啦！");
		}catch(Exception e){
			System.out.println("出了个错！");
		}
		System.out.println("程序结束了");
	}
}
