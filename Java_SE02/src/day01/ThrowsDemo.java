package day01;
/**
 * 定义方法时可以声明要抛出的异常
 * 使用throws语句
 * @author tarena
 *
 */
public class ThrowsDemo {
	/**
	 * 当方法中调用的其他方法声明了throws时，我们可以：
	 * 1.在当前方法中try-catch解决这个问题
	 * 2.在当前方法上声明throws,继续异常向外抛出
	 * 
	 * 这里需要注意的是，不要将异常的抛出定义到main方法上
	 * 
	 * 面试中笔试可能问：throw与throws区别
	 * @param args
	 */
	public static void main(String[] args){
		//连接数据库
		try {
			connectionDB("192.168.2.1");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//保存数据
		System.out.println("保存数据");
		//通知用户
		System.out.println("注册成功！");
	}
	/**
	 * 连接数据库
	 * throws 可以抛出多个异常，每一个异常以","隔开即可
	 * 不要在方法中定义在方法中不会抛出的异常！
	 * 通常方法中throw什么异常，throws就要定义什么异常
	 */
	public static void connectionDB(String url)throws Exception{
		if("192.168.1.1".equals(url)){
			System.out.println("数据库连接成功！");
		}else{
			//连接失败，模拟报错
			throw new Exception("连接数据库异常！");
		}
	}
}
