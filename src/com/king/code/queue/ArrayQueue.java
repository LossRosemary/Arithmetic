package com.king.code.queue;

//�ʼǣ�
//		ѭ�����е�Ԫ������Ϊ maxSize
//		front ָ����еĵ�һ��Ԫ�ص�ǰһ��λ��
//		rear ָ��������һ��Ԫ��
//		�ӿգ�front = rear
//		������rear = maxSize - 1;

//		��������Ԫ�أ���ӣ���rear++; arr[rear] = n;
//		�����ȡ��Ԫ�أ����ӣ���front++; return arr[front];
//		������for (int i = front + 1; i < arr.length; i++)

public class ArrayQueue {

	// ʹ������ģ����� --- ��дһ��ArrayQueue��
	private int maxSize; // ��ʾ�����������
	private int front; // ����ͷ
	private int rear; // ����β
	private int[] arr; // ���������ڴ������

	// �������еĹ�����
	public ArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = -1; // ָ�����ͷ����front��ָ�����ͷ��һ��λ��
		rear = -1; // ָ�����β����ָ�����β�����ݣ������Ƕ������һ��λ�ã�
	}

	// �ж϶����Ƿ���
	public boolean isFull() {
		return rear == maxSize - 1;
	}

	// �ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return rear == front;
	}

	// ������ݵ�����
	public void addQueue(int n) {
		// �ж϶����Ƿ���
		if (isFull()) {
			System.out.println("�����������ܼ������ݣ�����");
			return;
		}
		rear++; // rear����
		arr[rear] = n;
	}

	// ��ȡ���е����ݣ�������
	public int getQueue() {
		// �ж϶����Ƿ��
		if (isEmpty()) {
			// ���쳣
			throw new RuntimeException("���пգ����ܻ�ȡ����");
		}

		front++; // front����
		return arr[front];
	}

	// ��ʾ������������
	public void showQueue() {
		// ����
		if (isEmpty()) {
			System.out.println("���пգ�û������~~~");
		}
		for (int i = front + 1; i < arr.length; i++) {
			System.out.printf("arr[%d]=%d\n", i, arr[i]);
		}

	}

	// ��ʾ���е�ͷ���ݣ�ע�⣺����ȡ������
	public int headQueue() {
		// �ж�
		if (isEmpty()) {
			throw new RuntimeException("���пյģ�û������");
		}
		return arr[front + 1];
	}

}
