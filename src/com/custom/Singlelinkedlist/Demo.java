package com.custom.Singlelinkedlist;

public class Demo {
    public static void main(String[] args) {
        SingleLinkedList s=new SingleLinkedList();
        s.insertAtEnd(10);
        s.insertAtEnd(20);
        s.insertAtEnd(30);
        s.insertAtStart(40);
        s.insertAtStart(45);
        s.print();
    }

}
