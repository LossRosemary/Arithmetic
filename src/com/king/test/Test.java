package com.king.test;

public class Test {
	public static void main(String[] args) {
		// ����
		System.out.println("Test");

		// ����һ��ԭʼ�Ķ�ά����
		int[][] chessArray1 = new int[11][6];
		// 0��û�����ӣ�1����ʾ���ӣ�2����ʾ����
		chessArray1[1][2] = 1;
		chessArray1[2][3] = 2;
		chessArray1[4][5] = 2;

		System.out.println(chessArray1[0].length);
	}

}
