package day06;

public class Test05 extends Exception{
	String message;
	public Test05(String ErrorMessage){
		message = ErrorMessage;
	}
	public String getMessage(){
		return message;
	}

}
