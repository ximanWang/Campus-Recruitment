package day04.thread;
/**
 * 同步块
 * 有效的缩小同步范围可以提高程序的并发运行效率
 * @author tarena
 *
 */
public class SyncDemo02 {
	public static void main(String[] args) {
		final Shop shop = new Shop();
		Runnable runnable = new Runnable(){
			public void run(){
				shop.buyGoods();
			}
		};
		/**
		 * 创建三个线程，同时调用buyGoods()方法
		 */
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		t1.start();
		t2.start();
		t3.start();
	}
}
class Shop{
	/**
	 * 购买衣服
	 * 基本流程：
	 *   1：挑选衣服
	 *   2：试衣服
	 *   3：结帐
	 */
	public void buyGoods(){
		try {
			System.out.println("挑选衣服...");
			Thread.sleep(5000);
			synchronized(this){
				System.out.println("挑选好了，试试衣服...");
				Thread.sleep(5000);
			}			
			System.out.println("试好了，结帐走人");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}