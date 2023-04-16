package com.javase.arry;
//数组模拟栈数据结构
public class ArrayStack {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push(2);
        ms.push(3);
        ms.push(6);
        ms.push(7);
        ms.print();
        ms.pop();
        ms.print();
    }
}
class MyStack {
    private Object[] elements;  //存储栈内任何引用型数据类型
    private int index = 0;
    public MyStack() {
        elements = new Object[10];
    }
    public MyStack(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object o) {    //压栈操作
        if (index >= 50) {
            System.out.println("非法，栈满了！！");
            return;
        }
        else {
            elements[index] = o;
            System.out.println("元素"+elements[index]+"被压入栈了");
            ++index;
        }
    }
    public Object pop() {   //弹栈操作
        if (elements.length == 0) {
            System.out.println("空栈，非法！！！");
            return null;
        }
        else {
            --index;
            System.out.println("元素"+elements[index]+"被弹出栈了");
            return elements[index];
        }
    }
    public void print() {   //打印栈元素
        if (elements.length == 0) {
            System.out.println("空栈！");
            return ;
        }
        else {
            System.out.println("由栈顶到栈底输出元素：");
            for (int i = index-1; i >= 0; i--) {
                System.out.print(elements[i]+" ");
                System.out.println();
            }
        }
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}