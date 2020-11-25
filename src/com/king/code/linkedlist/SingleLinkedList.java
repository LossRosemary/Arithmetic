package com.king.code.linkedlist;

public class SingleLinkedList {
	// �ȳ�ʼ��һ��ͷ�ڵ㣬ͷ�ڵ㲻Ҫ��������ž�������
	private Node head = new Node(0, "", "");

	// ��ӽڵ㵽��������
	// ˼·���������Ǳ��ʱ��1���ҵ���ǰ��������ڵ㣻2�����������ڵ�ָ���µĽڵ�
	public void addNode(Node node) {
		// head�ڵ㲻�ܶ�����Ҫһ������������temp
		Node temp = head;

		// ��������ָ��ָ�����ָ��ָ��գ�
		while (true) {
			// ָ����������
			if (temp.next == null) {
				break;
			}
			// ���ûָ�����������ôָ�����
			temp = temp.next;
		}
		// ����ѭ����temp �ڵ㽫ָ��������󣬽�����ڵ��nextָ���µĽڵ�
		node = temp.next;
	}

	public void addNodeByOrder(Node node) {

		// head�ڵ㲻�ܶ�����Ҫһ������������temp
		Node temp = head;

		Boolean flag = false;

		// ��������ָ��ָ�����ָ��ָ��գ�
		while (true) {
			// ָ����������
			if (temp.next == null) {
				break;
			}
			if (temp.next.no > node.no) {
				break;
			} else if (temp.next.no == node.no) {
				flag = true;
				break;
			}
			// ���ûָ�����������ôָ�����
			temp = temp.next;
		}
		if (flag) {
			System.out.printf("׼������ı��%d�Ѵ��ڣ����ܲ���", node.no);
		} else {
			node.next = temp.next;
			temp.next = node;
		}
		// ����ѭ����temp �ڵ㽫ָ��������󣬽�����ڵ��nextָ���µĽڵ�
		node = temp.next;
	}
}
