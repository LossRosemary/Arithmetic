package com.king.code.sparsearray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//	��ά���� --> ϡ�������˼· 
//		1. ����ԭʼ�Ķ�ά���飬�õ���Ч���ݵĸ��� sum 
//		2. ���� sum ���Ϳ��Դ���ϡ������int[sum + 1][3]  sparseArr  
//		3. ����ά�������Ч�������ݴ��뵽ϡ������

//	ϡ������ --> ԭʼ�Ķ�ά�����˼· 
//		1. �ȶ�ȡϡ������ĵ�һ�У����ݵ�һ�е����ݣ�����ԭʼ�Ķ�ά���� 
//		2.�ڶ�ȡϡ��������е����ݣ�������ԭʼ�Ķ�ά���鼴��

public class SparseArray {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("sparseArray.txt"));
		BufferedReader br = new BufferedReader(new FileReader("sparseArray.txt"));

		// ����һ��ԭʼ�Ķ�ά����
		int[][] chessArray1 = new int[11][11];
		// 0��û�����ӣ�1����ʾ���ӣ�2����ʾ����
		chessArray1[1][2] = 1;
		chessArray1[2][3] = 2;
		chessArray1[4][5] = 2;
		// System.out.println(chessArray1.length);
		// ���ԭʼ��ά����
		System.out.println("~~~~~~ԭʼ��ά����~~~~~~");
		for (int[] row : chessArray1) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

		// ��ά���� ---- > ϡ������
		// 1���ȱ������飬�õ���0���ݵĸ���
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArray1[i][j] != 0) {
					sum++;
				}
			}
		}

		// 2��������Ӧ��ϡ�����飬����ֵ
		int[][] sparseArr = new int[sum + 1][3];
		sparseArr[0][0] = chessArray1.length;
		sparseArr[0][1] = chessArray1[0].length;
		sparseArr[0][2] = sum;

		// 3 ��������ά���飬�����ݴ�ŵ�ϡ��������
		int count = 0; // ���ڼ�¼�ڼ�����0����
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArray1[i][j] != 0) {
					count++;
					sparseArr[count][0] = i;
					sparseArr[count][1] = j;
					sparseArr[count][2] = chessArray1[i][j];
				}
			}
		}
		System.out.println("~~~~~~~~~~ϡ������~~~~~~~~~~~~~~");
		// ���ϡ������
		for (int[] row : sparseArr) {
			for (int data : row) {
				System.out.printf("%d\t", data);
				bw.write(data + "\t");
			}
			System.out.println();
			bw.write("\r\n");
		}
		bw.flush();
		bw.close();

		// ���ļ��ж�ȡϡ������
		String line = null;
		int row = 0;

		// ����һ���յ�ϡ������
		int[][] sparseArr2 = new int[4][3];

		while ((line = br.readLine()) != null) {
			String[] temp = line.split("\t");
			for (int i = 0; i < temp.length; i++) {
				sparseArr2[row][i] = Integer.parseInt(temp[i]);
			}
			row++;
		}

		// ϡ������ ---- > ��ά����
		// 1����ȡϡ������ĵ�һ�У����ݵ�һ�����ݣ�����ԭʼ�Ķ�ά����
		int[][] chessArray2 = new int[sparseArr2[0][0]][sparseArr2[0][1]];

		// 2����ȡϡ��������е����ݣ�����ֵ��ԭʼ��ά����
		for (int i = 1, len = sparseArr2.length; i < len; i++) {
			chessArray2[sparseArr2[i][0]][sparseArr2[i][1]] = sparseArr2[i][2];
		}

		// ����ָ���Ķ�ά����
		System.out.println("~~~~~~~~~~ϡ������ת����Ķ�ά����~~~~~~~");
		for (int[] r : chessArray2) {
			for (int data : r) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}
}
