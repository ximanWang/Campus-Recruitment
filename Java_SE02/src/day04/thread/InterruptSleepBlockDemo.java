package day04.thread;
/**
 * 中断睡眠阻塞
 * @author tarena
 *
 */
public class InterruptSleepBlockDemo {
	public static void main(String[] args) {
		/**
		 * 林永健线程，处于睡眠阻塞的线程
		 */
		final Thread lin = new Thread(new Runnable(){
			public void run(){
				System.out.println("林：刚美完容，睡觉去了");
				try {
					Thread.sleep(1000000);//进入睡眠阻塞
				} catch (InterruptedException e) {
					System.out.println("林：干嘛呢干嘛呢干嘛呢！都破相了！");
				}
			}
		});
		/**
		 * 黄宏线程，用于中断林永健睡眠阻塞
		 */
		Thread huang = new Thread(new Runnable(){
			public void run(){
				System.out.println("黄：开始砸墙！");
				for(int i=0; i<5; i++){
					System.out.println("黄：80！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("咣铛！");
				System.out.println("搞定！");
				//中断林永健的线程，打断其睡眠阻塞
				/**
				 * 一个方法的局部内部类中若要引用该方法的其他局部变量
				 * 这些变量必须是final的
				 */
				lin.interrupt();
			}
		});
		lin.start();
		huang.start();
	}
}
