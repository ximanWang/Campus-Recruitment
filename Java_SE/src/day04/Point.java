package day04;
/**
 * 泛型
 * @author tarena
 *
 * @param <X>
 * @param <Y>
 */
public class Point<X,Y> {
	private X x;
	private Y y;
	public Point(X x, Y y){
		this.x = x;
		this.y = y;
	}
	public String toString(){
		return "x=" + x + "," + "y=" + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	public X getX() {
		return x;
	}
	public void setX(X x) {
		this.x = x;
	}
	public Y getY() {
		return y;
	}
	public void setY(Y y) {
		this.y = y;
	}
}
