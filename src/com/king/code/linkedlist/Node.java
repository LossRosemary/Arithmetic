package com.king.code.linkedlist;

// ÿ�� Node �������һ���ڵ�

// �ʼǣ�
// 		ͷָ�룺ͷָ����ָ����ָ���һ������ָ�룬��������ͷ��㣬��ͷָ�����ָ������ͷ����ָ�룻���������Ƿ�Ϊ�գ�ͷָ�����Ϊ�ա�ͷָ��������ı�ҪԪ�ء�
// 		ͷ��㣺ͷ�����Ϊ�˲�����ͳһ�뷽��������ģ����ڵ�һ��Ԫ�ؽ��֮ǰ����������һ�������壬��ȻҲ�ɴ洢�������ȵȸ�����Ϣ
//		βָ�룺�����ͷָ����ԣ���ʽ��ͷָ����ͬ������ָ����������һ���ڵ�
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
		return "Node: [No=" + no + ", Name=" + name + "]";
	}

}
