package day02;
/**
 * StringBuilder
 * StringBuilder 的API 方法是对其内部char[]内容进行增删改查操作
 */
public class Demo05 {
	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder();
		buf.append("大师李敖").append("说")
		.append("的前妻").append("胡茵梦")
		.append("非常漂亮").delete(0, 2).insert(2,"先生").insert(5, "他");
		System.out.println(buf);
	}
}
