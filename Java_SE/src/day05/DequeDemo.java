package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 存取遵循先进后出原则
 * 栈有良好的历史追溯性
 * @author tarena
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> stack = new LinkedList<String>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		System.out.println(stack);
		
		//获取栈首元素，但不能从栈中删除
		System.out.println(stack.peek());
		
		String str = null;
		/**
		 *栈的使用中，要首先使用peek判断栈首是否有元素，在调用
		 *pop方法来获取，否则引发异常 
		 */
		while(stack.peek() != null){
			str = stack.pop();
			System.out.println(str);
		}
	}
}
