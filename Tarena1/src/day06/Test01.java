package day06;

import java.util.*;

public class Test01 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){ //判断是否有下一个元素
			String str = (String)it.next();//获取集合中元素
			System.out.println(str);
		}
	}

}
