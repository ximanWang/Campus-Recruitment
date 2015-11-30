package com.tarena.test;

import com.tarena.tetris.Tetromino;
/**
 * 测试随机产生的类型
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Tetromino t = Tetromino.randomOne();
		System.out.println(t);
	}

}
