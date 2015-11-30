package day06;
/**
 * 模板模式
 * @author tarena
 *
 */
public abstract class Person {
	//介绍自己，打招呼
	public void sayHello(){
		//打招呼
		System.out.println("大家好！");
		//介绍自己名字
		System.out.println("我叫："+ getName());
		//介绍自己的情况
		System.out.println(getInfo());
		//说拜拜
		System.out.println(sayGoodBye());
	}
	/**
	 * 获取自己的名字
	 * @return
	 */
	public abstract String getName();
	/**
	 * 获取自己的信息
	 * @return
	 */
	public abstract String getInfo();
	/**
	 * 说再见
	 * @return
	 */
	public abstract String sayGoodBye();
}
