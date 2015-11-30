package day04.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 睡眠阻塞
 * @author tarena
 *
 */
public class SleepBlockDemo {
	public static void main(String[] args){
		/**
		 * 电子表
		 * 输出时间格式 12：23：30
		 */
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		System.out.println(format.format(now));
		while(true){
			now = new Date();
			System.out.println(format.format(now));
			/**
			 * 每隔一秒循环一次
			 */
			try {
				/**
				 * 问题1：捕获异常是为什么?
				 *          原因：通知当前线程正在被中断
				 *          
				 * 问题2：sleep是让当前线程进入阻塞
				 *        那被阻塞的是哪个线程?
				 *        当我们的程序运行时，操作系统会启动一个进程
				 *        来运行我们的JVM，而JVM启动起来后会创建一个
				 *        线程来运行当前类的main方法，从而执行我们的
				 *        程序，这里sleep阻塞的就是这个线程
				 *          
				 * 问题3：循环是1秒钟执行一次吗?
				 *        不是的，只能说阻塞了1秒，阻塞结束后，当前线程
				 *        会回到runnable状态，等待再次分配之间片段从而
				 *        运行，而这段时间就是误差
				 */
				Thread.sleep(1000);
				/**
				 * 获取当前运行main方法的线程
				 */
				Thread.currentThread();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
