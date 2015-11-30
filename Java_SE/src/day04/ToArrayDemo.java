package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将集合转化为指定的数组
 * @author tarena
 *
 */
public class ToArrayDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);
		
		//Object[] array = list.toArray();
		/**
		 * 转换时需要注意：
		 * 1.参数给定的就是具体要转换的数组的实例，但不需要长度
		 * 2.返回时要造型
		 * 3.一定要注意，要转换的数组类型要和集合中存放的类型一致
		 * 所有数组都是Array类型
		 */
		String[] strString = (String[])list.toArray(new String[0]);
		System.out.println(Arrays.toString(strString));
		
	}
}
