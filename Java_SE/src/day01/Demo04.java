package day01;

public class Demo04 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		String s3 = new String("A");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
