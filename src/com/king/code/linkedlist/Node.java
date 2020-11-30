package com.king.code.linkedlist;

// ÿ�� Node �������һ���ڵ�
public class Node {

	public int no; // ���
	public String name;
	public Node next; // ָ��

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
