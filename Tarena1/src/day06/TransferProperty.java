package day06;

public class TransferProperty {
	int i = 34;//成员变量
	public void call() {  //成员方法
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if (i == 2) {
				System.out.println("\n");
			}
		}
	}
	public TransferProperty(){}//构造方法
	public static void main(String[] args) {
		TransferProperty t1 = new TransferProperty();
		TransferProperty t2 = new TransferProperty();
		t2.i = 30;
		System.out.println(t1.i);
		t1.call();
		System.out.println(t2.i);
		t2.call();

	}

}
