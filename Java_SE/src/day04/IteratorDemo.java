package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用迭代器遍历集合
 *
 */
public class IteratorDemo {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("#");
		list.add("4");
		//获取用于遍历集合的迭代器
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			//String element = (String)it.next();
			//System.out.println("这一项是："+element);
			System.out.println(it.next());
		}
		it = list.iterator();
		while(it.hasNext()){
			String element = (String)it.next();
			if("#".equals(element)){//字面量equals变量
				it.remove();//删除刚被迭代出来的元素,不能通过集合删除元素
			}
		}
		System.out.println(list);
		
	}
}
