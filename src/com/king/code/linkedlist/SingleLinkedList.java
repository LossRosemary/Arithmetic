package com.king.code.linkedlist;

public class SingleLinkedList {
	// 先初始化一个头节点，头节点不要动，不存放具体数据
	private Node head = new Node(0, "", "");

	// 添加节点到单向链表
	// 思路：当不考虑编号时，1、找到当前链表的最后节点；2、将最后这个节点指向新的节点
	public void addNode(Node node) {
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
		node = temp.next;
	}

	public void addNodeByOrder(Node node) {

		// head节点不能动，需要一个辅助遍历的temp
		Node temp = head;

		Boolean flag = false;

		// 遍历链表，指针指向最后（指针指向空）
		while (true) {
			// 指向链表的最后
			if (temp.next == null) {
				break;
			}
			if (temp.next.no > node.no) {
				break;
			} else if (temp.next.no == node.no) {
				flag = true;
				break;
			}
			// 如果没指向链表最后，那么指针后移
			temp = temp.next;
		}
		if (flag) {
			System.out.printf("准备插入的编号%d已存在，不能插入", node.no);
		} else {
			node.next = temp.next;
			temp.next = node;
		}
		// 跳出循环后，temp 节点将指向链表最后，将这个节点的next指向新的节点
		node = temp.next;
	}
}
