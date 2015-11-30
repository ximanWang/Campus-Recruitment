package day06;
/**
 * 单例模式
 * 当前类的实例，全局唯一
 * @author tarena
 *
 */
public class SingletonDemo {
	private int width;
	private int height;
	/**
	 * 定义一个私有的当前类型的属性
	 */
	private static SingletonDemo obj = new SingletonDemo();
	/**
	 * 私有化构造方法
	 * 目的是为了组织外界通过new关键字创建实例
	 */
	private SingletonDemo(){
	}
	/**
	 * 定义一个公用的静态方法，用于获取当前类型的实例
	 * @return
	 */
	public static SingletonDemo getInstance(){
		return obj;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
