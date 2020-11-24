package com.king.test;

public class Test {
	public static void main(String[] args) {
		// 测试
		System.out.println("Test");

		// 创建一个原始的二维数组
		int[][] chessArray1 = new int[11][6];
		// 0：没有棋子；1：表示黑子；2：表示蓝子
		chessArray1[1][2] = 1;
		chessArray1[2][3] = 2;
		chessArray1[4][5] = 2;

		System.out.println(chessArray1[0].length);
	}

}
