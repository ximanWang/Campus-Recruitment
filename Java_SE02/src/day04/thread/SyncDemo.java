package day04.thread;

import day04.thread.Table.Person;

/**
 * 线程安全问题
 * 出现的情形：
 * 当线程访问同一段数据时，就会引发线程安全问题
 * @author tarena
 *
 */
public class SyncDemo {
	public static void main(String[] args){
		Table table = new Table();
		Person p1 = table.new Person();
		Person p2 = table.new Person();
		p1.start();
		p2.start();
	}
}
class Table{
	int bean = 20;
	public synchronized int getBean(){
		if(bean == 0){			
			throw new RuntimeException("没豆子啦！");
		}
		Thread.yield();
		return bean--;
	}
	//内部类
	class Person extends Thread{
		public void run(){
			while(true){
				int bean = getBean();//从桌子上取一个豆子
				/**
				 * String getName()
				 * Thread提供的方法
				 * 用于获取当前线程的名字，这个名字是系统分配的
				 * 通常形式：Thread-0
				 */
				System.out.println(getName() + ":" + bean);
				Thread.yield();
			}
		}
	}
}