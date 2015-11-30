package day06;
/*
 * 方法中抛出异常
 */
public class Test04 {
	static void pop()throws NegativeArraySIzeException{
		int[] arr = new int[-3];
	}
	public static void main(String[] args){
		try{
			pop();
		}catch(NegativeArraySIzeException e){
			System.out.println("pop方法抛出异常！");
		}
		
	}

}
