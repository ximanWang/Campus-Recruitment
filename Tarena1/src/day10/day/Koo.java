package day10.day;

public class Koo {
	public int a = 1;
	protected int b = 2;//在一个包中可见
	int c = 3;//默认访问修饰 在一个包中可见
	private int d = 4;//仅在类内部有效
	public int getD(){
		return d;
	}

}
