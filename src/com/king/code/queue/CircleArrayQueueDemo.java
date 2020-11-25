package com.king.code.queue;

import java.util.Scanner;

public class CircleArrayQueueDemo {
	public static void main(String[] args) {
		// ����һ������
		CircleArrayQueue queue = new CircleArrayQueue(4); // ����е���Ч���������3

		char key = ' '; // �����û�����
		Scanner sc = new Scanner(System.in);
		boolean loop = true;

		// ���һ���˵�
		while (loop) {

			System.out.println("s(show):��ʾ����");
			System.out.println("e(exit):�˳�����");
			System.out.println("a(add):������ݵ�����");
			System.out.println("g(get):�Ӷ���ȡ������");
			System.out.println("h(head):�鿴����ͷ������");

			key = sc.next().charAt(0); // ����һ���ַ�

			switch (key) {

			case 's': // ��ʾ����
				queue.showQueue();
				System.out.println();
				break;

			case 'a': // ������ݵ�����
				System.out.println("����һ������");
				int value = sc.nextInt();
				queue.addQueue(value);
				System.out.println();
				break;

			case 'g': // �Ӷ���ȡ������
				try {
					int result = queue.getQueue();
					System.out.printf("ȡ����������%d\n\n\r", result);
					queue.showQueue();
					System.out.println();
				} catch (Exception e) {
					System.out.println(e.getMessage() + "\n\r");
				}
				break;

			case 'h': // �鿴����ͷ������
				try {
					int result = queue.headQueue();
					System.out.printf("����ͷ��������%d\n\n\r", result);
				} catch (Exception e) {
					System.out.println(e.getMessage() + "\n\r");
				}
				break;

			case 'e': // �˳�����
				sc.close();
				loop = false;
				break;

			default:
				break;
			}

		}
		System.out.println("�����˳���");
	}
}
