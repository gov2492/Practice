package com.custom.Singlelinkedlist;

public class Demo {
    public static void main(String[] args) {
        SingleLinkedList s=new SingleLinkedList();
        s.insertAtEnd(10);
        s.insertAtEnd(20);
        s.insertAtEnd(30);
        s.insertAtStart(40);
        s.insertAtStart(45);
        s.insertAtPosition(2,90);
        s.insertAtPosition(3,90);
        s.insertAtPosition(8,90);
        s.insertAtPosition(10,90);
        s.print();
        System.out.println(s.getSize());
        System.out.println(s.getSize());
    }

}
