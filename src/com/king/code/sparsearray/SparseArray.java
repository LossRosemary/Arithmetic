package com.king.code.sparsearray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//	二维数组 --> 稀疏数组的思路 
//		1. 遍历原始的二维数组，得到有效数据的个数 sum 
//		2. 根据 sum ，就可以创建稀疏数组int[sum + 1][3]  sparseArr  
//		3. 将二维数组的有效数据数据存入到稀疏数组

//	稀疏数组 --> 原始的二维数组的思路 
//		1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组 
//		2.在读取稀疏数组后几行的数据，并赋给原始的二维数组即可

public class SparseArray {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("sparseArray.txt"));
		BufferedReader br = new BufferedReader(new FileReader("sparseArray.txt"));

		// 创建一个原始的二维数组
		int[][] chessArray1 = new int[11][11];
		// 0：没有棋子；1：表示黑子；2：表示蓝子
		chessArray1[1][2] = 1;
		chessArray1[2][3] = 2;
		chessArray1[4][5] = 2;
		// System.out.println(chessArray1.length);
		// 输出原始二维数组
		System.out.println("~~~~~~原始二维数组~~~~~~");
		for (int[] row : chessArray1) {
			for (int data : row) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}

		// 二维数组 ---- > 稀疏数组
		// 1、先遍历数组，得到非0数据的个数
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArray1[i][j] != 0) {
					sum++;
				}
			}
		}

		// 2、创建对应的稀疏数组，并赋值
		int[][] sparseArr = new int[sum + 1][3];
		sparseArr[0][0] = chessArray1.length;
		sparseArr[0][1] = chessArray1[0].length;
		sparseArr[0][2] = sum;

		// 3 、遍历二维数组，将数据存放到稀疏数组中
		int count = 0; // 用于记录第几个非0数据
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
		System.out.println("~~~~~~~~~~稀疏数组~~~~~~~~~~~~~~");
		// 输出稀疏数组
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

		// 从文件中读取稀疏数组
		String line = null;
		int row = 0;

		// 创建一个空的稀疏数组
		int[][] sparseArr2 = new int[4][3];

		while ((line = br.readLine()) != null) {
			String[] temp = line.split("\t");
			for (int i = 0; i < temp.length; i++) {
				sparseArr2[row][i] = Integer.parseInt(temp[i]);
			}
			row++;
		}

		// 稀疏数组 ---- > 二维数组
		// 1、读取稀疏数组的第一行，根据第一行数据，创建原始的二维数组
		int[][] chessArray2 = new int[sparseArr2[0][0]][sparseArr2[0][1]];

		// 2、读取稀疏数组后几行的数据，并赋值给原始二维数组
		for (int i = 1, len = sparseArr2.length; i < len; i++) {
			chessArray2[sparseArr2[i][0]][sparseArr2[i][1]] = sparseArr2[i][2];
		}

		// 输出恢复后的二维数组
		System.out.println("~~~~~~~~~~稀疏数组转化后的二维数组~~~~~~~");
		for (int[] r : chessArray2) {
			for (int data : r) {
				System.out.printf("%d\t", data);
			}
			System.out.println();
		}
	}
}
