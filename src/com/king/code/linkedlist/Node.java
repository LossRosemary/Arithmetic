package com.king.code.linkedlist;

// 每个 Node 对象就是一个节点
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
		return "Node: [no=" + no + ", name=" + name + "]";
	}

}
