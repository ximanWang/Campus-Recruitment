package day06;

import java.util.*;

public class Test02 {
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)Math.random()*(list.size() - 1);
		System.out.println(list.get(i));
		list.remove(2);
		for(int j=0; j<list.size(); j++){
			System.out.println(list.get(j));
		}
	}
           
}
