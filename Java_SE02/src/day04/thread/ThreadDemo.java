package day04.thread;
/**
 * 多线程
 * @author tarena
 *
 */
public class ThreadDemo {
	public static void main(String[] args) {
		Thread p1 = new Person1();
		Thread p2 = new Person2();
		/**
		 * 要注意：
		 * 启动线程不能去掉要run方法，而是调用start()方法
		 * 否则两个线程不是并发运行的了
		 */
		p1.start();
		p2.start();
	}
}
/**
 * 重写run方法，在其中定义要并发运行的任务代码
 * @author tarena
 *
 */
class Person1 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("你是谁阿？"+ i + "次");
		}
	}
}
class Person2 extends Thread{
	public void run(){
		for(int i=0; i<10; i++){
			System.out.println("我是送水的"+ i + "次");
		}
	}
}