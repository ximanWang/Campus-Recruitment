package day03;
/**
 * int 类型的包装类Integer
 * 
 */
public class IntegerDemo {
	public static void main(String[] args){
		Integer i = new Integer(1);
		Integer i2 = new Integer(1);
		System.out.println(i == i2);//false 比较地址
		
		//建议选择使用valueOf的形式创建包装类
		Integer i3 = Integer.valueOf(1);
		Integer i4 = Integer.valueOf(1);
		System.out.println(i3 == i4);//true 同一个对象
		
		Double d1 = Double.valueOf(2.1);
		Double d2 = Double.valueOf(2.1);
		System.out.println(d1 == d2);
		
		Integer i5 = Integer.valueOf(50);
		int i6 = i5.intValue();//将包装类转化为基本数据类型
		
		Double d = new Double(1.2);
		double dd = d.doubleValue();
		/**
		 * java 1.4下面代码不行，有语法错误
		 * java 1.5下面代码可以，因为1.5以后多了个特性
		 * 自动拆箱：自定将包装类对象转化为基本类型
		 * 自动装箱：自动将基本类型转化为包装类对象
		 */
		int a = i5;//自动拆箱 对象-->基本类型 //int a = i5.intValue();
		Integer aa = 1;//自动装箱 基本类型-->对象 //Integer aa = Integer.valueOf(1);
		
		
	}
}
