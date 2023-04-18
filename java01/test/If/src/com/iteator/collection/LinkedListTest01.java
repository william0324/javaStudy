package com.iteator.collection;

import sun.awt.image.ImageWatched;

public class LinkedListTest01 {
    public static void main(String[] args) {
        Link link = new Link();
        link.addFirst(1);
        link.addFirst(2);
        link.addFirst(3);
        link.addFirst(4);
        link.display();
        link.addLast(1);
        link.addLast(2);
        link.addLast(3);
        link.addLast(4);
        link.display();
        System.out.println(link.getSize());
        link.add(1,100);
        link.display();
    }
}
class Node {
    Object element; //存储的数据
    Node next;  //下一个节点的内存地址
    public Node() {}

    public Node(Object element) {
        this.element = element;
    }
}
class Link {
    //头结点
    public Node header = null;
    //创建列表
    //头插法
    public void addFirst(Object element) {
        Node node = new Node(element);
        node.next = this.header;
        this.header = node;
    }
    //尾插法
    public void addLast(Object element) {
        Node node = new Node(element);
        if (header == null) {
            header = node;
        } else {
            Node cur = header;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //打印
    public void display() {
        Node cur = header;
        while (cur != null) {
            System.out.print(cur.element + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //得到长度
    public int getSize() {
        int count = 0;
        Node cur = header;
        while (cur != null) {
            cur = cur.next;
            ++count;
        }
        return count;
    }
    //增
    public void add(int index,Object element) {
        if (index < 0 || index > getSize()) {
            System.out.println("下标不合法！！");
            return;
        } else if (index == 0) {
            addFirst(element);  //头插
            return;
        } else if (index == getSize()) {
            addLast(element);   //尾插
            return;
        }
        int i = 1;
        Node cur = header;
        //找到插入的前面位置
        while (i != index) {
            cur = cur.next;
            i++;
        }

        Node cur1 =new Node(element);
        cur1.next = cur.next;
        cur.next = cur1;
    }
    //删
    public void remove(Object obj) {

    }
    //改
    public void modify(Object newObj) {

    }
    //查
    public int find(Object obj) {
        return 1;
    }
}