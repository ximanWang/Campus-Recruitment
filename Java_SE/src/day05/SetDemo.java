package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 不重复集Set
 * @author tarena
 *
 */
public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		String str = "element";
		//向list中放入两次同样的元素
		list.add(str);
		list.add(str);
		
		//想set集合中也放两次
		set.add(str);
		set.add(str);
		System.out.println(list.size());//2
		System.out.println(set.size());//1 不重复集
	}
}
