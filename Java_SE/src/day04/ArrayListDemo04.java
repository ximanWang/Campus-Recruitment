package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * get方法 用于获取集合元素
 * @author tarena
 *
 */
public class ArrayListDemo04 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		/**
		 * 获取回来是是以Object获取的，所以要造型
		 */
		String element = (String)list.get(2);
		System.out.println(element);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/**
		 * 将元素“2”替换为元素“二”
		 * 同样的，索引值不能超过size()-1
		 */
		Object old = list.set(1, "二");
		System.out.println(list);
		System.out.println("被替换的元素:" + old);//被替换的元素
		/**
		 * 在集合中第二个位置上插入元素“一”
		 */
		//
		list.add(1,"一");
		System.out.println(list);
		/**
		 * 删除第3个元素
		 */
		Object re = list.remove(2);
		System.out.println(list);
		System.out.println(re);
		
		//查看“3”在集合中的位置
		int index = list.indexOf("3");
		System.out.println("3在集合中的位置：" + index);
	}
}
