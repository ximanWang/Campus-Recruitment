package day04.thread;
/**
 * 线程的优先级
 * @author tarena
 *
 */
public class PriorityDemo {
	public static void main(String[] args) {
		Thread max = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10000; i++){
					System.out.println("max");
				}
			}
		});
		Thread norm = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10000; i++){
					System.out.println("norm");
				}
			}
		});
		Thread min = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10000; i++){
					System.out.println("min");
				}
			}
		});
		/**
		 * 设置优先级
		 */
		min.setPriority(Thread.MIN_PRIORITY);
		norm.setPriority(Thread.NORM_PRIORITY);
		max.setPriority(Thread.MAX_PRIORITY);
		min.start();
		norm.start();
		max.start();
	}
}
