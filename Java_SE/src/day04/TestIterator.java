package day04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("6");
		list.add("4");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			it.next();
		}
		System.out.println(list);
	}
}
