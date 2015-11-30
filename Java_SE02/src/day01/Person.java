package day01;

public class Person {
	private int age;
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		if(age > 100){				
		  throw new RuntimeException("年龄不合法！");
		}
		this.age = age;
	}
	public static void main(String[] args) {
		Person p = new Person();
		try{			
			p.setAge(1000);
		}catch(Exception e){
			//输出异常的堆栈信息，就是异常出现的执行过程
			System.out.println(e.getMessage());
			e.printStackTrace();//jvm输出异常的过程
		}
	}
}
