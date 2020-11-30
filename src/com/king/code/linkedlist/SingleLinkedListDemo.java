package com.king.code.linkedlist;

public class SingleLinkedListDemo {
	public static void main(String[] args) {

		Node node1 = new Node(1, "A节点");
		Node node2 = new Node(2, "B节点");
		Node node3 = new Node(3, "C节点");
		Node node4 = new Node(4, "D节点");
		Node node5 = new Node(5, "E节点");

		SingleLinkedList singleLinkedList = new SingleLinkedList();

//		singleLinkedList.addNode(node5);
//		singleLinkedList.addNode(node2);
//		singleLinkedList.addNode(node4);
//		singleLinkedList.addNode(node3);
//		singleLinkedList.addNode(node1);

		singleLinkedList.addNodeByOrder(node5);
		singleLinkedList.addNodeByOrder(node2);
		singleLinkedList.addNodeByOrder(node4);
		singleLinkedList.addNodeByOrder(node3);
		singleLinkedList.addNodeByOrder(node1);

		singleLinkedList.listNode();

		System.out.println("----------------------------");

		Node u_Node = new Node(3, "R节点");
		singleLinkedList.updateNode(u_Node);

		singleLinkedList.listNode();

		System.out.println("----------------------------");

		singleLinkedList.deleteNode(5);

		singleLinkedList.listNode();
	}

}
