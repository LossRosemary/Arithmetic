package com.king.code.linkedlist;

public class SingleLinkedList {
	// 先初始化一个头节点，头节点不要动，不存放具体数据
	private Node head = new Node(0, "");

	/**
	 * 遍历该链表
	 */
	public void listNode() {
		// 判断链表是否为空
		if (head.next == null) {
			System.out.println("该链表为空！！！");
			return;
		}

		Node temp = head.next;

		while (true) {
			if (temp == null) {
				break;
			}
			System.out.println(temp);
			temp = temp.next;
		}
	}

	/**
	 * 添加节点到单向链表最后
	 * 
	 * @param node
	 */
	public void addNode(Node node) {
		// 思路：当不考虑编号时，1、找到当前链表的最后节点；2、将最后这个节点指向新的节点

		// head节点不能动，需要一个辅助遍历的temp
		Node temp = head;

		// 遍历链表，指针指向最后（指针指向空）
		while (true) {
			// 指向链表的最后
			if (temp.next == null) {
				break;
			}
			// 如果没指向链表最后，那么指针后移
			temp = temp.next;
		}
		// 跳出循环后，temp 节点将指向链表最后，将这个节点的next指向新的节点
		temp.next = node;
	}

	/**
	 * 按照节点编号顺序，添加节点到单向链表
	 * 
	 * @param node
	 */
	public void addNodeByOrder(Node node) {

		// head节点不能动，需要一个辅助遍历的temp
		Node temp = head;

		// flag表示添加的编号是否存在
		boolean flag = false;

		// 遍历链表，指针指向最后（指针指向空）
		while (true) {
			// 指向链表的最后
			if (temp.next == null) {
				break;
			}
			// 位置已找到，就在temp的后面插入
			if (temp.next.no > node.no) {
				break;
			} else if (temp.next.no == node.no) {
				// 编号已存在
				flag = true;
				break;
			}
			// 指针后移，遍历该链表
			temp = temp.next;
		}
		if (flag) {
			System.out.printf("编号为%d的节点已存在，不能插入", node.no);
		} else {
			// node节点插入到temp的后面
			node.next = temp.next;
			temp.next = node;
		}
	}

	/**
	 * 根据编号来修改节点信息
	 * 
	 * @param node
	 */
	public void updateNode(Node node) {
		// 判断链表是否为空
		if (head.next == null) {
			System.out.println("该链表为空！！！");
			return;
		}

		Node temp = head.next;

		// flag表示要修改的编号是否存在
		boolean flag = false;

		// 遍历链表，指针指向最后（指针指向空）
		while (true) {
			// 指向链表的最后，遍历完成
			if (temp == null) {
				break;
			}
			// 要修改节点编号已找到
			if (temp.no == node.no) {
				flag = true;
				break;
			}
			// 指针后移，遍历该链表
			temp = temp.next;
		}
		if (flag) {
			temp.name = node.name;
		} else {
			System.out.printf("编号为%d的节点不存在！！！", node.no);
		}
	}

	/**
	 * 根据编号来删除节点
	 * 
	 * @param no
	 */
	public void deleteNode(int no) {
		// 思路：找到待删除节点的前一个节点
		if (head.next == null) {
			System.out.println("该链表为空！！！");
			return;
		}
		Node temp = head;

		// flag表示要删除的编号是否存在
		boolean flag = false;

		// 遍历链表，指针指向最后（指针指向空）
		while (true) {
			// 指向链表的最后，遍历完成
			if (temp.next == null) {
				break;
			}
			// 要删除的节点编号已找到
			if (temp.next.no == no) {
				flag = true;
				break;
			}
			// 指针后移，遍历该链表
			temp = temp.next;
		}
		if (flag) {
			temp.next = temp.next.next;
		} else {
			System.out.printf("编号为%d的节点不存在！！！", no);
		}
	}

}
