package day01;
/**
 * indexOf 查找字符串序号
 *
 */
public class Demo09 {
	public static void main(String[] args) {
		String str = "Think in Java";
		int index = str.indexOf("Java");//9
		System.out.println(index);
		index = str.indexOf("PHP");
		System.out.println(index);//-1
		
		index = str.indexOf('i', 3);
		System.out.println(index);
		
		//subString 取子字符串，截取字符串的一部分
		String s = str.substring(6,8);
		System.out.println(s);//in
		
		String email = "liucangsong@gmail.com";
		String name = email.substring(0,email.indexOf("@"));
		System.out.println(name);
		String host = email.substring(email.indexOf("@")+1);
		System.out.println(host);
	}
}
