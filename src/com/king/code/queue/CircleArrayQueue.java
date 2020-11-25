package com.king.code.queue;

// 笔记：
// 		循环队列的元素总数为 MaxSize - 1
// 		front 指向队列的第一个元素
//		rear 指向队列最后一个元素的后一个位置
//		队空：front = rear
//		队满：(rear + 1) % maxSize = front
//		队列的有效数据个数：(rear - front + maxSize) % maxSize
//		向队列添加元素（入队）：arr[rear] = num; rear = (rear + 1) % maxSize;
//		向队列取出元素（出队）：int value = arr[front]; front = (front + 1) % maxSize; return value;
//		遍历：for (int i = front; i < front + size(); i++)

public class CircleArrayQueue {

	private int maxSize; // 表示数组的最大容量
	private int front; // front指向队列的第一个元素，即arr[front]，front的初始值为0
	private int rear;// rear指向队列的最后一个元素的后一个位置，空出一个空间作为约定，rear的初始值为0
	private int[] arr;// 存放数据，模拟队列

	public CircleArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
	}

	// 判断队列是否满
	public boolean isFull() {
		return (rear + 1) % maxSize == front;
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		return rear == front;
	}

	// 添加数据到队列
	public void addQueue(int n) {
		// 判断队列是否满
		if (isFull()) {
			System.out.println("队列满，不能加入数据！！！");
			return;
		}
		// 直接将数据加入
		arr[rear] = n;
		// rear后移，这里必须考虑取模
		rear = (rear + 1) % maxSize;
	}

	// 获取队列的数据，出队列
	public int getQueue() {
		// 判断队列是否空
		if (isEmpty()) {
			// 抛异常
			throw new RuntimeException("队列空，不能获取数据");
		}

		// 分析：front是指向队列的第一个元素
		// 1、先把front的值保存到一个临时变量
		// 2、将front后移，并取模
		// 3、将临时变量返回
		int value = arr[front];
		front = (front + 1) % maxSize;
		return value;
	}

	// 显示队列所有数据
	public void showQueue() {
		// 遍历
		if (isEmpty()) {
			System.out.println("队列空，没有数据~~~");
			return;
		}
		for (int i = front; i < front + size(); i++) {
			System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
		}

	}

	// 获取当前队列的有效数据的个数
	private int size() {
		// rear = 1
		// front = 3
		// maxSize = 5
		return (rear - front + maxSize) % maxSize;
	}

	// 显示队列的头数据，注意：不是取出数据
	public int headQueue() {
		// 判断
		if (isEmpty()) {
			throw new RuntimeException("队列空的，没有数据");
		}
		return arr[front];
	}

}
