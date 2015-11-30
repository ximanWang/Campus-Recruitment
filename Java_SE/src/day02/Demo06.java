package day02;

public class Demo06 {
	public static void main(String[] args) {
		System.out.println(test2(50000));
		System.out.println(test1(50000));
	}
	public static long test1(int num){
		long start = System.currentTimeMillis();
		String s = "";
		for(int i=0; i<num; i++){
			s += "A";
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	public static long test2(int num){
		long start = System.currentTimeMillis();
		StringBuilder buf = new StringBuilder();
		for(int i=0; i<num; i++){
			buf.append("A");
		}
		String s = buf.toString();
		long end = System.currentTimeMillis();
		return end - start;
	}
}
