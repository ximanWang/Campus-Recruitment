package day04.thread;
/**
 * 将线程与线程要执行的任务分离开
 * @author tarena
 *
 */
public class RunnableDemo {
	public static void main(String[] args) {
		Runnable p1 = new PersonR1();
		Runnable p2 = new PersonR2();
		/**
		 * 创建的线程是相同的，只是在创建时交给的任务不同
		 */
		Thread t1 = new Thread(p1);
		Thread t2= new Thread(p2);
		
		Thread t3 = new Thread(){
			public void run(){
				System.out.println("第一种方式创建线程");
			}
		};
		Thread t4 = new Thread(new Runnable(){
			public void run(){
				System.out.println("第二种方式创建线程");
			}
		});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
/**
 * 定义一个类并实现Runnable接口，并重写了run方法，
 * run方法中定义线程中要执行的逻辑代码
 * @author tarena
 *
 */
class PersonR1 implements Runnable{
	public void run(){
		for(int i=0; i<1000; i++){			
			System.out.println("你是谁阿？" + i + "次");
		}
	}
}
class PersonR2 implements Runnable{
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println("我是送水的" + i + "次");
		}
	}
}