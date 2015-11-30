package day05;

import java.util.ArrayList;
import java.util.List;

/**
 * 取子集
 * @author tarena
 *
 */
public class SubListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++){
			list.add(i);
		}
		System.out.println(list);
		//基本类型不能作为泛型
		List<Integer> subList = list.subList(3, 8);
		System.out.println(subList);
		//将子集元素扩大十倍
		for(int i=0; i<subList.size(); i++){
		  /*int sub = subList.get(i);
			sub *= 10;
			subList.set(i, sub);
		  */
			subList.set(i, subList.get(i)*10);
		}
		System.out.println(subList);
		//对自己的修改会影响原集合
		System.out.println(list);
	}
}
