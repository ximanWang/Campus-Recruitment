package day04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 集合中的泛型
 * 用于约数集合中存放的元素类型
 *
 */
public class ArrayListDemo05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		/**
		 * 泛型约束了add方法参数类型
		 */
		list.add("1");
		list.add("2");
		list.add("3");
		/**
		 * 泛型约束了get方法的返回值类型
		 */
		String element = list.get(1);
		System.out.println(element);
		/**
		 * public class ArrayList<E>{
		 *   public boolean add(E e){
		 *     ...
		 *   }
		 *   public E get(int index){
		 *     ...
		 *   }
		 * }
		 */
		/**
		 * 迭代器也支持泛型，只是需要注意，迭代器的泛型
		 * 应该与要迭代的集合的泛型保持一致！
		 */
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String elements = it.next();
		}
		System.out.println(list);
	}
}
