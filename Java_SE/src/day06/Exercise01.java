package day06;

public class Exercise01 {
	private double r;
	private static Exercise01 r0 = new Exercise01();
	private Exercise01(){}
	public static Exercise01 getR(){
		return r0;
	}
}
