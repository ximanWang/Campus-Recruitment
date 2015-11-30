package day05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author tarena
 *
 */
public class ComparableDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("able");
		list.add("adam");
		list.add("marry");
		list.add("killer");
		list.add("BOSS");
		list.add("TOM");
		System.out.println(list);
		/**
		 * 使用字符串定义的比较规则进行自然排序
		 */
		Collections.sort(list);
		/**
		 * 不希望使用字符串的比较规则排序，而是按照字符的多少进行
		 * 比较后排序
		 */
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		/**
		 * 通常我们使用匿名内部类的形式创建临时的比较规则
		 */
		Comparator<String> comparator = new Comparator<String>(){
			public int compare(String o1, String o2){
				return o2.length() - o1.length();
			}
		};
		Collections.sort(list, comparator);
		System.out.println(list);
	}
}
/**
 * 自定义比较器
 * @author tarena
 *
 */
class MyComparator implements Comparator<String>{
/**
 * 比较规则：
 */
	public int compare(String str1, String str2) {
	
		return str1.length() - str2.length();
	}
}