package day01;
/**
 * 建议重写toString方法返回，对象的文本描述
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Card ace = new Card(Card.SPADE, Card.ACE);
		String whatIsIt = ace.toString();
		System.out.println(whatIsIt);
		System.out.println(ace);
		Card deuce = new Card(Card.SPADE, Card.DUECE);
		System.out.println(deuce);
	}
}
