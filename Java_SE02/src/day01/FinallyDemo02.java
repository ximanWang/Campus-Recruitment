package day01;
/**
 * 面试问题：final(修饰类、方法、属性)与finally区别
 * @author tarena
 *
 */
public class FinallyDemo02 {
	public static void main(String[] args) {
		try{			
			String age = "abc";
			System.out.println("连接数据库");
			System.out.println("保存年龄：" + Integer.parseInt(age));
		}catch(Exception e){
			System.out.println("出错了");
		}finally{
			System.out.println("关闭数据库");
		}
		System.out.println("程序退出了!");
	}
}
