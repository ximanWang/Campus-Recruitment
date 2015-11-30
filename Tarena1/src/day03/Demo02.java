package day03;

public class Demo02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '中';
		char c = 20013;
		System.out.println(c);//中
		System.out.println(ch);//中
		
		c = 65535;
		System.out.println(c);
		c = 66;
		System.out.println(c);
		
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');
		System.out.println((int)'王');
		System.out.println((int)'熙');
		System.out.println((int)'曼');
		
		c = '\n';//c是换行字符（new Line）是特殊控制字符
		System.out.println(c);
		c = '\r';//回车字符 return
		System.out.println(c);
		c = '\\';//一个\
		System.out.println(c);
		c = '\'';//'
		System.out.println(c);
		c = '\"';//"
		System.out.println(c);
		c = '\u4e2d';//16进制Unicode编码
		System.out.println(c);
	}

}
