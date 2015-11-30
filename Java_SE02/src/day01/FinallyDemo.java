package day01;
/**
 * finally语句块
 * @author tarena
 *
 */
public class FinallyDemo {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		try{
			String str = null;			
			System.out.println(str.length());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			//无论try语句是否报错，finally语句块都会执行
			System.out.println("finally语句块内容");
		}
		System.out.println("程序结束！");
	}
}
