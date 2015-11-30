package day04.thread;

public class Exercise01 {
	public static void main(String[] args) {
		final Resourse rs = new Resourse(100);
		for(int i=0; i<10; i++){
			final int num = i;
			Thread t = new Thread(new Runnable(){
				public void run(){
					while(rs.num>0){
						rs.sellTickets(num);
						try {
							Thread.sleep(200);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			});
			t.start();
		}
	}
}
class Resourse{
	int num = 10000;
	public Resourse(int num){
		this.num = num;
	}
	public synchronized void sellTickets(int i){
		if(num > 0){			
			System.out.println("第" + i + "售票点卖出了第"+ num + "张票");
			num--;
		}
	}
}

