package day06;

public class Test06 {
	static int quotient(int x, int y) throws MyException{
		if(y < 0){
			throw new MyException("除数不能是负数！");
		}
		return x/y;
	}
	public static void main(String[] args){
		try{
			int result = quotient(0,0);
		}catch(MyException e){
			System.out.println(e.getMessage());//输出异常信息
		}catch(ArithmeticException e){
			System.out.println("除数不能为0");
		}catch(Exception e){
			System.out.println("发生其他异常！");
		}
	}

}
