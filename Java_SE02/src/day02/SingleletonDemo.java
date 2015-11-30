package day02;
/**
 * 单例模式
 * @author tarena
 *
 */
public class SingleletonDemo {
	private  int width;
	private  int height;
	private SingleletonDemo(){}
	private static SingleletonDemo obj = new SingleletonDemo();
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
	public static SingleletonDemo getObj() {
		return obj;
	}
	public static void setObj(SingleletonDemo obj) {
		SingleletonDemo.obj = obj;
	}
	
	
}
