package day03;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		println("");
		println(new Date());
		int i = 1;
		Integer ii = new Integer(1);
		println(ii);
	}
	public static void println(Object obj){
		String str = obj.toString();
	}
}
