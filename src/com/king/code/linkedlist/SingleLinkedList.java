package com.king.code.linkedlist;

public class SingleLinkedList {
	// �ȳ�ʼ��һ��ͷ�ڵ㣬ͷ�ڵ㲻Ҫ��������ž�������
	private Node head = new Node(0, "");

	/**
	 * ����������
	 */
	public void listNode() {
		// �ж������Ƿ�Ϊ��
		if (head.next == null) {
			System.out.println("������Ϊ�գ�����");
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
	 * ��ӽڵ㵽�����������
	 * 
	 * @param node
	 */
	public void addNode(Node node) {
		// ˼·���������Ǳ��ʱ��1���ҵ���ǰ��������ڵ㣻2�����������ڵ�ָ���µĽڵ�

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
		temp.next = node;
	}

	/**
	 * ���սڵ���˳����ӽڵ㵽��������
	 * 
	 * @param node
	 */
	public void addNodeByOrder(Node node) {

		// head�ڵ㲻�ܶ�����Ҫһ������������temp
		Node temp = head;

		// flag��ʾ��ӵı���Ƿ����
		boolean flag = false;

		// ��������ָ��ָ�����ָ��ָ��գ�
		while (true) {
			// ָ����������
			if (temp.next == null) {
				break;
			}
			// λ�����ҵ�������temp�ĺ������
			if (temp.next.no > node.no) {
				break;
			} else if (temp.next.no == node.no) {
				// ����Ѵ���
				flag = true;
				break;
			}
			// ָ����ƣ�����������
			temp = temp.next;
		}
		if (flag) {
			System.out.printf("���Ϊ%d�Ľڵ��Ѵ��ڣ����ܲ���", node.no);
		} else {
			// node�ڵ���뵽temp�ĺ���
			node.next = temp.next;
			temp.next = node;
		}
	}

	/**
	 * ���ݱ�����޸Ľڵ���Ϣ
	 * 
	 * @param node
	 */
	public void updateNode(Node node) {
		// �ж������Ƿ�Ϊ��
		if (head.next == null) {
			System.out.println("������Ϊ�գ�����");
			return;
		}

		Node temp = head.next;

		// flag��ʾҪ�޸ĵı���Ƿ����
		boolean flag = false;

		// ��������ָ��ָ�����ָ��ָ��գ�
		while (true) {
			// ָ���������󣬱������
			if (temp == null) {
				break;
			}
			// Ҫ�޸Ľڵ������ҵ�
			if (temp.no == node.no) {
				flag = true;
				break;
			}
			// ָ����ƣ�����������
			temp = temp.next;
		}
		if (flag) {
			temp.name = node.name;
		} else {
			System.out.printf("���Ϊ%d�Ľڵ㲻���ڣ�����", node.no);
		}
	}

	/**
	 * ���ݱ����ɾ���ڵ�
	 * 
	 * @param no
	 */
	public void deleteNode(int no) {
		// ˼·���ҵ���ɾ���ڵ��ǰһ���ڵ�
		if (head.next == null) {
			System.out.println("������Ϊ�գ�����");
			return;
		}
		Node temp = head;

		// flag��ʾҪɾ���ı���Ƿ����
		boolean flag = false;

		// ��������ָ��ָ�����ָ��ָ��գ�
		while (true) {
			// ָ���������󣬱������
			if (temp.next == null) {
				break;
			}
			// Ҫɾ���Ľڵ������ҵ�
			if (temp.next.no == no) {
				flag = true;
				break;
			}
			// ָ����ƣ�����������
			temp = temp.next;
		}
		if (flag) {
			temp.next = temp.next.next;
		} else {
			System.out.printf("���Ϊ%d�Ľڵ㲻���ڣ�����", no);
		}
	}

}
