package com.king.code.linkedlist;

// 每个 Node 对象就是一个节点

// 笔记：
// 		头指针：头指针是指链表指向第一个结点的指针，若链表有头结点，则头指针就是指向链表头结点的指针；无论链表是否为空，头指针均不为空。头指针是链表的必要元素。
// 		头结点：头结点是为了操作的统一与方便而设立的，放在第一个元素结点之前，其数据域一般无意义，当然也可存储如链表长度等附加信息
//		尾指针：相对于头指针而言，形式与头指针相同，内容指向链表的最后一个节点
public class Node {

	public int no; // 编号
	public String name;
	public Node next; // 指针

	public Node(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node: [No=" + no + ", Name=" + name + "]";
	}

}
