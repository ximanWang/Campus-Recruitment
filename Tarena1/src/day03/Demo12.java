package day03;

public class Demo12 {
	/**
	 * 短路逻辑与非短路逻辑
	 *  短路逻辑&& ||
	 *    第一个表达式能够确定整个表达式的结果，
	 *    就不再执行第二个表达式了。称为短路逻辑
	 *  非短路逻辑& |
	 *  
	 *  1)在实际工作中常用短路逻辑
	 *  2)非短路逻辑经常出现在面试和比试环节
	 *  3)只有满足短路条件才发生短路运算！
	 */
	public static void main(String[] args) {
	//业务规则：女的“并且”年龄60岁以上的
		char sex = '男';
		int age = 25;
		//短路
		if(sex == '女' && age++ >= 60){
			System.out.println("欢迎光临！");
		}else{
			System.out.println("欢迎下次来！");
		}
		System.out.println(age);//25 说明发生短路现象
		//非短路
		if(sex == '女' & age++ >= 60){
			System.out.println("欢迎光临！");
		}else{
			System.out.println("欢迎下次来！");
		}
		System.out.println(age);//26 说明发生非短路现象
			
	//业务规则：女的“或者”年龄60岁以上的
		sex = '女';
		age = 25;
		//短路
		if(sex=='女' || age++>60){
			System.out.println("欢迎光临！");
		}else{
			System.out.println("欢迎下次来！");
		}
		System.out.println(age);
		//非短路
		if(sex=='女' | age++>60){
			System.out.println("欢迎光临！");
		}else{
			System.out.println("欢迎下次来！");
		}
		System.out.println(age);
		

	}

}
