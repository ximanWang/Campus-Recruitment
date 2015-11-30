package day04.thread;
/**
 * 方法互斥
 * @author tarena
 *
 */
public class SynMethodDemo {
	public static void main(String[] args) {
		final Bank bank = new Bank();
		//第一个线程取钱
		Thread t1= new Thread(new Runnable(){
			public void run(){
				bank.getMontey(1000);
			}
		});
		//第二个线程存钱
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				bank.addMoney(1000);
			}
		});
		t1.start();
		t2.start();
	}
}
/**
 * 定义两个方法，都是互斥的
 * @author tarena
 *
 */
class Bank{
	int money = 100000;
	//取钱
	public synchronized void getMontey(int money){
		System.out.println("准备取钱...");
		try{
			this.money = this.money - money;
			Thread.sleep(3000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("取钱成功！");
	}
	//存钱
	public synchronized void addMoney(int money){
		System.out.println("准备存钱...");
		try {
			this.money = this.money + money;
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("存钱成功！");
	}
}