package day02;

import java.util.Arrays;

public class Demo04 {
	public static void main(String[] args) {
		String name = "Tom     \n and Jerry   ";
		name = name.trim().toLowerCase();
		String[] words = name.trim().toLowerCase().split("\\s+");
		System.out.println(name);
		System.out.println(Arrays.toString(words));
	}
}
