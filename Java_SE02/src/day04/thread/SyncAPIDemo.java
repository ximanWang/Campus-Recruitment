package day04.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

/**
 * 获取线程安全的集合
 * @author tarena
 *
 */
public class SyncAPIDemo {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		/**
		 * 转换为线程安全的
		 * 所有集合都支持一个以参数为：Collection的构造方法
		 * 这个构造方法的作用可以在创建当前集合的基础上，将
		 * 给定的集合元素放入其中。
		 * 这个构造方法通常习惯叫它为：集合的复制构造器
		 */
		List<String> vector = new Vector<String>(list);
		Set<String> set = new HashSet<String>(list);
		System.out.println("Vector" + vector);
		System.out.println("HashSet:" + set);
		/**
		 * 使用Collections的方法，可以方便的将一个集合变成线程安全的
		 */
		List<String> synList = Collections.synchronizedList(list);
		System.out.println("synList:" + synList);
		Set<String> synSet = Collections.synchronizedSet(set);
		System.out.println("synSet" + synSet);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		Map<String,Integer> synMap = Collections.synchronizedMap(map);
		System.out.println("synMap:" + synMap);
	}
}
