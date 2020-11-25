package com.king.code.queue;

// �ʼǣ�
// 		ѭ�����е�Ԫ������Ϊ MaxSize - 1
// 		front ָ����еĵ�һ��Ԫ��
//		rear ָ��������һ��Ԫ�صĺ�һ��λ��
//		�ӿգ�front = rear
//		������(rear + 1) % maxSize = front
//		���е���Ч���ݸ�����(rear - front + maxSize) % maxSize
//		��������Ԫ�أ���ӣ���arr[rear] = num; rear = (rear + 1) % maxSize;
//		�����ȡ��Ԫ�أ����ӣ���int value = arr[front]; front = (front + 1) % maxSize; return value;
//		������for (int i = front; i < front + size(); i++)

public class CircleArrayQueue {

	private int maxSize; // ��ʾ������������
	private int front; // frontָ����еĵ�һ��Ԫ�أ���arr[front]��front�ĳ�ʼֵΪ0
	private int rear;// rearָ����е����һ��Ԫ�صĺ�һ��λ�ã��ճ�һ���ռ���ΪԼ����rear�ĳ�ʼֵΪ0
	private int[] arr;// ������ݣ�ģ�����

	public CircleArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
	}

	// �ж϶����Ƿ���
	public boolean isFull() {
		return (rear + 1) % maxSize == front;
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
		// ֱ�ӽ����ݼ���
		arr[rear] = n;
		// rear���ƣ�������뿼��ȡģ
		rear = (rear + 1) % maxSize;
	}

	// ��ȡ���е����ݣ�������
	public int getQueue() {
		// �ж϶����Ƿ��
		if (isEmpty()) {
			// ���쳣
			throw new RuntimeException("���пգ����ܻ�ȡ����");
		}

		// ������front��ָ����еĵ�һ��Ԫ��
		// 1���Ȱ�front��ֵ���浽һ����ʱ����
		// 2����front���ƣ���ȡģ
		// 3������ʱ��������
		int value = arr[front];
		front = (front + 1) % maxSize;
		return value;
	}

	// ��ʾ������������
	public void showQueue() {
		// ����
		if (isEmpty()) {
			System.out.println("���пգ�û������~~~");
			return;
		}
		for (int i = front; i < front + size(); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
		}

	}

	// ��ȡ��ǰ���е���Ч���ݵĸ���
	private int size() {
		// rear = 1
		// front = 3
		// maxSize = 5
		return (rear - front + maxSize) % maxSize;
	}

	// ��ʾ���е�ͷ���ݣ�ע�⣺����ȡ������
	public int headQueue() {
		// �ж�
		if (isEmpty()) {
			throw new RuntimeException("���пյģ�û������");
		}
		return arr[front];
	}

}
