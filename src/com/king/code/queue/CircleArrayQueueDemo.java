package com.king.code.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {
	public static void main(String[] args) {
		// 创建一个队列
		CircleArrayQueue queue = new CircleArrayQueue(4); // 其队列的有效数据最大是3

		char key = ' '; // 接收用户输入
		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		// 输出一个菜单
		while (loop) {

			System.out.println("s(show):显示队列");
			System.out.println("e(exit):退出程序");
			System.out.println("a(add):添加数据到队列");
			System.out.println("g(get):从队列取出数据");
			System.out.println("h(head):查看队列头的数据");

			key = sc.next().charAt(0); // 接收一个字符

			switch (key) {

			case 's': // 显示队列
				queue.showQueue();
				System.out.println();
				break;

			case 'a': // 添加数据到队列
				System.out.println("输入一个数：");
				int value = sc.nextInt();
				queue.addQueue(value);
				System.out.println();
				break;

			case 'g': // 从队列取出数据
				try {
					int result = queue.getQueue();
					System.out.printf("取出的数据是%d\n\n\r", result);
					queue.showQueue();
					System.out.println();
				} catch (Exception e) {
					System.out.println(e.getMessage() + "\n\r");
				}
				break;

			case 'h': // 查看队列头的数据
				try {
					int result = queue.headQueue();
					System.out.printf("队列头的数据是%d\n\n\r", result);
				} catch (Exception e) {
					System.out.println(e.getMessage() + "\n\r");
				}
				break;

			case 'e': // 退出程序
				sc.close();
				loop = false;
				break;

			default:
				break;
			}

		}
		System.out.println("程序退出！");
	}
}
