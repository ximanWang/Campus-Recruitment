package day06;

public class Test03 {
	static int avg(int num1, int num2) throws MyException{
		if(num1<0 || num2<0){
			throw new MyException("不可以使用负数");
		}
		if(num1>100 || num2>100){
			throw new MyException("数值太大了");
		}
		return (num1 + num2)/2;
	}
	public static void main(String[] args){
		 try{
			 int result = avg(102,220);
			 System.out.println(result);
		 }catch(MyException e){
			 System.out.println(e);
		 }
	}

}
