package day04;

public class TestPoint {
	public static void main(String[] args) {
		Point<Double,String> p = new Point<Double,String>(1.1,"2.2");
		Point<Integer,Integer> p1 = new Point<Integer,Integer>(1,2); 
		/**
		 * 若使用时不指定泛型，泛型默认类型就是Object
		 */
		Point p2 = new Point(1.1, 2);
		p.setX(1.2);
		p.setY("2");
	}
}
