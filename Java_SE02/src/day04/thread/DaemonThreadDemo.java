package day04.thread;
/**
 * 后台线程与前台线程
 * @author tarena
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args){
		Thread rose = new Thread(new Runnable(){
			public void run(){
				for(int i=0; i<10; i++){					
					System.out.println("Rose:Let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Rose:AAAAAAAaaaaaaa......");
				System.out.println("噗通！");
			}
		});
		Thread jack = new Thread(new Runnable(){
			public void run(){
				while(true){					
					System.out.println("Jack:You jump! I jump!");
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
					}
				}
			}
		});
		rose.start();
		/**
		 * 设置后台线程方法要在该线程启动之前调用
		 */
		jack.setDaemon(true);
		jack.start();
		System.out.println("main方法执行完了");
	}
}
